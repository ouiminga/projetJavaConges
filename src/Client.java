/**
 * 
 */

/**
 * @author Ouiminga
 *
 */
import java.util.*;

public class Client {
	String nom;
	String prenom;
	String adresse;
	String clientId;
	String clientPassword;
	
	/**
	 * Les deux méthodes sont les constructeurs
	 */
	public Client() {
		nom="Nom non initialisé";
		prenom="Prenom non initialisé";
		adresse="Adresse non initialisé";
	}

	public Client(String initnom,String initprenom,String initadresse) {
		// TODO Auto-generated constructor stub
		nom=initnom;
		prenom=initprenom;
		adresse=initadresse;
	}
	
	/**
	 * Les deux méthodes sont les constructeurs
	 */
	public static String mainClient() {
		return "quitter" ;
	}
	
	public void decrisToi(){
		// TODO Auto-generated constructor stub
		System.out.println("Nom = " + this.nom + "\nPrenom = " + this.prenom + "\nAdresse = " + this.adresse);
	}
	
	
	public void initLogin(String id,String pssword)
	{
		clientId=id;
		clientPassword=pssword;	
	}
	/**
	 * 
	 */
	public boolean Login(String firstName,String password) {
		Scanner scan = new Scanner(System.in);
	    String choixAction,choiTypeVehicule,choixCarburant;
	    
	    if (firstName.equals(clientId) && password.equals(clientPassword)) {
	        System.out.println("login accepté");
	        System.out.println("Que voulez vous faire ?");
	        System.out.println("1 .Rechercher un véhicule par plusieurs \n "
	        					+ "critères critères (Type de véhicule et \n"
	        					+ " carburants (diesel,essence, hybride \n"
	        					+ "et électrique))? ou \n" );
	        System.out.println("2 .Louer un véhicule avec date de location \n"
	        					+ "et de restitution et nombre de kilométrage\n"
	        					+ "par location") ;
	        choixAction=scan.nextLine();
	        switch (choixAction)
	        {
	          case "1":
	            {
	            	System.out.println("Entrez le type de vehicule");
	            	System.out.println("voiture , utilitaires ou deuxRoues");
	            	choiTypeVehicule=scan.nextLine();
	            	System.out.println("Entrez le type de carburant");
	            	System.out.println("diesel , essence ou hybride");
	            	choixCarburant=scan.nextLine();
	            	switch (choiTypeVehicule)
	    	        {
	    	          case "voiture":
	    	            {
	    	            	switch (choixCarburant)
	    	    	        {
	    	    	          case "diesel":
	    	    	            {
	    	    	            };
	    	    	            break;
	    	    	          case "essence":
	    	    	            {
	    	    	            };
	    	    	            break; 
	    	    	          case "hybride":
	    	    		            /*Action*/;
	    	    		            break;  
	    	    	          default:
	    	    	            /*Action*/;             
	    	    	        }
	    	            };
	    	            break;
	    	          case "utilitaires":
	    	            {
	    	            	switch (choixCarburant)
	    	    	        {
	    	    	          case "diesel":
	    	    	            {
	    	    	            };
	    	    	            break;
	    	    	          case "essence":
	    	    	            {
	    	    	            };
	    	    	            break; 
	    	    	          case "hybride":
	    	    		            /*Action*/;
	    	    		            break;  
	    	    	          default:
	    	    	            /*Action*/;             
	    	    	        }
	    	            };
	    	            break; 
	    	          case "deuxRoues":
	    		            {
	    		            	switch (choixCarburant)
	    		    	        {
	    		    	          case "diesel":
	    		    	            {
	    		    	            };
	    		    	            break;
	    		    	          case "essence":
	    		    	            {
	    		    	            };
	    		    	            break; 
	    		    	          case "hybride":
	    		    		            /*Action*/;
	    		    		            break;  
	    		    	          default:
	    		    	            /*Action*/;             
	    		    	        }
	    		            };
	    		            break;  
	    	          default:
	    	            /*Action*/;             
	    	        }
	            };
	            break; 
	          case "2":
		            /*Action*/;
		            break;  
	          default:
	            /*Action*/;             
	        }
	        
	        return true;
	    }
	    else {
	        System.out.print("login refusé");
	        return false;
	    }
	}
	
	/**
	 * 
	 */
	public void rechercherUnVehicule() {
		// TODO Auto-generated constructor stub
		
	}
	
	/**
	 * 
	 */
	public void louerVehicule() {
		// TODO Auto-generated constructor stub
		
	}
	
	/**
	 * retourne le nom du client
	 */
	public String getNom() {
		// TODO Auto-generated constructor stub
		return nom;
	}
	
	/**
	 * retourne le prenom du client
	 */
	public String getPrenom() {
		// TODO Auto-generated constructor stub
		return prenom;
	}
	/**
	 * retourne le nom du client
	 */
	public String getAdresse() {
		// TODO Auto-generated constructor stub
		return adresse;
	}
}
