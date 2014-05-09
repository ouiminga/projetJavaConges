package javaVehicule;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Gestionnaire extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Gestionnaire dialog = new Gestionnaire();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Gestionnaire() {
		setTitle("GESTIONNAIRE");
		setBounds(100, 100, 411, 119);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Vous voulez ?");
			lblNewLabel.setBounds(10, 19, 78, 14);
			contentPanel.add(lblNewLabel);
		}
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(90, 12, 295, 29);
		comboBox.addItem("Rechercher un véhicule par plusieurs critères");
		comboBox.addItem("Afficher un listing complet du parc auto");
		comboBox.addItem("Afficher la liste des clients");
		comboBox.addItem("Afficher la liste des véhicules en location");
		comboBox.addItem("Ajouter/Supprimer un véhicule d parc");
		
		contentPanel.add(comboBox);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 52, 395, 29);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(null);
			
			JButton btnNewButton = new JButton("OK");
			btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					
					switch (comboBox.getSelectedItem().toString() )
					{
					/*Rechercher un véhicule par plusieurs critères (type de véhicule, par carburant, par marque et model)
					Afficher un listing complet du parc auto.
					Afficher la liste des clients.
					Afficher la liste des véhicule en location (afficher une liste de couples Véhicules/Client loueur)
					Ajouter un véhicule au parc.
					Supprimer un véhicule du parc.*/
					  case "Rechercher un véhicule par plusieurs critères" :
						RechercheVehiculeParNbreuxCritere rechercheVehiculeParNbreuxCritere = new RechercheVehiculeParNbreuxCritere();
						rechercheVehiculeParNbreuxCritere.setVisible(true);
						break; 
					  case "Afficher un listing complet du parc auto":
						  AfficherListingCompletDuParcAuto afficherListingCompletDuParcAuto = new AfficherListingCompletDuParcAuto();
						  afficherListingCompletDuParcAuto.setVisible(true);
							break;  
					  case "Afficher la liste des clients":
						  AfficherListeDesClients afficherListeDesClients = new AfficherListeDesClients();
						  afficherListeDesClients.setVisible(true);
							break; 
					  case "Afficher la liste des véhicules en location":
						  AfficherListedesVehiculeEnLocation afficherListedesVehiculeEnLocation = new AfficherListedesVehiculeEnLocation();
						  afficherListedesVehiculeEnLocation.setVisible(true);
							break; 
					  case "Ajouter/Supprimer un véhicule d parc":
						  AjouterSupprimerVehicule ajouterSupprimerVehicule = new AjouterSupprimerVehicule();
						  ajouterSupprimerVehicule.setVisible(true);
							break;            
					}
				}
			});
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnNewButton.setBounds(261, 0, 124, 23);
			buttonPane.add(btnNewButton);
		}
	}
}
