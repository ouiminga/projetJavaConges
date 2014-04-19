/**
 * 
 */

/**
 * @author Ouiminga
 *
 */
import java.util.*;
public class GestionParc {
	
	/**
	 * 
	 */
	public GestionParc() {
		// TODO Auto-generated constructor stub
	}
	
		/**
	 *Rechercher un véhicule par plusieurs critères 
	 *(type de véhicule, par carburant, par marque 
	 *et model) 
	 */
	public void rechercherVehicule4types() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Afficher un listing complet du parc auto.
	 */
	public void afficherListingComplet() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 */
	/*public void ajoutClient(String initnom,String initprenom,String initadresse) {
		// TODO Auto-generated constructor stub
		Client nvoClient=new Client(initnom,initprenom,initadresse);
		listClient.add(nvoClient);
	}*/
	
	/**
	 * Afficher la liste des clients.
	 */
	public void afficheListeClients(ArrayList<Client> listClient){
		// TODO Auto-generated constructor stub
		for (int i = 0; i<listClient.size(); i++)
        {
         System.out.println(((Client)listClient.get(i)).getNom());
        }
	}
	
	/**
	 * Afficher la liste des véhicule en location
	 * (afficher une liste de couples 
	 * Véhicules/Client loueur)
	 */
	public void afficherListeVehiculeLoue() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Ajouter un véhicule au parc.
	 */
	public void ajoutVehicule() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Supprimer un véhicule du parc.
	 */
	public void supprimerVehicule() {
		// TODO Auto-generated constructor stub
	}

}
