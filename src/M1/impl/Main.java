package M1.impl;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Scanner;

import org.eclipse.emf.common.util.EList;

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

		EList<PortConfigurationRequis> p1ClientServer = configClientServer.portbindingtoconfigclientserver;
		EList<PortConfigurationFourni> p2ClientServer = configClientServer.portconfigclientservertobinding;
		EList<Binding> b1ClientServer = configClientServer.bindingclienttoconfigclientserver;
		EList<Binding> b2ClientServer = configClientServer.bindingconfigclientservertoclient;
		EList<Attachment> a1ClientServer = configClientServer.attachmentrpctoclient;
		EList<Attachment> a2ClientServer = configClientServer.attachmentservertorpc;
		EList<Attachment> a3ClientServer = configClientServer.attachmentclienttorpc;
		EList<Attachment> a4ClientServer = configClientServer.attachmentrpctoserver;
		configClientServer = new ConfigurationClientServerImpl(p1ClientServer, p2ClientServer, b1ClientServer, b2ClientServer, a1ClientServer, a2ClientServer, a3ClientServer, a4ClientServer);



		String pseudo = "";
		String motDePasse;
		Scanner in = new Scanner(System.in);
		int choice;
		boolean doingThings = true;

		while(!clientConnected) {
			// "veuillez entrer votre pseudo et mdp" dans la console
			System.out.println("Veuillez entrer votre pseudo");
			pseudo = in.nextLine();

			System.out.println("Veuillez entrer votre mot de passe");
			motDePasse = in.nextLine();
			boolean testMDP = server.testConnection(motDePasse);
			if(!testMDP) {
				while(!testMDP) {
					System.out.println("\nErreur : mot de passe incorrect. \nVeuillez rentrez votre mot de passe à nouveau.");
					testMDP = server.testConnection(motDePasse);
				}			
			}

			clientConnected = connectionManager.testConnection(database, pseudo, motDePasse);
			if(clientConnected) {
				System.out.println("Bienvenue " + pseudo + " !");
			}
			else {
				System.out.println("Erreur de saisie pour la connection. Veuillez rentrez vos informations à nouveau.\n");
			}
		}
		while(doingThings && clientConnected) {
			System.out.println("\nQue voulez vous faire ? (rentrez le numéro correspondant à l'action souhaitée)");
			System.out.println("	1-changer mon mdp");
			System.out.println("	2-changer ma value");
			System.out.println("	3-ajouter un nouveau client");
			System.out.println("	4-supprimer un client");
			System.out.println("	5-montrer tous les éléments de la database");
			System.out.println("	6-quitter l'exécution");
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
						System.out.println("La value doit forcément être un chiffre ou un nombre");
					}
				}
				database.add(newPseudo, newMDP, newValue);
				break;
			}
			case 4 : {
				System.out.println("Veuillez entrer le pseudo du client que vous souhaiter supprimer de la database : ");
				String p = in.nextLine();
				database.delete(p);
				break;
			}
			case 5 : {
				String dbAll = database.read();
				System.out.println("Voici le contenu de la DB : \n" + dbAll + "\n");
				break;
			}
			case 6 : {
				System.out.println("A bientôt !");
				doingThings = false;
				break;
			}
			default : {
				System.out.println("Le choix doit forcément être un chiffre entre 1 et 6 afin de correspoondre à l'un des possibilitées précédemment énoncées.");
				break;
			}
			}
		}
		in.close();
		arreterServeur(sSocket);		
	}

	public static void LancementServeur() {

		int port = 2380;		

		try {        	
			sSocket = new ServerSocket(port);
			System.out.println("Création du serveur avec le port numéro " + port);
			//s=sSocket.accept();
			
			
			PortBindingToServerImpl portbindingtoserver = new PortBindingToServerImpl();
			PortCMtoBindingImpl portcmtobinding = new PortCMtoBindingImpl();
			Binding bindingcmtoserver = new BindingCMtoServerImpl(portcmtobinding, portbindingtoserver);
			
			PortBindingToCMImpl portbindingtocm = new PortBindingToCMImpl();
			PortServerToBindingImpl portservertobinding = new PortServerToBindingImpl();
			Binding bindingservertocm = new BindingServerToCMImpl(portbindingtocm, portservertobinding);
			
			ArrayList<PortComposantFourni> portservertorpc = new ArrayList<PortComposantFourni>();
			
			ArrayList<PortComposantRequis> portrpctoserver = new ArrayList<PortComposantRequis>();
			
			PortSQLtoCMImpl portsqltocm = new PortSQLtoCMImpl();
			RoleSQLtoCMImpl rolesqltocm = new RoleSQLtoCMImpl();
			Attachment attachmentsqltocm = new AttachmentSQLtoCMImpl(portsqltocm, rolesqltocm);
			
			PortCMtoSQLImpl portcmtosql = new PortCMtoSQLImpl(); 
			RoleSQLfromCMImpl rolesqlfromcm = new RoleSQLfromCMImpl();
			Attachment attachmentcmtosql = new AttachmentCMtoSQLImpl(portcmtosql, rolesqlfromcm);
			
			PortSQLtoDBImpl portsqltodb = new PortSQLtoDBImpl();
			RoleSQLfromCMImpl rolesqltodb = new RoleSQLfromCMImpl();
			Attachment attachmentsqltodb = new AttachmentSQLtoDBImpl(portsqltodb,rolesqltodb);	
			
			PortDBtoSQLImpl portdbtosql = new PortDBtoSQLImpl();		
			RoleSQLfromDBImpl rolesqlfromdb = new RoleSQLfromDBImpl();
			Attachment attachmentdbtosql = new AttachmentDBtoSQLImpl(portdbtosql, rolesqlfromdb);	
			
			PortDBtoSQImpl portdbtosq = new PortDBtoSQImpl();			
			RoleSQfromDBImpl rolesqfromdb = new RoleSQfromDBImpl();
			Attachment attachmentdbtosq = new AttachmentDBtoSQImpl(portdbtosq, rolesqfromdb);	
			
			PortSQtoDBImpl portsqtodb = new PortSQtoDBImpl();
			RoleSQtoDBImpl rolesqtodb = new RoleSQtoDBImpl();
			Attachment attachmentsqtodb = new AttachmentSQtoDBImpl(portsqtodb, rolesqtodb);
			
			PortSQtoSMImpl portsqtosm = new PortSQtoSMImpl();
			RoleSQtoSMImpl rolesqtosm = new RoleSQtoSMImpl();
			Attachment attachmentsqtosm = new AttachmentSQtoSMImpl(portsqtosm, rolesqtosm);
			
			PortSMtoSQImpl portsmtosq = new PortSMtoSQImpl();
			RoleSQfromSMImpl rolesqfromsm = new RoleSQfromSMImpl();
			Attachment attachmentsmtosq = new AttachmentSMtoSQImpl(portsmtosq, rolesqfromsm);
			
			PortCRtoCMImpl portcrtocm = new PortCRtoCMImpl();
			RoleCRtoCMImpl rolecrtocm = new RoleCRtoCMImpl();
			Attachment attachmentcrtocm = new AttachmentCRtoCMImpl(portcrtocm, rolecrtocm);
			
			PortCMtoCRImpl portcmtocr = new PortCMtoCRImpl();
			RoleCRfromCMImpl rolecrfromcm = new RoleCRfromCMImpl();
			Attachment attachmentcmtocr = new AttachmentCMtoCRImpl(portcmtocr, rolecrfromcm);
			
			PortSMtoCRImpl portsmtocr = new PortSMtoCRImpl();
			RoleCRfromSMImpl rolecrfromsm = new RoleCRfromSMImpl();
			Attachment attachmentsmtocr = new AttachmentSMtoCRImpl(portsmtocr, rolecrfromsm);
			
			PortCRtoSMImpl portcrtosm = new PortCRtoSMImpl();
			RoleCRtoSMImpl rolecrtosm = new RoleCRtoSMImpl();
			Attachment attachmentcrtosm = new AttachmentCRtoSMImpl(portcrtosm, rolecrtosm);
												
			
			server = new ServerConfigurationImpl(bindingcmtoserver, bindingservertocm, 
					portservertorpc, portrpctoserver, portservertobinding, portbindingtoserver, 
					attachmentsqltocm, attachmentcmtosql, attachmentsqltodb, attachmentdbtosql, attachmentdbtosq, 
					attachmentsqtodb, attachmentsqtosm, attachmentsmtosq, attachmentcrtocm, attachmentcmtocr, 
					attachmentsmtocr, attachmentcrtosm);
			
			database = new DatabaseImpl(portdbtosql, portsqltodb, portdbtosq, portsqtodb);
			
			
			connectionManager = new ConnectionManagerImpl(portsqltocm, portcmtosql, portbindingtocm, portcmtobinding, portcrtocm, portcmtocr);
			
			
			securityManager = new SecurityManagerImpl(portsmtosq, portsqtosm, portcrtosm, portsmtocr);

		} catch (IOException e) {
			System.err.println("Le port " + port + " est déjà utilisé ! ");
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
