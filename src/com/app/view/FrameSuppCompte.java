package com.app.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameSuppCompte {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameSuppCompte window = new FrameSuppCompte();
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
	public FrameSuppCompte() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Supprime Compte");
		frame.setSize(500,250);
		//frame.setBounds(100, 100, 450, 300);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		
		JLabel lblVosInformationsPersonnelles = new JLabel("Supprimé Compte");
		lblVosInformationsPersonnelles.setForeground(new Color(255, 0, 0));
		lblVosInformationsPersonnelles.setFont(new Font("LM Roman 12", Font.BOLD, 17));
		lblVosInformationsPersonnelles.setBounds(34, 12, 288, 32);
		frame.getContentPane().add(lblVosInformationsPersonnelles);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(74, 68, 70, 15);
		frame.getContentPane().add(lblNom);
		
		textField = new JTextField();
		textField.setBounds(207, 64, 232, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnA = new JButton("");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnA.setIcon(new ImageIcon("src/image/1458948595_Remove-Male-User.png"));
		btnA.setBounds(317, 124, 48, 52);
		frame.getContentPane().add(btnA);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("src/image/abstrait-abstract-background-vecteur-arrière-plan-forme-voile-1560x1103.jpg"));
		label.setBounds(0, 0, 498, 215);
		frame.getContentPane().add(label);
		
		frame.setVisible(true);
		frame.setResizable(false);
	}
}
