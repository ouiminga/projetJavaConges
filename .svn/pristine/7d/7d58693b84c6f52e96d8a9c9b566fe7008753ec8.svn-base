package javaVehicule;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextArea;
import java.awt.Label;

public class AfficherListedesVehiculeEnLocation extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AfficherListedesVehiculeEnLocation frame = new AfficherListedesVehiculeEnLocation();
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
	public AfficherListedesVehiculeEnLocation() {
		setTitle("LISTE COMPLETE DES VEHICULES LOUEE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(10, 46, 332, 216);
		contentPane.add(textArea);
		
		Label label = new Label("CLIENT LOCATAIRE");
		label.setBounds(30, 10, 114, 30);
		contentPane.add(label);
		
		Label label_1 = new Label("VOITURE LOUEE");
		label_1.setBounds(204, 10, 107, 30);
		contentPane.add(label_1);
	}
}
