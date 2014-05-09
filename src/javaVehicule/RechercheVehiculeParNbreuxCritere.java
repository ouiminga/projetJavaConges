package javaVehicule;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import java.awt.TextArea;
import java.awt.Label;
import javax.swing.JButton;

public class RechercheVehiculeParNbreuxCritere extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RechercheVehiculeParNbreuxCritere frame = new RechercheVehiculeParNbreuxCritere();
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
	public RechercheVehiculeParNbreuxCritere() {
		setTitle("Rechercher v\u00E9hicule par plusieurs crit\u00E8res");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CRITERES");
		lblNewLabel.setBounds(27, 11, 69, 33);
		contentPane.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("TYPE DE VEHICULE");
		chckbxNewCheckBox.setBounds(123, 11, 135, 33);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("MARQUE");
		chckbxNewCheckBox_1.setBounds(411, 11, 85, 33);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("CARBURANT");
		chckbxNewCheckBox_2.setBounds(282, 11, 102, 33);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("MODEL");
		chckbxNewCheckBox_3.setBounds(517, 11, 69, 33);
		contentPane.add(chckbxNewCheckBox_3);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 82, 587, 225);
		contentPane.add(textArea);
		
		Label label = new Label(" TYPE DE VEHICULE");
		label.setBounds(21, 50, 120, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("CARBURANT");
		label_1.setBounds(197, 50, 85, 22);
		contentPane.add(label_1);
		
		JButton btnNewButton = new JButton("RECHERCHER");
		btnNewButton.setBounds(483, 321, 114, 33);
		contentPane.add(btnNewButton);
		
		Label label_2 = new Label("MARQUE");
		label_2.setBounds(346, 50, 85, 22);
		contentPane.add(label_2);
		
		Label label_3 = new Label("MODEL");
		label_3.setBounds(494, 50, 85, 22);
		contentPane.add(label_3);
	}
}