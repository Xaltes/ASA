package M1.impl;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Scanner;

import aSA.Attachment;
import aSA.Binding;
import aSA.PortComposantFourni;
import aSA.PortComposantRequis;
import aSA.PortConfigurationFourni;
import aSA.PortConfigurationRequis;

public class Main {

	private static ServerSocket sSocket;
	private static ConfigurationClientServerImpl configClientServer; 
	private static DatabaseImpl database;
	private static ServerConfigurationImpl server;
	private static ConnectionManagerImpl connectionManager;
	private static SecurityManagerImpl securityManager;

	public static boolean clientConnected = false;

	public static void main (String[] args) {
		// lancer le serveur
		LancementServeur();

		//creation configurationClientServer
		ArrayList<PortConfigurationFourni> portsbindingtoconfigclientserver = new ArrayList<PortConfigurationFourni>();
		ArrayList<PortConfigurationRequis> portsconfigclientservertobinding = new ArrayList<PortConfigurationRequis>();
		ArrayList<Binding> bindingsclienttoconfigclientserver = new ArrayList<Binding>();
		ArrayList<Binding> bindingsconfigclientservertoclient = new ArrayList<Binding>();
		ArrayList<Attachment> attachmentsrpctoclient = new ArrayList<Attachment>();
		ArrayList<Attachment> attachmentsservertorpc = new ArrayList<Attachment>();
		ArrayList<Attachment> attachmentsclienttorpc = new ArrayList<Attachment>();
		ArrayList<Attachment> attachmentsrpctoserver = new ArrayList<Attachment>();
		configClientServer = new ConfigurationClientServerImpl(portsbindingtoconfigclientserver, portsconfigclientservertobinding,
				bindingsclienttoconfigclientserver, bindingsconfigclientservertoclient, attachmentsrpctoclient, 
				attachmentsservertorpc,	attachmentsclienttorpc, attachmentsrpctoserver);

		//ajout des bindings et attachments pour les clients presents de base dans la BDD
		for(ClientImpl c : database.getClients()) {
			createAndAddLinks(c);
		}

		String pseudo = "";
		String motDePasse;
		Scanner in = new Scanner(System.in);
		int choice;
		boolean doingThings = true;
		boolean leaving = false;

		while(!leaving) {
			while(!clientConnected) {
				// "veuillez entrer votre pseudo et mdp" dans la console
				System.out.println("Veuillez entrer votre pseudo");
				pseudo = in.nextLine();

				System.out.println("Veuillez entrer votre mot de passe");
				motDePasse = in.nextLine();
				boolean testMDP = server.testConnection(motDePasse);
				if(!testMDP) {
					while(!testMDP) {
						System.out.println("\nErreur : mot de passe incorrect. \nVeuillez rentrez votre mot de passe � nouveau.");
						testMDP = server.testConnection(motDePasse);
					}			
				}

				clientConnected = connectionManager.testConnection(database, pseudo, motDePasse);
				if(clientConnected) {
					System.out.println("Bienvenue " + pseudo + " !");
				}
				else {
					System.out.println("Erreur de saisie pour la connection. Veuillez rentrez vos informations � nouveau.\n");
				}
			}
			while(clientConnected) {
				System.out.println("\nQue voulez vous faire ? (rentrez le num�ro correspondant � l'action souhait�e)");
				System.out.println("	1-changer mon mdp");
				System.out.println("	2-changer ma value");
				System.out.println("	3-ajouter un nouveau client");
				System.out.println("	4-supprimer un client");
				System.out.println("	5-montrer tous les �l�ments de la database");
				System.out.println("	6-d�connexion");
				System.out.println("	7-quitter l'ex�cution");
				choice = in.nextInt();
				in.nextLine();
				switch (choice){
				case 1 : {
					System.out.println("Veuillez rentrer un nouveau mot de passe : ");
					String newMDP = in.nextLine();
					database.update(pseudo, newMDP);
					break;
				}			
				case 2 : {
					System.out.println("Veuillez rentrer votre nouvelle value : ");
					int newValue = in.nextInt();
					in.nextLine();
					database.update(pseudo, newValue);
					break;
				}
				case 3 : {
					if(connectionManager.checkRights(securityManager, pseudo, "")) {
						System.out.println("Vous avez les droits pour faire �a !\n");
						System.out.println("Veuillez rentrer le pseudo du nouveau client : ");
						String newPseudo = in.nextLine();
						System.out.println("Veuillez rentrer le mot de passe du nouveau client : ");
						String newMDP = in.nextLine();
						System.out.println("Veuillez rentrer la value que vous voulez pour ce nouveau client : ");
						int newValue = 0;
						while(true) {
							try{
								newValue = in.nextInt();
								break;
							}
							catch(Exception e) {
								System.out.println("La value doit forc�ment �tre un chiffre ou un nombre");
							}
						}
						ClientImpl c = new ClientImpl(newPseudo, newMDP, newValue);
						database.add(newPseudo, newMDP, newValue);
						createAndAddLinks(c);
					}
					else {
						System.out.println("Vous n'avez pas les droits pour faire �a !!");
					}
					break;

				}
				case 4 : {
					if(connectionManager.checkRights(securityManager, pseudo, "")) {
						System.out.println("Vous avez les droits pour faire �a !\n");
						System.out.println("Veuillez entrer le pseudo du client que vous souhaiter supprimer de la database : ");
						String p = in.nextLine();
						database.delete(p);
					}
					else {
						System.out.println("Vous n'avez pas les droits pour faire �a !!");
					}
					break;
				}
				case 5 : {
					if(connectionManager.checkRights(securityManager, pseudo, "")) {
						System.out.println("Vous avez les droits pour faire �a !\n");
						String dbAll = database.read();
						System.out.println("Voici le contenu de la DB : \n" + dbAll + "\n");
					}
					else {
						System.out.println("Vous n'avez pas les droits pour faire �a !!");
					}
					break;
				}
				case 6 : {
					System.out.println("Merci de votre passage !!");
					clientConnected = false;
					System.out.println("\nNouvelle connexion.");
					break;
				}
				case 7 : {
					System.out.println("A bient�t !");
					clientConnected = false;
					leaving = true;
					break;
				}
				default : {
					System.out.println("Le choix doit forc�ment �tre un chiffre entre 1 et 6 afin de correspoondre � l'un des possibilit�es pr�c�demment �nonc�es.");
					break;
				}
				}
			}
		}
		in.close();
		arreterServeur(sSocket);		
	}

