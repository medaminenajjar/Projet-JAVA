package com.app.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class FrameDebit {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameDebit window = new FrameDebit();
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrameDebit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Ajouter Operation");
		//frame.setSize(700, 500);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setBounds(100, 100, 700, 600);
		frame.getContentPane().setLayout(null);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JDateChooser dateChooser = new JDateChooser();
		
		dateChooser.setBounds(377, 126, 201, 27);
		frame.getContentPane().add(dateChooser);
		
		JLabel lblAjouteUneOperation = new JLabel("Ajoute une operation (Credit)");
		lblAjouteUneOperation.setFont(new Font("L M Roman Demi10", Font.BOLD | Font.ITALIC, 19));
		lblAjouteUneOperation.setForeground(new Color(255, 0, 0));
		lblAjouteUneOperation.setBounds(29, 12, 316, 35);
		frame.getContentPane().add(lblAjouteUneOperation);
		
		JLabel lblDateDeCration = new JLabel("Date de création");
		lblDateDeCration.setBounds(107, 126, 158, 20);
		frame.getContentPane().add(lblDateDeCration);
		
		JLabel lblMontant = new JLabel("Montant");
		lblMontant.setBounds(107, 173, 166, 20);
		frame.getContentPane().add(lblMontant);
		
		textField = new JTextField();
		textField.setBounds(377, 166, 201, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblModeDePaiement = new JLabel("Mode de paiement");
		lblModeDePaiement.setBounds(107, 218, 166, 20);
		frame.getContentPane().add(lblModeDePaiement);
		
		JComboBox comboBox = new JComboBox();		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cash", "Check", "Credit Carte", "Non Spécifier"}));
		comboBox.setBounds(377, 215, 201, 27);
		frame.getContentPane().add(comboBox);
		
		JLabel lblCatgorie = new JLabel("Catégorie");
		lblCatgorie.setBounds(107, 265, 166, 20);
		frame.getContentPane().add(lblCatgorie);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Non Spécifier"}));
		comboBox_1.setBounds(377, 262, 201, 27);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblRferance = new JLabel("Réferance");
		lblRferance.setBounds(107, 317, 166, 20);
		frame.getContentPane().add(lblRferance);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("");
		textField_1.setColumns(10);
		textField_1.setBounds(377, 314, 201, 27);
		frame.getContentPane().add(textField_1);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(107, 365, 166, 20);
		frame.getContentPane().add(lblDescription);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("src/image/Add.png"));
		button.setBounds(316, 482, 98, 58);
		frame.getContentPane().add(button);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(107, 393, 471, 77);
		frame.getContentPane().add(editorPane);
		
		JLabel lblCompte = new JLabel("Compte");
		lblCompte.setBounds(107, 88, 124, 15);
		frame.getContentPane().add(lblCompte);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(377, 86, 201, 27);
		frame.getContentPane().add(textField_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/root/samething/Projet/src/image/abstrait-abstract-background-vecteur-arrière-plan-forme-voile-1560x1103.jpg"));
		label.setBounds(0, 0, 686, 565);
		frame.getContentPane().add(label);
		
	}
}
