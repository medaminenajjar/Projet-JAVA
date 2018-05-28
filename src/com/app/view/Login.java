package com.app.view;
import com.app.controller.*;
import com.app.entity.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;


import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login {

	JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private Controller controller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					//window.frame.setVisible(true);
					//window.frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Connexion");
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBackground(Color.WHITE);
		frame.getContentPane().add(layeredPane);
		
		JLabel lblLogin = new JLabel("Pseudo");
		lblLogin.setFont(new Font("L M Sans10", Font.BOLD, 20));
		lblLogin.setBackground(Color.WHITE);
		lblLogin.setBounds(60, 94, 95, 24);
		layeredPane.add(lblLogin);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setFont(new Font("LM Sans 10", Font.BOLD, 20));
		lblMotDePasse.setBounds(60, 130, 154, 24);
		layeredPane.add(lblMotDePasse);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if ( e.getKeyCode() == e.VK_ENTER)
					if (controller != null )
					controller.loginPerformed(new Connexion(textField.getText(), String.valueOf(passwordField.getPassword())));
			//System.out.println("goooood");
			}
		});
		textField.setBounds(213, 94, 145, 25);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		JButton btnConnexion = new JButton("");
		//btnConnexion.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));

		btnConnexion.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			      //System.out.println(e.getKeyChar());
				if ( e.getKeyCode() == e.VK_ENTER)
					if (controller != null )
					controller.loginPerformed(new Connexion(textField.getText(), String.valueOf(passwordField.getPassword())));
			//System.out.println("goooood");
			}
		});
		btnConnexion.setIcon(new ImageIcon("src/image/User_login_man.png"));
		btnConnexion.setFont(new Font("DejaVu Sans", Font.BOLD, 14));
		btnConnexion.setForeground(Color.BLACK);
		btnConnexion.setBackground(SystemColor.window);
		btnConnexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (controller != null)
					controller.loginPerformed(new Connexion(textField.getText(), String.valueOf(passwordField.getPassword())));
			System.out.println("goooood");
			}
		});
		btnConnexion.setBounds(334, 178, 63, 53);
		layeredPane.add(btnConnexion);
		
		JLabel lblGestionDesComptes = new JLabel("Gestion Des Comptes Bancaires");
		lblGestionDesComptes.setFont(new Font("L M Roman Dunh10", Font.BOLD, 20));
		lblGestionDesComptes.setHorizontalAlignment(SwingConstants.CENTER);
		lblGestionDesComptes.setForeground(Color.RED);
		lblGestionDesComptes.setBounds(49, 25, 330, 45);
		layeredPane.add(lblGestionDesComptes);
		
		passwordField = new JPasswordField(50);
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if ( e.getKeyCode() == e.VK_ENTER)
					if (controller != null )
					controller.loginPerformed(new Connexion(textField.getText(), String.valueOf(passwordField.getPassword())));
			//System.out.println("goooood");
				
			}
		});
		passwordField.setBounds(213, 137, 145, 25);
		layeredPane.add(passwordField);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/root/samething/Projet/src/image/silver-313347_960_720.jpg"));
		label.setBounds(-51, 0, 510, 277);
		layeredPane.add(label);
		
	    //lblLogin.setEnabled(true);
		frame.setVisible(true);
		frame.setResizable(false);
	}
	
	public JFrame getFrame() {
		return frame;
		
	}
	public void setLoginListner(LoginListners ctr) {
		controller = (Controller) ctr;
	} 
	
}
