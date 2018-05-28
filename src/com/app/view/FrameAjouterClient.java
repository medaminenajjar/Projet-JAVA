package com.app.view;

import java.awt.EventQueue;
import com.app.controller.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.awt.Color;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.app.controller.*;
import com.app.entity.Client;
import javax.swing.JPasswordField;
public class FrameAjouterClient {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_2;
	private ControllerAddClient controllerAC;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameAjouterClient window = new FrameAjouterClient();
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
	public FrameAjouterClient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Ajouter Client");
		frame.setBounds(100, 100, 600, 700);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCivilit = new JLabel("Civilité");
		lblCivilit.setBounds(96, 61, 70, 15);
		frame.getContentPane().add(lblCivilit);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Monsieur", "Madame", "Mademoiselle"}));
		comboBox.setBounds(314, 56, 232, 24);
		frame.getContentPane().add(comboBox);
		
		JLabel lblVosInformationsPersonnelles = new JLabel("Vos informations personnelles");
		lblVosInformationsPersonnelles.setForeground(new Color(255, 0, 0));
		lblVosInformationsPersonnelles.setFont(new Font("LM Roman 12", Font.BOLD, 17));
		lblVosInformationsPersonnelles.setBounds(34, 12, 288, 32);
		frame.getContentPane().add(lblVosInformationsPersonnelles);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(96, 101, 70, 15);
		frame.getContentPane().add(lblNom);
		
		JLabel lblPrnom = new JLabel("Prénom");
		lblPrnom.setBounds(96, 146, 70, 15);
		frame.getContentPane().add(lblPrnom);
		
		JLabel lblDateDeNaissance = new JLabel("Date de naissance");
		lblDateDeNaissance.setBounds(96, 187, 154, 15);
		frame.getContentPane().add(lblDateDeNaissance);
		
		JLabel lblNumroRue = new JLabel("Numéro + rue");
		lblNumroRue.setBounds(96, 226, 194, 15);
		frame.getContentPane().add(lblNumroRue);
		
		JLabel lblVille = new JLabel("Ville");
		lblVille.setBounds(96, 270, 70, 15);
		frame.getContentPane().add(lblVille);
		
		JLabel lblPaysDeRsidence = new JLabel("Pays de résidence");
		lblPaysDeRsidence.setBounds(96, 313, 141, 15);
		frame.getContentPane().add(lblPaysDeRsidence);
		
		JLabel lblNumroDeTlphone = new JLabel("Numéro de téléphone");
		lblNumroDeTlphone.setBounds(96, 358, 154, 15);
		frame.getContentPane().add(lblNumroDeTlphone);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(96, 398, 70, 15);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblCodeOffre = new JLabel("CIN");
		lblCodeOffre.setBounds(96, 442, 124, 15);
		frame.getContentPane().add(lblCodeOffre);
		
		textField = new JTextField();
		textField.setBounds(314, 99, 232, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(314, 144, 232, 24);
		frame.getContentPane().add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(314, 224, 232, 24);
		frame.getContentPane().add(textField_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(314, 268, 232, 24);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(314, 311, 232, 24);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(314, 356, 232, 24);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(314, 396, 232, 24);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(314, 433, 232, 24);
		frame.getContentPane().add(textField_9);
		
		final JDateChooser dateChooser = new JDateChooser();
		
		dateChooser.setBounds(314, 185, 232, 20);
		frame.getContentPane().add(dateChooser);
		
		

	    
	    
		JButton btnA = new JButton("");
		btnA.addActionListener(new ActionListener() {
			


			//private java.util.Date laDate;

			public void actionPerformed(ActionEvent arg0) {
				
				if ("".equals(""+comboBox.getSelectedIndex()) || "".equals(textField.getText()) ||"".equals(textField_1.getText())||"".equals(textField_2.getText()) ||"".equals(textField_3.getText()) ||"".equals(textField_5.getText()) ||"".equals(textField_5.getText()) ||"".equals(textField_6.getText())||"".equals(textField_7.getText()) ||"".equals(textField_8.getText()) ||"".equals(textField_9.getText()) || "".equals(String.valueOf(passwordField.getPassword()))  ) {
					JOptionPane.showMessageDialog(null, "ERROR ADD INTO DB des champs Non rempli", "Message d'avertissement",
							JOptionPane.ERROR_MESSAGE);
				} else {
				final java.util.Date date = (java.util.Date) dateChooser.getDate();
				controllerAC = new ControllerAddClient();
				if (controllerAC != null){
					Locale locale = Locale.getDefault();
			    DateFormat df;
			 
			    /** 2. Construction du DateFormat en choisiant un format :
			    * SHORT = 01/01/2002
			    * FULL = lundi 1 janvier 2002
			    */ 
			    df= DateFormat.getDateInstance(DateFormat.SHORT, locale);
			    String bonneDate = df.format(date);
			    System.out.println("La date choisie ! " + bonneDate);
					controllerAC.addPerformed(new Client(""+comboBox.getSelectedIndex(),textField.getText(),textField_1.getText(),""+bonneDate,textField_9.getText(),textField_3.getText(),textField_5.getText(),textField_6.getText(),textField_7.getText(),textField_8.getText(),textField_2.getText(),String.valueOf(passwordField.getPassword())));
				}
				}	
			}
		});
		btnA.setIcon(new ImageIcon("src/image/1458948716_Add-Male-User.png"));
		btnA.setBounds(249, 562, 48, 52);
		frame.getContentPane().add(btnA);
		
		JLabel lblPseudo = new JLabel("Pseudo");
		lblPseudo.setBounds(96, 488, 124, 15);
		frame.getContentPane().add(lblPseudo);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setBounds(96, 524, 124, 15);
		frame.getContentPane().add(lblMotDePasse);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(314, 486, 232, 24);
		frame.getContentPane().add(textField_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(314, 520, 232, 24);
		frame.getContentPane().add(passwordField);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/root/samething/Projet/src/image/abstrait-abstract-background-vecteur-arrière-plan-forme-voile-1560x1103.jpg"));
		label.setBounds(0, 0, 598, 665);
		frame.getContentPane().add(label);
		
		frame.setVisible(true);
		//frame.setSize(600,700);
		frame.setResizable(false);
	}
	
	public void setClientListner(ActionPerformed<Client> ctr) {
		controllerAC =  (ControllerAddClient) ctr;
	} 
}
