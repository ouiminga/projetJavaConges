/**
 * @author Ouiminga
 *
 */
public class Monospace extends Voitures{

	/**
	 * 
	 */
	public Monospace() {
		// TODO Auto-generated constructor stub
		//System.out.println("Monospace!");
	}
	
	public void demarer(){
		System.out.println("Demarer Monospace !");
	}
	
	String sTypeDeVehicule="Berline";
	String sCarburant="";
	String sMarque="";
	String sModel="";
	//nbreVoitParModel;
	
	/**
	 * @author Ouiminga
	 * enumeration des carburants
	 */
	public enum Carburant {
		diesel ("Carburant: diesel"),
		essence ("Carburant: essence"),
		hybride ("Carburant: hybride");
		
		private String nameCarburant = "";
		
		//Constructeur
		Carburant(String name){
		this.nameCarburant = name;
		}

		public String toString(){
		//System.out.println("Name Carburant : " + nameCarburant);
		return nameCarburant;
		}
	}
	
	/**
	 * @author Ouiminga
	 * enumeration des marques
	 */
	public enum Marque {
		peugeot ("Marque: peugeot"),
		renault ("Marque: renault"),
		citroen ("Marque: citroen");
		
		private String nameMarque = "";
		
		//Constructeur
		Marque(String name){
		this.nameMarque = name;
		}

		public String toString(){
		//System.out.println("Name Marque : " + nameMarque);
		return nameMarque;
		}
	}
	
	/**
	 * @author Ouiminga
	 * enumeration des mod�les
	 */
	public enum Model {
		m2010 ("Model: 2010"),
		m2011 ("Model: 2011"),
		m2012 ("Model: 2012"),
		m2013 ("Model: 2013");
		
		private String nameModel = "";
		
		//Constructeur
		Model(String name){
		this.nameModel = name;
		}

		public String toString(){
		//System.out.println("Name Model : " + nameModel);
		return nameModel;
		}
	}
	
	//setters
	/**
	 * ON NE PEU PAS MODIFIER LE TYPE
	 */
	public void setTypeDeVehicule()
	{
	System.out.println("On ne peu pas modifier le type");
	}
	
	/**
	 * 
	 */
	public void setCarburant()
	{
		
	}
	
	/**
	 * 
	 */
	public void setMarque()
	{
		
	}
	
	/**
	 * 
	 */
	public void setModel()
	{
		
	}
	
	//getters
	/**
	 * 
	 */
	public String getTypeDeVehicule()
	{
	return sTypeDeVehicule;
	}
	
	/**
	 * 
	 */
	public String getCarburant()
	{
	for(Carburant carburan_t : Carburant.values())
		sCarburant=sCarburant + "\n" + carburan_t ;	
	return sCarburant;		
	}
	
	/**
	 * 
	 */
	public String getMarque()
	{
	for(Marque marqu_e : Marque.values())
		sMarque=sMarque + "\n" + marqu_e ;	
	return sMarque;
	}
	
	/**
	 * 
	 */
	public String getModel()
	{
	for(Model mode_l : Model.values())
		sModel=sModel + "\n" + mode_l ;
	return sModel;
	}
}
