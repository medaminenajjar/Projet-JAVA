package com.app.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.app.model.*;
import com.app.controller.*;
import com.app.entity.Client;
import com.toedter.calendar.JDateChooser;

public class FrameModifierClient {

	private JFrame frame;
	private JTextField textField;
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public JTextField getTextField_5() {
		return textField_5;
	}

	public void setTextField_5(JTextField textField_5) {
		this.textField_5 = textField_5;
	}

	public JTextField getTextField_6() {
		return textField_6;
	}

	public void setTextField_6(JTextField textField_6) {
		this.textField_6 = textField_6;
	}

	public JTextField getTextField_7() {
		return textField_7;
	}

	public void setTextField_7(JTextField textField_7) {
		this.textField_7 = textField_7;
	}

	public JTextField getTextField_8() {
		return textField_8;
	}

	public void setTextField_8(JTextField textField_8) {
		this.textField_8 = textField_8;
	}

	public JTextField getTextField_9() {
		return textField_9;
	}

	public void setTextField_9(JTextField textField_9) {
		this.textField_9 = textField_9;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}



	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private ControllerModifierClient controllerMC;
	private String [] tab;
	private JTextField textField_2;
	private JPasswordField passwordField; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameModifierClient window = new FrameModifierClient();
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
	public FrameModifierClient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Modifier Client");
		frame.setBounds(100, 100, 600, 700);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tab = new  String[20];
		JLabel lblCivilit = new JLabel("Civilité");
		lblCivilit.setBounds(85, 61, 70, 15);
		frame.getContentPane().add(lblCivilit);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Veuillez choisir votre civilité", "Monsieur", "Madame", "Mademoiselle"}));
		comboBox.setBounds(303, 56, 232, 24);
		frame.getContentPane().add(comboBox);
		
		JLabel lblVosInformationsPersonnelles = new JLabel("Modifier les parametres de ");
		lblVosInformationsPersonnelles.setForeground(new Color(255, 0, 0));
		lblVosInformationsPersonnelles.setFont(new Font("LM Roman 12", Font.BOLD, 17));
		lblVosInformationsPersonnelles.setBounds(34, 12, 288, 32);
		frame.getContentPane().add(lblVosInformationsPersonnelles);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(85, 101, 70, 15);
		frame.getContentPane().add(lblNom);
		
		JLabel lblPrnom = new JLabel("Prénom");
		lblPrnom.setBounds(85, 146, 70, 15);
		frame.getContentPane().add(lblPrnom);
		
		JLabel lblDateDeNaissance = new JLabel("Date de naissance");
		lblDateDeNaissance.setBounds(85, 187, 154, 15);
		frame.getContentPane().add(lblDateDeNaissance);
		
		JLabel lblNumroRue = new JLabel("Numéro + rue");
		lblNumroRue.setBounds(85, 226, 194, 15);
		frame.getContentPane().add(lblNumroRue);
		
		JLabel lblVille = new JLabel("Ville");
		lblVille.setBounds(85, 273, 70, 15);
		frame.getContentPane().add(lblVille);
		
		JLabel lblPaysDeRsidence = new JLabel("Pays de résidence");
		lblPaysDeRsidence.setBounds(85, 316, 141, 15);
		frame.getContentPane().add(lblPaysDeRsidence);
		
		JLabel lblNumroDeTlphone = new JLabel("Numéro de téléphone");
		lblNumroDeTlphone.setBounds(85, 361, 154, 15);
		frame.getContentPane().add(lblNumroDeTlphone);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(85, 401, 70, 15);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblCodeOffre = new JLabel("CIN");
		lblCodeOffre.setBounds(85, 445, 124, 15);
		frame.getContentPane().add(lblCodeOffre);
		
		textField = new JTextField();
		textField.setBounds(303, 99, 232, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(303, 144, 232, 24);
		frame.getContentPane().add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(303, 224, 232, 24);
		frame.getContentPane().add(textField_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(303, 271, 232, 24);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(303, 314, 232, 24);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(303, 359, 232, 24);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(303, 399, 232, 24);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(303, 436, 232, 24);
		frame.getContentPane().add(textField_9);
		
		final JDateChooser dateChooser = new JDateChooser();
		
		dateChooser.setBounds(303, 185, 232, 20);
		frame.getContentPane().add(dateChooser);
		
		JButton btnA = new JButton("");
		btnA.setIcon(new ImageIcon("src/image/1458948601_Edit-Male-User.png"));
		btnA.setBounds(250, 566, 48, 52);
		frame.getContentPane().add(btnA);

		JLabel lblPseudo = new JLabel("Pseudo");
		lblPseudo.setBounds(85, 484, 124, 15);
		frame.getContentPane().add(lblPseudo);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setBounds(85, 526, 124, 15);
		frame.getContentPane().add(lblMotDePasse);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(303, 482, 232, 24);
		frame.getContentPane().add(textField_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(303, 522, 232, 24);
		frame.getContentPane().add(passwordField);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/root/samething/Projet/src/image/abstrait-abstract-background-vecteur-arrière-plan-forme-voile-1560x1103.jpg"));
		label.setBounds(0, 0, 598, 665);
		frame.getContentPane().add(label);
		
		
		
		btnA.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (controllerMC != null){
					final java.util.Date date = (java.util.Date) dateChooser.getDate();

					Locale locale = Locale.getDefault();
				    DateFormat df;
				 
				    /** 2. Construction du DateFormat en choisiant un format :
				    * SHORT = 01/01/2002
				    * FULL = lundi 1 janvier 2002
				    */ 
				    df= DateFormat.getDateInstance(DateFormat.SHORT, locale);
				    String bonneDate = df.format(date);
				    System.out.println("La date choisie ! " + bonneDate);
					
					tab[1] = ""+comboBox.getSelectedIndex();
					tab[2] =textField.getText();
					tab[3] =textField_1.getText();
					tab[4] =""+bonneDate;
					tab[5] =textField_3.getText();
					tab[6] =textField_5.getText();
					tab[7] =textField_6.getText();
					tab[8] =textField_7.getText();
					tab[9] =textField_8.getText();
					tab[10] =textField_9.getText();
					tab[11] =textField_2.getText();
					tab[12] =String.valueOf(passwordField.getPassword());
					for (int i = 1; i < tab.length; i++) {
						System.out.println(tab[i]);
					}
					controllerMC.modifyPerformed(textField_9.getText(),tab);
					JOptionPane.showMessageDialog(null, "Successfull Alter", "Message d'avertissement",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		frame.setVisible(true);
		//frame.setSize(600,700);
		frame.setResizable(false);
	}

	
	
	public void setClientListner(ActionPerformed<Client> ctr) {
		controllerMC =  (ControllerModifierClient) ctr;
	}
}




