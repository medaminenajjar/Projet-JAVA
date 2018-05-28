package com.app.view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class FrameVirement {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameVirement window = new FrameVirement();
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
	public FrameVirement() {
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
		frame.setBounds(100, 100, 700, 550);
		frame.getContentPane().setLayout(null);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JDateChooser dateChooser = new JDateChooser();
		
		dateChooser.setBounds(371, 167, 201, 27);
		frame.getContentPane().add(dateChooser);
		
		JLabel lblAjouteUneOperation = new JLabel("Ajoute une operation (Virement)");
		lblAjouteUneOperation.setFont(new Font("L M Roman Demi10", Font.BOLD | Font.ITALIC, 19));
		lblAjouteUneOperation.setForeground(new Color(255, 0, 0));
		lblAjouteUneOperation.setBounds(37, 12, 316, 35);
		frame.getContentPane().add(lblAjouteUneOperation);
		
		JLabel lblDateDeCration = new JLabel("Date de création");
		lblDateDeCration.setBounds(101, 167, 158, 20);
		frame.getContentPane().add(lblDateDeCration);
		
		JLabel lblMontant = new JLabel("Montant");
		lblMontant.setBounds(101, 214, 166, 20);
		frame.getContentPane().add(lblMontant);
		
		textField = new JTextField();
		textField.setBounds(371, 207, 201, 27);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblRferance = new JLabel("Réferance");
		lblRferance.setBounds(101, 259, 166, 20);
		frame.getContentPane().add(lblRferance);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("");
		textField_1.setColumns(10);
		textField_1.setBounds(371, 256, 201, 27);
		frame.getContentPane().add(textField_1);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(101, 307, 166, 20);
		frame.getContentPane().add(lblDescription);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon("src/image/Add.png"));
		button.setBounds(304, 425, 98, 58);
		frame.getContentPane().add(button);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(101, 335, 471, 77);
		frame.getContentPane().add(editorPane);
		
		JLabel lblVersLeCompte = new JLabel("Vers Le Compte");
		lblVersLeCompte.setBounds(101, 119, 158, 15);
		frame.getContentPane().add(lblVersLeCompte);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(371, 117, 201, 27);
		frame.getContentPane().add(textField_2);
		
		JLabel lblDuCompte = new JLabel("Du Compte");
		lblDuCompte.setBounds(101, 73, 124, 15);
		frame.getContentPane().add(lblDuCompte);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(371, 71, 201, 27);
		frame.getContentPane().add(textField_3);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/root/samething/Projet/src/image/abstrait-abstract-background-vecteur-arrière-plan-forme-voile-1560x1103.jpg"));
		label.setBounds(0, 0, 698, 515);
		frame.getContentPane().add(label);
		
	}
}
