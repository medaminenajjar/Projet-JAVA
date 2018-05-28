package com.app.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameModifierCompte {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameModifierCompte window = new FrameModifierCompte();
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
	public FrameModifierCompte() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Modifier Compte");
		frame.setSize(600,400);
		//frame.setBounds(100, 100, 450, 300);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		
		JLabel lblVosInformationsPersonnelles = new JLabel("Modifier Compte");
		lblVosInformationsPersonnelles.setForeground(new Color(255, 0, 0));
		lblVosInformationsPersonnelles.setFont(new Font("LM Roman 12", Font.BOLD, 17));
		lblVosInformationsPersonnelles.setBounds(34, 12, 288, 32);
		frame.getContentPane().add(lblVosInformationsPersonnelles);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(96, 94, 70, 15);
		frame.getContentPane().add(lblNom);
		
		textField = new JTextField();
		textField.setBounds(301, 90, 232, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnA = new JButton("");
		btnA.setIcon(new ImageIcon("src/image/1458948601_Edit-Male-User.png"));
		btnA.setBounds(301, 295, 48, 52);
		frame.getContentPane().add(btnA);
		
		JLabel lblSoldInitial = new JLabel("Sold Initial");
		lblSoldInitial.setBounds(96, 147, 114, 15);
		frame.getContentPane().add(lblSoldInitial);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(301, 145, 232, 24);
		frame.getContentPane().add(textField_1);
		
		JLabel lblDevise = new JLabel("Devise");
		lblDevise.setBounds(96, 199, 114, 15);
		frame.getContentPane().add(lblDevise);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"$", "€", "£", "¥"}));
		comboBox_1.setBounds(301, 194, 48, 24);
		frame.getContentPane().add(comboBox_1);
		
		JCheckBox chckbxCeCompteEst = new JCheckBox("Ce compte est bloqué");
		chckbxCeCompteEst.setBounds(96, 242, 196, 23);
		frame.getContentPane().add(chckbxCeCompteEst);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/root/samething/Projet/src/image/abstrait-abstract-background-vecteur-arrière-plan-forme-voile-1560x1103.jpg"));
		label.setBounds(0, 0, 598, 365);
		frame.getContentPane().add(label);
		
		
		frame.setVisible(true);
		//frame.setResizable(false);
	}
}
