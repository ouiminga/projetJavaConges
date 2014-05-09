
public class LocationVehicule {
 String nom;
 Vehicule vehicule;
 String datelocat;
 String dateretr;

	public LocationVehicule(Vehicule vehicule,String client,String datelocat,String dateretr)
	{
		vehicule.status=1;
		this.nom=client;
		this.datelocat=datelocat;
		this.dateretr=dateretr;
		


	}
}
