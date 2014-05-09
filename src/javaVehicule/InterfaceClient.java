package javaVehicule;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JSeparator;

import java.awt.Panel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Box;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;

import java.awt.GridLayout;
import java.awt.Label;
import java.awt.ScrollPane;

import javax.swing.BoxLayout;

import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JLabel;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;
import javax.swing.JMenuBar;

import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Scrollbar;
import java.awt.TextField;

import net.miginfocom.swing.MigLayout;

import javax.swing.JTextPane;

import java.awt.TextArea;

import javax.swing.JRadioButton;
import javax.swing.JList;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JTree;

import java.awt.Point;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import java.io.Serializable;

//Packages à importer afin d'utiliser l'objet File
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;


public class InterfaceClient extends JFrame implements Serializable{
	private Checkbox checkbox_2;
	private Checkbox checkbox_3;
	final Panel panel_1 = new Panel();
	final Panel panel_2 = new Panel();
	final Panel panel_3 = new Panel();
	final Panel panel_4 = new Panel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JTextField textField_3;
	private ButtonGroup bg = new ButtonGroup();
	final JRadioButton rdbtnNewRadioButton = new JRadioButton("Creer un compte");
	final JRadioButton rdbtnLogIn = new JRadioButton("Log in");
	private static String nomNvoClient="vide",prenomNvoClient="vide",adresseNvoClient="vide";
	private static String pseudo="vide",motDePasse="vide";
	private static double kilometrage=0;
	static private PrintWriter ecrivain;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {			
					InterfaceClient frame = new InterfaceClient();
					frame.setVisible(true);
					ecrivain= new PrintWriter(new BufferedWriter(new FileWriter("test.txt")));
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfaceClient() {
		setTitle("INTERFACE CLIENT");
		setLocation(new Point(10, 10));
		setSize(new Dimension(639, 706));
		setResizable(false);
		getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		
		//On ajoute les boutons au groupe
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnLogIn);
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(rdbtnNewRadioButton.isSelected())
				{panel_2.setEnabled(false);
				panel_1.setEnabled(true);}	
			}
		});
		panel.add(rdbtnNewRadioButton);
		rdbtnLogIn.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(rdbtnLogIn.isSelected())
				{panel_2.setEnabled(true);
				panel_1.setEnabled(false);
				}
			}
		});
		panel.add(rdbtnLogIn);
				
		panel.setBounds(10, 10, 613, 28);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		Label label = new Label("Que voulez vous faire ?");
		label.setBounds(0, 5, 135, 22);
		label.setAlignment(Label.CENTER);
		panel.add(label);
		
		checkbox_2 = new Checkbox("Rechercher un vehicule");
		checkbox_2.setEnabled(false);
		checkbox_2.setState(true);
		checkbox_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(checkbox_2.getState())
				{
				panel_2.setEnabled(false);
				panel_1.setEnabled(false);
				panel_4.setEnabled(false);
				}		
			}
		});
		
		checkbox_2.setBounds(464, 5, 139, 22);
		panel.add(checkbox_2);
		
		checkbox_3 = new Checkbox("Louer un v\u00E9hicule");
		checkbox_3.setEnabled(false);
		
		checkbox_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(checkbox_3.getState())
				{
				panel_2.setEnabled(false);
				panel_3.setEnabled(false);
				panel_1.setEnabled(false);
				}		
			}
		});
		
		checkbox_3.setBounds(336, 5, 122, 22);
		panel.add(checkbox_3);
		
		rdbtnNewRadioButton.setBounds(146, 5, 122, 23);
		panel.add(rdbtnNewRadioButton);
		
		rdbtnLogIn.setBounds(266, 5, 64, 23);
		panel.add(rdbtnLogIn);
		panel_1.setEnabled(false);
		
		//final Panel panel_1 = new Panel();
		panel_1.setBounds(10, 44, 301, 144);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		Label label_1 = new Label("Creer un compte client.");
		label_1.setBounds(0, 5, 125, 14);
		panel_1.add(label_1);
		
		Label label_2 = new Label("Nom");
		label_2.setBounds(44, 25, 42, 22);
		panel_1.add(label_2);
		
		Label label_3 = new Label("Prenom");
		label_3.setBounds(29, 53, 57, 22);
		panel_1.add(label_3);
		
		Label label_4 = new Label("Adresse");
		label_4.setBounds(23, 85, 63, 22);
		panel_1.add(label_4);
		
		JButton btnNewButton = new JButton("Creer le compte");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(((textField.getText()).equals(""))||((textField_1.getText()).equals(""))||((textField_2.getText()).equals("")))
				{
				CompleterInfos complet=new CompleterInfos();
				complet.setVisible(true); 	
				}
				else
				{
				nomNvoClient=textField.getText();
				prenomNvoClient=textField_1.getText();
				adresseNvoClient=textField_2.getText();
				pseudo=nomNvoClient+prenomNvoClient.charAt(0);
				motDePasse=nomNvoClient+adresseNvoClient.charAt(0);
				try {			
					ecrivain= new PrintWriter(new BufferedWriter(new FileWriter("test.txt",true)));
					ecrivain.println(textField.getText()+" "+textField_1.getText()+" "+textField_2.getText()+" "+motDePasse+" "+motDePasse);
					ecrivain.close();
				} catch (Exception ee) {
					ee.printStackTrace();
				}
				
				//
				CompteCree comptCree=new CompteCree(nomNvoClient,prenomNvoClient,adresseNvoClient,pseudo,motDePasse);
				comptCree.setVisible(true); 	
				}
			}
		});
		btnNewButton.setBounds(134, 113, 146, 23);
		panel_1.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(134, 25, 146, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(134, 55, 146, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(134, 85, 146, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		panel_2.setEnabled(false);
		
		//final Panel panel_2 = new Panel();
		panel_2.setBounds(322, 44, 301, 144);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		Label label_5 = new Label("Log in");
		label_5.setBounds(0, 0, 54, 20);
		panel_2.add(label_5);
		
		Label label_6 = new Label("Pseudo");
		label_6.setBounds(37, 26, 54, 22);
		panel_2.add(label_6);
		
		Label label_7 = new Label("Mot de passe");
		label_7.setBounds(10, 54, 81, 22);
		panel_2.add(label_7);
		
		JButton btnNewButton_1 = new JButton("Connexion");
		btnNewButton_1.setBounds(161, 110, 112, 23);
		panel_2.add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(97, 56, 176, 20);
		panel_2.add(passwordField);
		
		textField_3 = new JTextField();
		textField_3.setBounds(97, 26, 176, 20);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		panel_3.setEnabled(false);
		
		//final Panel panel_3 = new Panel();
		panel_3.setBounds(10, 194, 301, 144);
		getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		Label label_8 = new Label("Louer un vehicule");
		label_8.setBounds(0, 0, 106, 13);
		panel_3.add(label_8);
		
		Label label_9 = new Label("Date de location");
		label_9.setBounds(10, 19, 92, 22);
		panel_3.add(label_9);
		
		Label label_10 = new Label("Date de restitution");
		label_10.setBounds(0, 47, 101, 22);
		panel_3.add(label_10);
		
		Label label_11 = new Label("Kilometrage");
		label_11.setBounds(31, 77, 71, 22);
		panel_3.add(label_11);
		
		Choice choice = new Choice();
		choice.setBounds(173, 19, 45, 20);
		panel_3.add(choice);
		
		Choice choice_1 = new Choice();
		choice_1.setBounds(119, 21, 45, 20);
		panel_3.add(choice_1);
		
		Choice choice_2 = new Choice();
		choice_2.setBounds(224, 21, 54, 20);
		panel_3.add(choice_2);
		
		Choice choice_3 = new Choice();
		choice_3.setBounds(118, 49, 45, 20);
		panel_3.add(choice_3);
		
		Choice choice_4 = new Choice();
		choice_4.setBounds(174, 47, 45, 20);
		panel_3.add(choice_4);
		
		Choice choice_5 = new Choice();
		choice_5.setBounds(226, 49, 54, 20);
		panel_3.add(choice_5);
		
		TextField textField_4 = new TextField();
		textField_4.setBounds(173, 77, 105, 22);
		panel_3.add(textField_4);
		
		JButton btnNewButton_2 = new JButton("Louer");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(173, 110, 105, 23);
		panel_3.add(btnNewButton_2);
		
		//final Panel panel_4 = new Panel();
		panel_4.setBounds(322, 194, 301, 144);
		getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		Label label_12 = new Label("Rechercher un vehicule");
		label_12.setBounds(0, 0, 143, 13);
		panel_4.add(label_12);
		
		Label label_13 = new Label("Type de vehicule");
		label_13.setBounds(0, 33, 95, 22);
		panel_4.add(label_13);
		
		Label label_14 = new Label("Carburants");
		label_14.setBounds(24, 61, 71, 22);
		panel_4.add(label_14);
		
		JList list = new JList();
		list.setBounds(101, 66, 172, 36);
		panel_4.add(list);
		
		JButton btnRechercher = new JButton("Rechercher");
		btnRechercher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRechercher.setBounds(161, 113, 112, 23);
		panel_4.add(btnRechercher);
		
		JList list_1 = new JList();
		list_1.setBounds(101, 25, 172, 30);
		panel_4.add(list_1);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(10, 344, 613, 324);
		getContentPane().add(textArea_1);
	}

	public boolean getCheckbox_2State() {
		return checkbox_2.getState();
	}
	
	public void setRdbtnNewRadioButtonSelected(boolean selected) {
		rdbtnNewRadioButton.setSelected(selected);
	}
	public boolean getCheckbox_3State() {
		return checkbox_3.getState();
	}
	public void setCheckbox_3State(boolean state_3) {
		checkbox_3.setState(state_3);
	}
}
