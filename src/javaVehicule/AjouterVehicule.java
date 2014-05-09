import java.awt.BorderLayout;

import javax.swing.*;

import java.io.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AjouterVehicule extends JFrame {

	private JPanel contentPane;
	private ObjectOutputStream sortie ;
	public String typeVehicule;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjouterVehicule frame = new AjouterVehicule();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AjouterVehicule() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ulrich\\workspace\\VelizyCar\\images\\images.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
        DefaultComboBoxModel type = new DefaultComboBoxModel();
        final DefaultComboBoxModel model = new DefaultComboBoxModel();
        final DefaultComboBoxModel carburan = new DefaultComboBoxModel();
        
        
      		
        type.addElement("  ");
        type.addElement("Voitures");
        type.addElement("Utilitaires");
		type.addElement("Deux Roues");
		
		
		
		final JComboBox typ = new JComboBox(type);
		final JComboBox mod = new JComboBox(model);
		mod.setEnabled(false);
		final JComboBox carb = new JComboBox(carburan);
		carb.setEnabled(false);
		carburan.addElement(" ");
		carburan.addElement("Essence ");
		carburan.addElement("Gazoil");
		carburan.addElement("Electrique");
		carburan.addElement("Hybride");
		
		
		typ.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String c =(String) typ.getSelectedItem();
				
				mod.setEnabled(true);
				
				System.out.println(c);
				switch (c)
				{
				case "Voitures":
				{
					model.removeAllElements();
					model.addElement("Berlines");
					model.addElement("Citadines");
					model.addElement("4x4");
					model.addElement("Monospace");
					model.addElement("Vehicules Electriques");
					
				}
				break;
				case "Utilitaires":
				{
					model.removeAllElements();
					model.addElement("Camionnetttes");
					model.addElement("Vehicule de Societe");
					
				}
				break;
				case "Deux Roues":
				{
					model.removeAllElements();
					model.addElement("Moto");
					model.addElement("Scooter");
					model.addElement("Scooter Electrique");
					
				}
				break;
				default: model.removeAllElements();
					
				
				}
				
			}
		});
		
		mod.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			
				String b =(String) mod.getSelectedItem();
				
				
				carb.setEnabled(true);
				
			}
		});
		
		JLabel lblNewLabel = new JLabel("Type :");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		
		/*JComboBox comboBox = new JComboBox();
		comboBox.setVisible(false);*/
		
		JLabel lblNewLabel_1 = new JLabel("Mod\u00E8le");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Carburant");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 16));
		
		JButton btnAjt = new JButton("Ajouter Vehicule");
		btnAjt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					sortie =new ObjectOutputStream(new FileOutputStream("C:\\Users\\ulrich\\workspace\\VelizyCar\\src\\vehicule",true));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				switch((String) typ.getSelectedItem()){
				      
				case "Voitures":
					typeVehicule="voitures";
						Vehicule voiture=new Voitures(typeVehicule,(String) carb.getSelectedItem(),(String) mod.getSelectedItem());
					EcrireDansunFichier ecrire=new EcrireDansunFichier("C:\\Users\\ulrich\\workspace\\VelizyCar\\src\\vehicule.txt",voiture.num,voiture.model,voiture.carburant,voiture.status);
					
				case "DeuxRoues":
					typeVehicule="DeuxRoues";
					Vehicule deuxroues =new DeuxRoues(typeVehicule,(String) carb.getSelectedItem(),(String) mod.getSelectedItem());
				case "Utilitaires":
					typeVehicule="Utilitaires";
					Vehicule utilitaire=new Utilitaires(typeVehicule,(String) carb.getSelectedItem(),(String) mod.getSelectedItem());
				
				
				
				}
				//Vehicule vehicule= new Vehicule();
			}
		});
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(240, 255, 255)));
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2))
							.addGap(54)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(carb, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(mod, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(typ, Alignment.LEADING, 0, 147, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(103)
							.addComponent(btnAjt, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(121)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(typ, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(mod, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(carb, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addGap(53)
					.addComponent(btnAjt, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(19, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

}
