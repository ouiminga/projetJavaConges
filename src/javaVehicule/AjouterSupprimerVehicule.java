package javaVehicule;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AjouterSupprimerVehicule extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AjouterSupprimerVehicule frame = new AjouterSupprimerVehicule();
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
	public AjouterSupprimerVehicule() {
		setTitle("AJOUTER / SUPPRIMER VEHICULE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 692, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 325, 240);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AJOUTER VEHICULE");
		lblNewLabel.setBounds(10, 0, 116, 20);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TYPE DE VEHICULE");
		lblNewLabel_1.setBounds(10, 45, 109, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblCarburant = new JLabel("CARBURANT");
		lblCarburant.setBounds(10, 84, 100, 20);
		panel.add(lblCarburant);
		
		JLabel lblMarque = new JLabel("MARQUE");
		lblMarque.setBounds(10, 126, 100, 20);
		panel.add(lblMarque);
		
		JLabel lblModel = new JLabel("MODEL");
		lblModel.setBounds(10, 167, 100, 20);
		panel.add(lblModel);
		
		textField = new JTextField();
		textField.setBounds(120, 45, 195, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 84, 195, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(120, 126, 195, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(120, 167, 195, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("AJOUTER");
		btnNewButton.setBounds(166, 206, 152, 23);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(341, 11, 325, 240);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblSupprimerVehicule = new JLabel("SUPPRIMER VEHICULE");
		lblSupprimerVehicule.setBounds(10, 0, 133, 20);
		panel_1.add(lblSupprimerVehicule);
		
		textField_4 = new JTextField();
		textField_4.setBounds(127, 44, 188, 20);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(120, 83, 195, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(120, 125, 195, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(120, 166, 195, 20);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("SUPPRIMER");
		btnNewButton_1.setBounds(162, 206, 153, 23);
		panel_1.add(btnNewButton_1);
		
		JLabel label = new JLabel("TYPE DE VEHICULE");
		label.setBounds(10, 44, 111, 20);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("CARBURANT");
		label_1.setBounds(10, 83, 100, 20);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("MARQUE");
		label_2.setBounds(10, 125, 100, 20);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("MODEL");
		label_3.setBounds(10, 166, 100, 20);
		panel_1.add(label_3);
	}

}
