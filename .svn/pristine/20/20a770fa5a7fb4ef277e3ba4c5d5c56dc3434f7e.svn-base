package javaVehicule;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CompteCree extends JDialog {

	private final JPanel contentPanel = new JPanel();
	static String nomNvoClientt;
	static String prenomNvoClientt;
	static String adresseNvoClientt;
	static String pseudoo;
	static String motDePassee;
	static JTextField textField;
	static JTextField textField_1;
	static JTextField textField_2;
	static JTextField textField_3;
	static JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CompteCree dialog = new CompteCree("","","","","");
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CompteCree(String nomNvoClient,String prenomNvoClient,String adresseNvoClient,String pseudo,String motDePasse) {
		
		setBounds(100, 100, 321, 265);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Compte cr\u00E9ee");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel.setBounds(98, 11, 133, 24);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Nom Client");
			lblNewLabel_1.setBounds(21, 51, 69, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Prenom client");
			lblNewLabel_2.setBounds(21, 76, 86, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Adresse");
			lblNewLabel_3.setBounds(21, 101, 63, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Pseudo");
			lblNewLabel_4.setBounds(21, 126, 56, 14);
			contentPanel.add(lblNewLabel_4);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Mot de passe");
			lblNewLabel_5.setBounds(21, 151, 79, 14);
			contentPanel.add(lblNewLabel_5);
		}
		{			
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(133, 48, 162, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
			textField.setText(nomNvoClient);
		}
		{
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setBounds(133, 73, 162, 20);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
			textField_1.setText(prenomNvoClient);

		}
		{
			textField_2 = new JTextField();
			textField_2.setEditable(false);
			textField_2.setBounds(133, 98, 162, 20);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
			textField_2.setText(adresseNvoClient);
		}
		{
			textField_3 = new JTextField();
			textField_3.setEditable(false);
			textField_3.setBounds(133, 123, 162, 20);
			contentPanel.add(textField_3);
			textField_3.setColumns(10);
			textField_3.setText(pseudo);
		}
		{
			textField_4 = new JTextField();
			textField_4.setEditable(false);
			textField_4.setBounds(133, 149, 162, 20);
			contentPanel.add(textField_4);
			textField_4.setColumns(10);
			textField_4.setText(motDePasse);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("(NB : Utilisez le Pseudo et Mot de passe pour Log in)");
			lblNewLabel_6.setBounds(0, 176, 295, 14);
			contentPanel.add(lblNewLabel_6);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

}
