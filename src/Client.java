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
	/**
	 * 
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
	
	public void decrisToi(){
		// TODO Auto-generated constructor stub
		System.out.println("Nom = " + this.nom + "\nPrenom = " + this.prenom + "\nAdresse = " + this.adresse);
	}
	
	/**
	 * 
	 */
	public void Login() {
		Scanner scan = new Scanner(System.in);
	    Scanner keyboard = new Scanner (System.in);
	    String user = scan.nextLine();
	    String pass = scan.nextLine(); // looks at selected file in scan

	    String inpUser = keyboard.nextLine();
	    String inpPass = keyboard.nextLine(); // gets input from user

	    if (inpUser.equals(user) && inpPass.equals(pass)) {
	        System.out.print("your login message");
	    } else {
	        System.out.print("your error message");
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
}