	public static void createAndAddLinks(ClientImpl c) {
		PortBindingToConfigClientServerImpl portbindingtoconfigclientserver = new PortBindingToConfigClientServerImpl();
		configClientServer.portbindingtoconfigclientserver.add(portbindingtoconfigclientserver);
		BindingClientToConfigClientServerImpl bindingclienttoconfigclientserver = new BindingClientToConfigClientServerImpl(portbindingtoconfigclientserver, c.portclienttobinding);
		configClientServer.addBindingclienttoconfigclientserver(bindingclienttoconfigclientserver);

		PortConfigClientServerToBindingImpl portconfigclientservertobinding = new PortConfigClientServerToBindingImpl();
		configClientServer.portconfigclientservertobinding.add(portconfigclientservertobinding);
		BindingConfigClientServerToClientImpl bindingconfigclientservertoclient = new BindingConfigClientServerToClientImpl(c.portbindingtoclient, portconfigclientservertobinding);
		configClientServer.addBindingconfigclientservertoclient(bindingconfigclientservertoclient);

		PortClienttoRPCImpl portclienttorpc = new PortClienttoRPCImpl();
		RoleRPCfromClientImpl rolerpcfromclient = new RoleRPCfromClientImpl();
		AttachmentClienttoRPCImpl attachmentclienttorpc = new AttachmentClienttoRPCImpl(portclienttorpc, rolerpcfromclient);
		configClientServer.attachmentclienttorpc.add(attachmentclienttorpc);				

		PortRPCtoServerImpl portrpctoserver = new PortRPCtoServerImpl();
		RoleRPCtoServerImpl rolerpctoserver = new RoleRPCtoServerImpl();
		AttachmentRPCtoServerImpl attachmentrpctoserver = new AttachmentRPCtoServerImpl(portrpctoserver, rolerpctoserver);
		configClientServer.attachmentrpctoserver.add(attachmentrpctoserver);	

		RPCConnectorClientServerImpl connectorClientServer = new RPCConnectorClientServerImpl(rolerpcfromclient, rolerpctoserver);
		configClientServer.connectors.add(connectorClientServer);

		PortServerToRPCImpl portservertorpc = new PortServerToRPCImpl();
		RoleRPCfromServerImpl rolerpcfromserver = new RoleRPCfromServerImpl();
		AttachmentServerToRPCImpl attachmentservertorpc = new AttachmentServerToRPCImpl(portservertorpc, rolerpcfromserver);
		configClientServer.attachmentservertorpc.add(attachmentservertorpc);

		PortRPCtoClientImpl portrpctoclient = new PortRPCtoClientImpl();
		RoleRPCtoClientImpl rolerpctoclient = new RoleRPCtoClientImpl();
		AttachmentRPCToClientImpl attachmentrpctoclient = new AttachmentRPCToClientImpl(portrpctoclient, rolerpctoclient);
		configClientServer.attachmentrpctoclient.add(attachmentrpctoclient);

		RPCConnectorServerClientImpl connectorServerClient = new RPCConnectorServerClientImpl(rolerpcfromclient, rolerpctoserver);
		configClientServer.connectors.add(connectorServerClient);		
	}

