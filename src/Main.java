/**
 * 
 */

/**
 * @author Ouiminga
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello World !");
		Berline berl =new Berline() ;
		Camionette cam =new Camionette() ;
		Citadines cit =new Citadines() ;
		Model4x4 voit4x4 =new Model4x4() ;
		Monospace monospace =new Monospace() ;
		Moto moto =new Moto() ;
		Scooter scooter =new Scooter() ;
		ScooterElectrique scooterelectrique =new ScooterElectrique() ;
		VehiculeElectrique vehiculeElectrique=new VehiculeElectrique() ;
		VehiculeDeSocite vdesociete=new VehiculeDeSocite() ;
		
		Client moi1 =new Client() ;
		Client moi2 =new Client("Ouim","Aziz","5 rue paul dautier") ;
		moi1.decrisToi();moi2.decrisToi();
	}

}
