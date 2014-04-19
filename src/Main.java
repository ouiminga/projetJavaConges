/**
 * 
 */

/**
 * @author Ouiminga
 *
 */
import java.*; 
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
		
	public static void main(String[] args) {
		ArrayList<Client> listClient = new ArrayList<Client>();
		Scanner sc = new Scanner(System.in);
		String premierChoix =new String("");
		boolean bool;
		// TODO Auto-generated method stub
		while ((!premierChoix.equals("quitter"))&&(!premierChoix.equals("q")))
		{
			System.out.println("Bienvenue dans notre programme ");
			System.out.println("A tous moment  \"quitter\" ou \"q\" ");
			System.out.println("1 ou client si vous etes un client");
			System.out.println("2 ou gestionnaire si vous etes un gestionnaire");
			premierChoix = sc.nextLine();
			if((premierChoix.equals("1"))||(premierChoix.equals("client")))
			{
			do
			{
				System.out.println("Tapez 1 pour créer un compte client");
				System.out.println("Tapez 2 pour vous loguer");
				System.out.println("Tapez 3 pour Recherche un véhicule");
				System.out.println("Tapez 4 pour Louer un véhicule");
				premierChoix = sc.nextLine();
				
				switch (premierChoix)
    	        {
    	          case "1":
    	            {	
    	            	System.out.println("Création d'un compte client");
    	            	String id,password,nomNvoClient,prenomNvoClient,adresseNvoClient;
    					Client nvoCl;
    					System.out.println("Pour vous creer un compte client");
    					System.out.println("Entrez votre Nom de client");
    					nomNvoClient=sc.nextLine();
    					System.out.println("Entrez votre Prenom de client");
    					prenomNvoClient=sc.nextLine();
    					System.out.println("Entrez votre Adresse de client");
    					adresseNvoClient=sc.nextLine();
    					nvoCl=new Client(nomNvoClient,prenomNvoClient,adresseNvoClient);
    					listClient.add(nvoCl);
    					System.out.println("Choisissez votre identifiant/nom client");
    					id=sc.nextLine();
    					System.out.println("Choisissez votre mot de passe client");
    					password=sc.nextLine();
    					nvoCl.initLogin(id,password);
    					nvoCl.Login(id,password);
    	            };
    	            break;
    	          case "2":
    	            {
    	            	System.out.println("Log in");
    	            	String id;String password;
    					System.out.println("Entrez l'identifiant/nom");
    					id=sc.nextLine();
    					System.out.println("Entrez le mot de passe");
    					password=sc.nextLine();
    					//bool=leClientDansLaliste.Login(firstName,password);
    	            };
    	            break; 
    	          case "3":
    	        	  String typeVehicule,typeCarburant;
    	        	  System.out.println("Recherche un véhicule");
    	        	  System.out.println("Entrez le type de véhicule recherché");
    	        	  System.out.println("Voitures ,Utilitaires ou Deux roues ");
    	        	  typeVehicule=sc.nextLine();
    	        	  System.out.println("Entrez le type de carburant recherché");
    	        	  System.out.println("diesel,essence,hybride et électrique");
    	        	  typeCarburant=sc.nextLine();
    	        	switch (typeVehicule)
  	    	        {
  	    	          case "Voitures":
  	    	            {
  	    	            	switch (typeCarburant)
	    	    	        {
	    	    	          case "diesel":
	    	    	            {
	    	    	            	System.out.println("Les voitures à diesel");
	    	    	            	System.out.println(" berline\nmonospace\n");	    	      	        	  
	    	    	            };
	    	    	            break;
	    	    	          case "essence":
	    	    	            {
	    	    	            	System.out.println("Les voitures à essence");
	    	    	            	System.out.println(" Citadines\nberline\n4x4\n");	    	      	        	  
		    	    	        };
	    	    	            break; 
	    	    	          case "hybride":
	    	    	          	{
	    	    	            	System.out.println("Les voitures hybride");
	    	    	            	System.out.println("monospace\n");
	    	    	            };
	    	    		            break; 
	    	    	          case "électrique":
	    	    	          	{
	    	    	            	System.out.println("Les voitures électriques");
	    	    	            	System.out.println("véhicule électrique\n");
	    	    	            };
	    	    		            break;  
	    	    	          default:
	    	    	          	{
	    	    	            	System.out.println("Affichage de toutes les voitures");
	    	    	            	System.out.println(" Citadines\nberline\n4x4\nmonospace\nvéhicule électrique \n");
	    	    	            };           
	    	    	        }
  	    	            };
  	    	            break;
  	    	          case "Utilitaires":
  	    	            {
  	    	            	switch (typeCarburant)
	    	    	        {
	    	    	          case "diesel":
	    	    	            {
	    	    	            	System.out.println("Les Utilitaires à diesel");
	    	    	            	System.out.println("Camionnette\nVéhicule de société\n");
	    	    	            };
	    	    	            break;
	    	    	          case "essence":
	    	    	            {
	    	    	            	System.out.println("Les Utilitaires à essence");
	    	    	            	System.out.println("Camionnette\n");
	    	    	            	
	    	    	            };
	    	    	            break; 
	    	    	          case "hybride":
	    	    	          	{
	    	    	            	System.out.println("Les Utilitaires hybride");
	    	    	            	System.out.println("Camionnette\nVéhicule de société\n");
	    	    	            };
	    	    		            break; 
	    	    	          case "électrique":
	    	    	          	{
	    	    	            	System.out.println("Les Utilitaires électriques");
	    	    	            	System.out.println("Véhicule de société\n");
	    	    	            };
	    	    		            break;  
	    	    	          default:
	    	    	          	{
	    	    	            	System.out.println("Affichage de tous les Utilitaires");
	    	    	            	System.out.println("Camionnette\nVéhicule de société\n");
	    	    	            };           
	    	    	        }
  	    	            };
  	    	            break; 
  	    	          case "Deux roues":
  	    	          {
  	    	        	switch (typeCarburant)
    	    	        {
    	    	          case "diesel":
    	    	            {
    	    	            	System.out.println("Les Deux roues à diesel");
    	    	            	System.out.println("Aucun\n");
    	      	        	};
    	    	            break;
    	    	          case "essence":
    	    	            {
    	    	            	System.out.println("Les Deux roues à essence");
    	    	            	System.out.println("Moto\nscooter\n");
    	    	            };
    	    	            break; 
    	    	          case "hybride":
    	    	          	{
    	    	            	System.out.println("Les Deux roues hybride");
    	    	            	System.out.println("scooter\n");
    	    	            	
    	    	            };
    	    		            break; 
    	    	          case "électrique":
    	    	          	{
    	    	            	System.out.println("Les Deux roues électriques");
    	    	            	System.out.println("scooter électrique\n");
    	    	            };
    	    		            break;  
    	    	          default:
    	    	          	{
    	    	            	System.out.println("Affichage de tous les deux roues");
    	    	            	System.out.println("Moto\nscooter\nscooter électrique\n");
    	    	            };           
    	    	        }
  	    	          };
  	    		            break;  
  	    	          default:
  	    	          { /*Selectionner selon les carburant selman */
  	    	        	switch (typeCarburant)
    	    	        {
    	    	          case "diesel":
    	    	            {
    	    	            	System.out.println("Tous les vehicules à diesel");
    	    	            	System.out.println("berline\nmonospace\nCamionnette\nVéhicule de société\n");
    	    	            };
    	    	            break;
    	    	          case "essence":
    	    	            {
    	    	            	System.out.println("Tous les vehicules à essence");
    	    	            	System.out.println("Citadines\nberline\n4x4\nCamionnette\nMoto\nscooter\n");
    	    	            };
    	    	            break; 
    	    	          case "hybride":
    	    	          	{
    	    	            	System.out.println("Tous les vehicules hybride");
    	    	            	System.out.println("monospace\nCamionnette\nVéhicule de société\nscooter\n");
    	    	            };
    	    		            break; 
    	    	          case "électrique":
    	    	          	{
    	    	            	System.out.println("Tous les vehicules électriques");
    	    	            	System.out.println("véhicule électrique\nVéhicule de société\nscooter électrique\n");
    	    	            };
    	    		            break;  
    	    	          default:
    	    	          	{
    	    	            	System.out.println("Affichage de tous les vehicules");
    	    	            	System.out.println("Citadines, berline, 4x4, monospace, véhicule électrique\n"
    	    	            			+ "Camionnette, Véhicule de société\n"
    	    	            			+ "Moto, scooter, scooter électrique\n");
    	    	            };           
    	    	        }    	        	  
  	    	          };             
  	    	        }
    	        	  //Vehicule.rechercheTypeVehicule(typeVehicule,typeCarburant);
    		            break;
    	          case "4":
    	        	  System.out.println("Louer un véhicule");
    	        	  System.out.println("Pour louer un véhicule "
    	        	  					+ "vous devez avoir un "
    	        	  					+ "compte et vous loguer");
  		            /*Action*/;
  		            break;  
    	          default:
    	            /*Action*/;             
    	        }
			}while ((!premierChoix.equals("1"))&&(!premierChoix.equals("2"))&&(!premierChoix.equals("3"))&&(!premierChoix.equals("4")));
			}
			else
			{	if((premierChoix.equals("2"))||(premierChoix.equals("gestionnaire")))
				{
				//premierChoix=mainClient();
				}
			};
			
			
		}
		System.out.println("Fin du programme");
	}
}
