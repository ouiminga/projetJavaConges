package javaVehicule;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextArea;
import javax.swing.JLabel;

public class AfficherListeDesClients extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AfficherListeDesClients frame = new AfficherListeDesClients();
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
	public AfficherListeDesClients() {
		setTitle("LISTE DES CLIENTS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(10, 45, 457, 209);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("NOM");
		lblNewLabel.setBounds(44, 11, 40, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblPrenom = new JLabel("PRENOM");
		lblPrenom.setBounds(149, 11, 53, 28);
		contentPane.add(lblPrenom);
		
		JLabel lblAdresse = new JLabel("ADRESSE");
		lblAdresse.setBounds(327, 11, 79, 28);
		contentPane.add(lblAdresse);
	}
}
