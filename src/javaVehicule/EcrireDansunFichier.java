import java.io.*;
import java.util.StringTokenizer;

public class EcrireDansunFichier {
	private BufferedReader sortie;
	String ligneLue,tabLigne[]=new String[4];
	private BufferedWriter ecrire;
	private int p;
	
	
	public EcrireDansunFichier(String nomFichier,String val1,String val2,String val3,String val4)
	{
		try {
			ecrire=new BufferedWriter(new FileWriter(nomFichier,true));
			ecrire.write(val1);
			ecrire.write(" ");
			ecrire.write(val2);
			ecrire.write(" ");
			ecrire.write(val3);
			ecrire.write(" ");
			ecrire.write(val4);
			ecrire.newLine();
			ecrire.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public EcrireDansunFichier(String nomFichier,int val1,int val2,int val3,int val4)
	{
		try {
			ecrire=new BufferedWriter(new FileWriter(nomFichier,true));
			ecrire.write(val1);
			ecrire.write(" ");
			ecrire.write(val2);
			ecrire.write(" ");
			ecrire.write(val3);
			ecrire.write(" ");
			ecrire.write(val4);
			ecrire.newLine();
			ecrire.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public EcrireDansunFichier(String nomFichier,int val1,String val2,String val3,int val4)
	{
		try {
			ecrire=new BufferedWriter(new FileWriter(nomFichier,true));
			ecrire.write(val1);
			ecrire.write(" ");
			ecrire.write(val2);
			ecrire.write(" ");
			ecrire.write(val3);
			ecrire.write(" ");
			ecrire.write(val4);
			ecrire.newLine();
			ecrire.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void supprimerLigne(String nomFichier,String val1,String val2,String val3,String val4)
	{
		
		try {
			sortie = new BufferedReader(new FileReader(nomFichier));
			try {
				while(true)
				{
					ligneLue=sortie.readLine();
					
					if(ligneLue==null) break;
					StringTokenizer tok= new StringTokenizer(ligneLue, " ");
					p=tok.countTokens();
					for(int i=0;i<p;i++)
					{
						tabLigne[i]=tok.nextToken();;
													
					}
					if((!tabLigne[0].equals(val1)) && (!tabLigne[1].equals(val2)) && (!tabLigne[2].equals(val3)) && (!tabLigne[3].equals(val4))) 
					{
						EcrireDansunFichier ecrir=new EcrireDansunFichier("C:\\Users\\ulrich\\workspace\\VelizyCar\\src\\client2.txt",tabLigne[0],tabLigne[1],tabLigne[2],tabLigne[3]);
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File fic=new File(nomFichier);
		fic.delete();
		File fichier =new File("C:\\Users\\ulrich\\workspace\\VelizyCar\\src\\client2.txt");
		File newFichier=new File("C:\\Users\\ulrich\\workspace\\VelizyCar\\src\\client.txt");
		fichier.renameTo(newFichier);
		
		
	}

}
