package javaVehicule;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SpringLayout;

public class Entree extends JDialog {
	JComboBox comboBox = new JComboBox();
	private final JLabel lblNewLabel = new JLabel("Vous etes?");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Entree dialog = new Entree();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Entree() {
		setTitle("INTERFACE D'ENTREE");
		setResizable(false);
		setBounds(100, 100, 314, 119);
		getContentPane().setLayout(null);
		{
			comboBox.setBounds(74, 10, 224, 33);
			comboBox.addItem("Client");
			comboBox.addItem("Gestionnaire");
			getContentPane().add(comboBox);
		}
		JButton okButton = new JButton("OK");
		okButton.setBounds(10, 49, 288, 33);
		getContentPane().add(okButton);
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if( (comboBox.getSelectedItem().toString() ).equals("Client") )
				{
				InterfaceClient intC=new InterfaceClient();
				intC.setVisible(true); 
				}
				else
				{
				Gestionnaire gestC=new Gestionnaire();
				gestC.setVisible(true); 
				JLabel labell = new JLabel("Welcome:");
				gestC.getContentPane().add(labell);

				}
			}
		});
		okButton.setActionCommand("OK");
		getRootPane().setDefaultButton(okButton);
		{
			lblNewLabel.setBounds(10, 19, 65, 14);
			getContentPane().add(lblNewLabel);
		}
	}
}
