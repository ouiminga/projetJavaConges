import java.io.*;
import java.util.*;

import javax.swing.JTextArea;


public class Affichage {
	
	private BufferedReader sortie;
	String ligneLue, mdp,log,tabLigne[]=new String[4];
	boolean ret=false;
	int p,x;
	public Affichage()
	{
		x=0;
	}
	
	public boolean lectureligne(String passwd,String login)
	{
		try {
			sortie = new BufferedReader(new FileReader("C:\\Users\\ulrich\\workspace\\VelizyCar\\src\\client.txt"));
			try {
				while(true)
				{
					ligneLue=sortie.readLine();
					
					if(ligneLue==null) break;
					StringTokenizer tok= new StringTokenizer(ligneLue, " ");
					p=tok.countTokens();
					for(int i=0;i<p;i++)
					{
						log=tok.nextToken();
						tabLigne[i]=log;
							
					}
					if((tabLigne[0].equals(login)) && (tabLigne[3].equals(passwd))) 
					{
						ret= true;
						break;
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
		return ret;
	}
	public  void affichageClient(JTextArea listClient)
	{
		try {
			sortie = new BufferedReader(new FileReader("C:\\Users\\ulrich\\workspace\\VelizyCar\\src\\client.txt"));
			try {
				while(true)
				{
					
					ligneLue =sortie.readLine();
					if(ligneLue==null) break;
					listClient.setText(ligneLue);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public  void affichageVehicule(JTextArea listVehicule)
	{
		try {
			sortie = new BufferedReader(new FileReader("C:\\Users\\ulrich\\workspace\\VelizyCar\\src\\vehicule.txt"));
			try {
				while(true)
				{
					ligneLue =sortie.readLine();
					if(ligneLue==null) break;
					System.out.println(ligneLue);
					listVehicule.setText(ligneLue);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
