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
	String clientId=new String("");
	String clientPassword=new String("");
		
	/**
	 * Les deux m�thodes sont les constructeurs
	 */
	public Client() {
		nom="Nom non initialis�";
		prenom="Prenom non initialis�";
		adresse="Adresse non initialis�";
	}

	public Client(String initnom,String initprenom,String initadresse) {
		// TODO Auto-generated constructor stub
		nom=initnom;
		prenom=initprenom;
		adresse=initadresse;
		clientId=nom+prenom;
		clientPassword=nom+adresse.charAt(0);
		System.out.println("Votre identifiant Login est "+ clientId);
		System.out.println("password="+clientPassword);
	}
	
	/**
	 * Les deux m�thodes sont les constructeurs
	 */
	private static String mainClient() {
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
	//public boolean Login(String firstName,String password) {
	public boolean Login(String id,String pwd) {
		Scanner scan = new Scanner(System.in);
	    String choixAction,choiTypeVehicule,choixCarburant;
	    
	    if (id.equals(clientId) && pwd.equals(clientPassword)) {
	        System.out.println("Vous �tes logu�");
	        System.out.println("Que voulez vous faire ?");
	        System.out.println("Tapez 1 pour Recherche un v�hicule");
	        System.out.println("Tapez 2 pour Louer un v�hicule");
	        choixAction=scan.nextLine();
	        switch (choixAction)
	        {
	          case "1":
	        	  String typeVehicul_e,typeCarburan_t;Main mainn=new Main();
	        	  System.out.println("Recherche un v�hicule");
	        	  System.out.println("Entrez le type de v�hicule recherch�");
	        	  System.out.println("Voitures ,Utilitaires ou Deux roues ");
	        	  typeVehicul_e=scan.nextLine();
	        	  System.out.println("Entrez le type de carburant recherch�");
	        	  System.out.println("diesel,essence,hybride et �lectrique");
	        	  typeCarburan_t=scan.nextLine();
	        	  mainn.rechercheVehicule(typeVehicul_e,typeCarburan_t);
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
	        System.out.print("login refus�");
	        System.out.print("identifiant ou mot de passe erron�");
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
	 * retourne l'adresse du client
	 */
	public String getId() {
		// TODO Auto-generated constructor stub
		return adresse;
	}
	
	/**
	 * retourne l'adresse du client
	 */
	public String getPwd(){
		return clientId;
	}
	
	/**
	 * retourne l'adresse du client
	 */
	public String getAdresse(){
		return clientPassword;
	}
}
