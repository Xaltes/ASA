package M1.impl;

import java.io.IOException;
import java.net.ServerSocket;
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
		
		database = new DatabaseImpl();
		
		Binding b1Server = server.bindingcmtoserver;
		Binding b2Server = server.bindingservertocm;
		EList<PortComposantFourni> p1Server = server.portservertorpc;
		EList<PortComposantRequis> p2Server = server.portrpctoserver;
		PortConfigurationRequis p3Server = server.portservertobinding;
		PortConfigurationFourni p4Server = server.portbindingtoserver;
		Attachment a1Server = server.attachmentsqltocm;
		Attachment a2Server = server.attachmentcmtosql;
		Attachment a3Server = server.attachmentsqltodb;
		Attachment a4Server = server.attachmentdbtosql;
		Attachment a5Server = server.attachmentdbtosq;
		Attachment a6Server = server.attachmentsqtodb;
		Attachment a7Server = server.attachmentsqtosm;
		Attachment a8Server = server.attachmentsmtosq;
		Attachment a9Server = server.attachmentcrtocm;
		Attachment a10Server = server.attachmentcmtocr;
		Attachment a11Server = server.attachmentsmtocr;
		Attachment a12Server = server.attachmentcrtosm;
		server = new ServerConfigurationImpl(b1Server, b2Server, p1Server, p2Server, p3Server, p4Server, a1Server, a2Server, a3Server, a4Server, a5Server, a6Server, a7Server, a8Server, a9Server, a10Server, a11Server, a12Server);
		
		String pseudo;
		String motDePasse;
		Scanner in = new Scanner(System.in);
		int choice;
		boolean doingThings = true;

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

		System.out.println("Bienvenue " + pseudo + " !");
		while(doingThings) {
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