	public static void LancementServeur() {

		int port = 2380;		

		try {        	
			sSocket = new ServerSocket(port);
			System.out.println("Cr�ation du serveur avec le port num�ro " + port);
			//s=sSocket.accept();

			PortBindingToServerImpl portbindingtoserver = new PortBindingToServerImpl();
			PortCMtoBindingImpl portcmtobinding = new PortCMtoBindingImpl();
			Binding bindingcmtoserver = new BindingCMtoServerImpl(portcmtobinding, portbindingtoserver);

			PortBindingToCMImpl portbindingtocm = new PortBindingToCMImpl();
			PortServerToBindingImpl portservertobinding = new PortServerToBindingImpl();
			Binding bindingservertocm = new BindingServerToCMImpl(portbindingtocm, portservertobinding);

			ArrayList<PortComposantFourni> portservertorpc = new ArrayList<PortComposantFourni>();

			ArrayList<PortComposantRequis> portrpctoserver = new ArrayList<PortComposantRequis>();

			PortDBtoSQLImpl portdbtosql = new PortDBtoSQLImpl();		
			RoleSQLfromDBImpl rolesqlfromdb = new RoleSQLfromDBImpl();
			Attachment attachmentdbtosql = new AttachmentDBtoSQLImpl(portdbtosql, rolesqlfromdb);

			PortSQLtoCMImpl portsqltocm = new PortSQLtoCMImpl();
			RoleSQLtoCMImpl rolesqltocm = new RoleSQLtoCMImpl();
			Attachment attachmentsqltocm = new AttachmentSQLtoCMImpl(portsqltocm, rolesqltocm);

			PortCMtoSQLImpl portcmtosql = new PortCMtoSQLImpl(); 
			RoleSQLfromCMImpl rolesqlfromcm = new RoleSQLfromCMImpl();
			Attachment attachmentcmtosql = new AttachmentCMtoSQLImpl(portcmtosql, rolesqlfromcm);

			PortSQLtoDBImpl portsqltodb = new PortSQLtoDBImpl();
			RoleSQLtoDBImpl rolesqltodb = new RoleSQLtoDBImpl();
			Attachment attachmentsqltodb = new AttachmentSQLtoDBImpl(portsqltodb,rolesqltodb);	

			PortSQtoDBImpl portsqtodb = new PortSQtoDBImpl();
			RoleSQtoDBImpl rolesqtodb = new RoleSQtoDBImpl();
			Attachment attachmentsqtodb = new AttachmentSQtoDBImpl(portsqtodb, rolesqtodb);

			PortSMtoSQImpl portsmtosq = new PortSMtoSQImpl();
			RoleSQfromSMImpl rolesqfromsm = new RoleSQfromSMImpl();
			Attachment attachmentsmtosq = new AttachmentSMtoSQImpl(portsmtosq, rolesqfromsm);

			PortSQtoSMImpl portsqtosm = new PortSQtoSMImpl();
			RoleSQtoSMImpl rolesqtosm = new RoleSQtoSMImpl();
			Attachment attachmentsqtosm = new AttachmentSQtoSMImpl(portsqtosm, rolesqtosm);

			PortDBtoSQImpl portdbtosq = new PortDBtoSQImpl();			
			RoleSQfromDBImpl rolesqfromdb = new RoleSQfromDBImpl();
			Attachment attachmentdbtosq = new AttachmentDBtoSQImpl(portdbtosq, rolesqfromdb);	

			PortCRtoSMImpl portcrtosm = new PortCRtoSMImpl();
			RoleCRtoSMImpl rolecrtosm = new RoleCRtoSMImpl();
			Attachment attachmentcrtosm = new AttachmentCRtoSMImpl(portcrtosm, rolecrtosm);

			PortCMtoCRImpl portcmtocr = new PortCMtoCRImpl();
			RoleCRfromCMImpl rolecrfromcm = new RoleCRfromCMImpl();
			Attachment attachmentcmtocr = new AttachmentCMtoCRImpl(portcmtocr, rolecrfromcm);

			PortSMtoCRImpl portsmtocr = new PortSMtoCRImpl();
			RoleCRfromSMImpl rolecrfromsm = new RoleCRfromSMImpl();
			Attachment attachmentsmtocr = new AttachmentSMtoCRImpl(portsmtocr, rolecrfromsm);

			PortCRtoCMImpl portcrtocm = new PortCRtoCMImpl();
			RoleCRtoCMImpl rolecrtocm = new RoleCRtoCMImpl();
			Attachment attachmentcrtocm = new AttachmentCRtoCMImpl(portcrtocm, rolecrtocm);

			server = new ServerConfigurationImpl(bindingcmtoserver, bindingservertocm, 
					portservertorpc, portrpctoserver, portservertobinding, portbindingtoserver, 
					attachmentsqltocm, attachmentcmtosql, attachmentsqltodb, attachmentdbtosql, attachmentdbtosq, 
					attachmentsqtodb, attachmentsqtosm, attachmentsmtosq, attachmentcrtocm, attachmentcmtocr, 
					attachmentsmtocr, attachmentcrtosm);

			SQLQueryConnectorOutImpl SQLQueryConnectorOut = new SQLQueryConnectorOutImpl(rolesqlfromdb, rolesqltocm);
			server.connectors.add(SQLQueryConnectorOut);

			SQLQueryConnectorInImpl SQLQueryConnectorIn = new SQLQueryConnectorInImpl(rolesqltodb, rolesqlfromcm);
			server.connectors.add(SQLQueryConnectorIn);

			SecurityQueryConnectorInImpl SecurityQueryConnectorIn = new SecurityQueryConnectorInImpl(rolesqtodb, rolesqfromsm);
			server.connectors.add(SecurityQueryConnectorIn);

			SecurityQueryConnectorOutImpl SecurityQueryConnectorOut = new SecurityQueryConnectorOutImpl(rolesqfromdb, rolesqtosm);
			server.connectors.add(SecurityQueryConnectorOut);

			ClearanceRequestConnectorInImpl ClearanceRequestConnectorIn = new ClearanceRequestConnectorInImpl(rolecrfromcm, rolecrtosm);
			server.connectors.add(ClearanceRequestConnectorIn);

			ClearanceRequestConnectorOutImpl ClearanceRequestConnectorOut = new ClearanceRequestConnectorOutImpl(rolecrtocm, rolecrfromsm);
			server.connectors.add(ClearanceRequestConnectorOut);

			database = new DatabaseImpl(portdbtosql, portsqltodb, portdbtosq, portsqtodb);			

			connectionManager = new ConnectionManagerImpl(portsqltocm, portcmtosql, portbindingtocm, portcmtobinding, portcrtocm, portcmtocr);

			securityManager = new SecurityManagerImpl(portsmtosq, portsqtosm, portcrtosm, portsmtocr);

		} catch (IOException e) {
			System.err.println("Le port " + port + " est d�j� utilis� ! ");
		}	
	}


	public static void arreterServeur(ServerSocket ss) {
		// Fermeture du socket
		try {
			ss.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
