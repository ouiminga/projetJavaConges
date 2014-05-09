package javaVehicule;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.TextArea;
import javax.swing.JLabel;

public class AfficherListingCompletDuParcAuto extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AfficherListingCompletDuParcAuto frame = new AfficherListingCompletDuParcAuto();
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
	public AfficherListingCompletDuParcAuto() {
		setTitle("AFFICHER RLISTING COMPLET DU PARC AUTO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(10, 41, 563, 211);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("TYPE DE VEHICULE");
		lblNewLabel.setBounds(39, 11, 107, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblCarburant = new JLabel("CARBURANT");
		lblCarburant.setBounds(205, 11, 75, 24);
		contentPane.add(lblCarburant);
		
		JLabel lblMarque = new JLabel("MARQUE");
		lblMarque.setBounds(370, 11, 65, 24);
		contentPane.add(lblMarque);
		
		JLabel lblModel = new JLabel("MODEL");
		lblModel.setBounds(490, 11, 50, 24);
		contentPane.add(lblModel);
	}
}
