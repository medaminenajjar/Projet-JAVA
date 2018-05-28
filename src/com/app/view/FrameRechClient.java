package com.app.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.app.controller.ActionPerformed;
import com.app.controller.ControllerRechClient;
import com.app.entity.Client;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameRechClient {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private ControllerRechClient controllerRC ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameRechClient window = new FrameRechClient();
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
	public FrameRechClient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame("Rechercher Client");
		frame.setBounds(100, 100, 600, 700);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCivilit = new JLabel("Civilité");
		lblCivilit.setBounds(96, 94, 70, 15);
		frame.getContentPane().add(lblCivilit);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Monsieur", "Madame", "Mademoiselle"}));
		comboBox.setBounds(314, 89, 232, 24);
		frame.getContentPane().add(comboBox);
		
		JLabel lblVosInformationsPersonnelles = new JLabel("Rechercher Client");
		lblVosInformationsPersonnelles.setForeground(new Color(255, 0, 0));
		lblVosInformationsPersonnelles.setFont(new Font("LM Roman 12", Font.BOLD, 17));
		lblVosInformationsPersonnelles.setBounds(34, 12, 288, 32);
		frame.getContentPane().add(lblVosInformationsPersonnelles);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(96, 134, 70, 15);
		frame.getContentPane().add(lblNom);
		
		JLabel lblPrnom = new JLabel("Prénom");
		lblPrnom.setBounds(96, 179, 70, 15);
		frame.getContentPane().add(lblPrnom);
		
		JLabel lblDateDeNaissance = new JLabel("Date de naissance");
		lblDateDeNaissance.setBounds(96, 220, 154, 15);
		frame.getContentPane().add(lblDateDeNaissance);
		
		JLabel lblNumroRue = new JLabel("Numéro + rue");
		lblNumroRue.setBounds(96, 259, 194, 15);
		frame.getContentPane().add(lblNumroRue);
		
		JLabel lblCodePostal = new JLabel("Code postal");
		lblCodePostal.setBounds(96, 304, 124, 15);
		frame.getContentPane().add(lblCodePostal);
		
		JLabel lblVille = new JLabel("Ville");
		lblVille.setBounds(96, 345, 70, 15);
		frame.getContentPane().add(lblVille);
		
		JLabel lblPaysDeRsidence = new JLabel("Pays de résidence");
		lblPaysDeRsidence.setBounds(96, 388, 141, 15);
		frame.getContentPane().add(lblPaysDeRsidence);
		
		JLabel lblNumroDeTlphone = new JLabel("Numéro de téléphone");
		lblNumroDeTlphone.setBounds(96, 433, 154, 15);
		frame.getContentPane().add(lblNumroDeTlphone);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(96, 473, 70, 15);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblCodeOffre = new JLabel("CIN");
		lblCodeOffre.setBounds(96, 517, 124, 15);
		frame.getContentPane().add(lblCodeOffre);
		
		textField = new JTextField();
		textField.setBounds(314, 132, 232, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(314, 177, 232, 24);
		frame.getContentPane().add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(314, 257, 232, 24);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(314, 302, 232, 24);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(314, 343, 232, 24);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(314, 386, 232, 24);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(314, 431, 232, 24);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(314, 471, 232, 24);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(314, 508, 232, 24);
		frame.getContentPane().add(textField_9);
		
		JDateChooser dateChooser = new JDateChooser();
		
		dateChooser.setBounds(314, 218, 232, 20);
		frame.getContentPane().add(dateChooser);
		
		JButton btnA = new JButton("");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controllerRC = new ControllerRechClient();
				if (controllerRC != null)
					controllerRC.SearchPerformed(textField.getText());
			}
		});
		btnA.setIcon(new ImageIcon("src/image/1458948588_Search-Male-User.png"));
		btnA.setBounds(259, 587, 48, 52);
		frame.getContentPane().add(btnA);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("src/image/abstrait-abstract-background-vecteur-arrière-plan-forme-voile-1560x1103.jpg"));
		label.setBounds(0, 0, 598, 665);
		frame.getContentPane().add(label);
		
		frame.setVisible(true);
		//frame.setSize(600,700);
		frame.setResizable(false);
		
		
	}
	
	public void setClientListner(ActionPerformed<Client> ctr) {
		controllerRC =  (ControllerRechClient) ctr;
	}

}
