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
				System.out.println("Tapez 1 pour cr�er un compte client");
				System.out.println("Tapez 2 pour vous loguer");
				System.out.println("Tapez 3 pour Recherche un v�hicule");
				System.out.println("Tapez 4 pour Louer un v�hicule");
				premierChoix = sc.nextLine();
				
				switch (premierChoix)
    	        {
    	          case "1":
    	            {	
    	            	System.out.println("Cr�ation d'un compte client");
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
    	        	  System.out.println("Recherche un v�hicule");
    	        	  System.out.println("Entrez le type de v�hicule recherch�");
    	        	  System.out.println("Voitures ,Utilitaires ou Deux roues ");
    	        	  typeVehicule=sc.nextLine();
    	        	  System.out.println("Entrez le type de carburant recherch�");
    	        	  System.out.println("diesel,essence,hybride et �lectrique");
    	        	  typeCarburant=sc.nextLine();
    	        	switch (typeVehicule)
  	    	        {
  	    	          case "Voitures":
  	    	            {
  	    	            	switch (typeCarburant)
	    	    	        {
	    	    	          case "diesel":
	    	    	            {
	    	    	            	System.out.println("Les voitures � diesel");
	    	    	            	System.out.println(" berline\nmonospace\n");	    	      	        	  
	    	    	            };
	    	    	            break;
	    	    	          case "essence":
	    	    	            {
	    	    	            	System.out.println("Les voitures � essence");
	    	    	            	System.out.println(" Citadines\nberline\n4x4\n");	    	      	        	  
		    	    	        };
	    	    	            break; 
	    	    	          case "hybride":
	    	    	          	{
	    	    	            	System.out.println("Les voitures hybride");
	    	    	            	System.out.println("monospace\n");
	    	    	            };
	    	    		            break; 
	    	    	          case "�lectrique":
	    	    	          	{
	    	    	            	System.out.println("Les voitures �lectriques");
	    	    	            	System.out.println("v�hicule �lectrique\n");
	    	    	            };
	    	    		            break;  
	    	    	          default:
	    	    	          	{
	    	    	            	System.out.println("Affichage de toutes les voitures");
	    	    	            	System.out.println(" Citadines\nberline\n4x4\nmonospace\nv�hicule �lectrique \n");
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
	    	    	            	System.out.println("Les Utilitaires � diesel");
	    	    	            	System.out.println("Camionnette\nV�hicule de soci�t�\n");
	    	    	            };
	    	    	            break;
	    	    	          case "essence":
	    	    	            {
	    	    	            	System.out.println("Les Utilitaires � essence");
	    	    	            	System.out.println("Camionnette\n");
	    	    	            	
	    	    	            };
	    	    	            break; 
	    	    	          case "hybride":
	    	    	          	{
	    	    	            	System.out.println("Les Utilitaires hybride");
	    	    	            	System.out.println("Camionnette\nV�hicule de soci�t�\n");
	    	    	            };
	    	    		            break; 
	    	    	          case "�lectrique":
	    	    	          	{
	    	    	            	System.out.println("Les Utilitaires �lectriques");
	    	    	            	System.out.println("V�hicule de soci�t�\n");
	    	    	            };
	    	    		            break;  
	    	    	          default:
	    	    	          	{
	    	    	            	System.out.println("Affichage de tous les Utilitaires");
	    	    	            	System.out.println("Camionnette\nV�hicule de soci�t�\n");
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
    	    	            	System.out.println("Les Deux roues � diesel");
    	    	            	System.out.println("Aucun\n");
    	      	        	};
    	    	            break;
    	    	          case "essence":
    	    	            {
    	    	            	System.out.println("Les Deux roues � essence");
    	    	            	System.out.println("Moto\nscooter\n");
    	    	            };
    	    	            break; 
    	    	          case "hybride":
    	    	          	{
    	    	            	System.out.println("Les Deux roues hybride");
    	    	            	System.out.println("scooter\n");
    	    	            	
    	    	            };
    	    		            break; 
    	    	          case "�lectrique":
    	    	          	{
    	    	            	System.out.println("Les Deux roues �lectriques");
    	    	            	System.out.println("scooter �lectrique\n");
    	    	            };
    	    		            break;  
    	    	          default:
    	    	          	{
    	    	            	System.out.println("Affichage de tous les deux roues");
    	    	            	System.out.println("Moto\nscooter\nscooter �lectrique\n");
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
    	    	            	System.out.println("Tous les vehicules � diesel");
    	    	            	System.out.println("berline\nmonospace\nCamionnette\nV�hicule de soci�t�\n");
    	    	            };
    	    	            break;
    	    	          case "essence":
    	    	            {
    	    	            	System.out.println("Tous les vehicules � essence");
    	    	            	System.out.println("Citadines\nberline\n4x4\nCamionnette\nMoto\nscooter\n");
    	    	            };
    	    	            break; 
    	    	          case "hybride":
    	    	          	{
    	    	            	System.out.println("Tous les vehicules hybride");
    	    	            	System.out.println("monospace\nCamionnette\nV�hicule de soci�t�\nscooter\n");
    	    	            };
    	    		            break; 
    	    	          case "�lectrique":
    	    	          	{
    	    	            	System.out.println("Tous les vehicules �lectriques");
    	    	            	System.out.println("v�hicule �lectrique\nV�hicule de soci�t�\nscooter �lectrique\n");
    	    	            };
    	    		            break;  
    	    	          default:
    	    	          	{
    	    	            	System.out.println("Affichage de tous les vehicules");
    	    	            	System.out.println("Citadines, berline, 4x4, monospace, v�hicule �lectrique\n"
    	    	            			+ "Camionnette, V�hicule de soci�t�\n"
    	    	            			+ "Moto, scooter, scooter �lectrique\n");
    	    	            };           
    	    	        }    	        	  
  	    	          };             
  	    	        }
    	        	  //Vehicule.rechercheTypeVehicule(typeVehicule,typeCarburant);
    		            break;
    	          case "4":
    	        	  System.out.println("Louer un v�hicule");
    	        	  System.out.println("Pour louer un v�hicule "
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
