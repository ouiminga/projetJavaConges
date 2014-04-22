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
	
	public	void rechercheVehicule(String typeVehicule,String typeCarburant)
	{
		switch (typeVehicule)
        {
          case "Voitures":
          case "voitures":
            {
            	switch (typeCarburant)
  	        {
  	          case "diesel":
  	          case "Diesel":
  	            {
  	            	System.out.println("Les voitures à diesel");
  	            	System.out.println(" berline\nmonospace\n");	    	      	        	  
  	            };
  	            break;
  	          case "essence":
  	          case "Essence":
  	            {
  	            	System.out.println("Les voitures à essence");
  	            	System.out.println(" Citadines\nberline\n4x4\n");	    	      	        	  
	    	        };
  	            break; 
  	          case "hybride":
  	          case "Hybride":
  	          	{
  	            	System.out.println("Les voitures hybride");
  	            	System.out.println("monospace\n");
  	            };
  		            break; 
  	          case "electrique":
  	          case "Electrique":
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
          case "utilitaires":
            {
            	switch (typeCarburant)
  	        {
  	          case "diesel":
  	          case "Diesel":
  	            {
  	            	System.out.println("Les Utilitaires à diesel");
  	            	System.out.println("Camionnette\nVéhicule de société\n");
  	            };
  	            break;
  	          case "essence":
  	          case "Essence":
  	            {
  	            	System.out.println("Les Utilitaires à essence");
  	            	System.out.println("Camionnette\n");
  	            	
  	            };
  	            break; 
  	          case "Hybride":
  	          case "hybride":
  	          	{
  	            	System.out.println("Les Utilitaires hybride");
  	            	System.out.println("Camionnette\nVéhicule de société\n");
  	            };
  		            break; 
  	          case "electrique":
  	          case "Electrique":
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
          case "deux roues":
          {
        	switch (typeCarburant)
	        {
	          case "diesel":
	          case "Diesel":
	            {
	            	System.out.println("Les Deux roues à diesel");
	            	System.out.println("Aucun\n");
	        	};
	            break;
	          case "essence":
	          case "Essence":
	            {
	            	System.out.println("Les Deux roues à essence");
	            	System.out.println("Moto\nscooter\n");
	            };
	            break; 
	          case "hybride":
	          case "Hybride":
	          	{
	            	System.out.println("Les Deux roues hybride");
	            	System.out.println("scooter\n");
	            	
	            };
		            break; 
	          case "electrique":
	          case "Electrique":
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
	          case "Diesel":
	            {
	            	System.out.println("Tous les vehicules à diesel");
	            	System.out.println("berline\nmonospace\nCamionnette\nVéhicule de société\n");
	            };
	            break;
	          case "essence":
	          case "Essence":
	            {
	            	System.out.println("Tous les vehicules à essence");
	            	System.out.println("Citadines\nberline\n4x4\nCamionnette\nMoto\nscooter\n");
	            };
	            break; 
	          case "hybride":
	          case "Hybride":
	          	{
	            	System.out.println("Tous les vehicules hybride");
	            	System.out.println("monospace\nCamionnette\nVéhicule de société\nscooter\n");
	            };
		            break; 
	          case "Electrique":
	          case "electrique":
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
	}
	public void rechercheVehicule(String typeVehicule,String carburants,String marque,String model)
	{
		
	}
		
	public static void main(String[] args) {
		ArrayList<Client> listClient = new ArrayList<Client>();
		ArrayList<String> listId = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String premierChoix =new String("");
		boolean bool;
		Client nvoCl;
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
    	            	String nomNvoClient,prenomNvoClient,adresseNvoClient;
    	            	String idd,pwdd;
    	            	boolean exist=false;
    	            	//Client nvoCl;
    					System.out.println("Pour vous creer un compte client");
    					System.out.println("Entrez votre Nom de client");
    					nomNvoClient=sc.nextLine();
    					System.out.println("Entrez votre Prenom de client");
    					prenomNvoClient=sc.nextLine();
    					System.out.println("Entrez votre Adresse de client");
    					adresseNvoClient=sc.nextLine();
    					nvoCl=new Client(nomNvoClient,prenomNvoClient,adresseNvoClient);
    					idd=nomNvoClient+prenomNvoClient;
    					pwdd=nomNvoClient+adresseNvoClient.charAt(0);
    					
    					for(String s:listId)
    					{
    						if(s.equals(idd))
    						{
    						exist=true;
    						System.out.println("Ce client existe déja");
    						break;
    						}
    					}
    					if(exist==false)
						{ 
    					System.out.println("Nouveau client");
    					listClient.add(nvoCl);
						listId.add(idd);
						}
    					
    					//nvoCl.Login(idd,pwdd);
    				};
    	            break;
    	          case "2":
    	            {
    	            	System.out.println("Log in");
    	            	String id;String password;
    	            	boolean existt=false;
    	            	int curseur=0;
    					System.out.println("Entrez l'identifiant/nom");
    					id=sc.nextLine();
    					System.out.println("Entrez le mot de passe");
    					password=sc.nextLine();
    					
    					for(String ss:listId)
    					{ curseur++;	
    						if(ss.equals(id))
    						{
    						existt=true;
    						break;
    						}
    					}
    					if(existt==true)
						{ 
    					System.out.println("Client authentifié");
    					((Client)listClient.get(curseur)).Login(id,password);
    					}
    					else
    					{
    					System.out.println("Client non reconnu. Si vous n'avez pas de compte veuillez en créer");
    					}
    					
    				};
    	            break; 
    	          case "3":
    	        	  String typeVehicul_e,typeCarburan_t;Main mainn=new Main();
    	        	  System.out.println("Recherche un véhicule");
    	        	  System.out.println("Entrez le type de véhicule recherché");
    	        	  System.out.println("Voitures ,Utilitaires ou Deux roues ");
    	        	  typeVehicul_e=sc.nextLine();
    	        	  System.out.println("Entrez le type de carburant recherché");
    	        	  System.out.println("diesel,essence,hybride et électrique");
    	        	  typeCarburan_t=sc.nextLine();
    	        	  mainn.rechercheVehicule(typeVehicul_e,typeCarburan_t);
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
