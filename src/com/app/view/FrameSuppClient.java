package com.app.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.app.controller.ActionPerformed;
import com.app.controller.ControllerSuppClient;
import com.app.entity.Client;

public class FrameSuppClient {

	private JFrame frame;
	private JTextField textField;
	private ControllerSuppClient controllerSC ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameSuppClient window = new FrameSuppClient();
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
	public FrameSuppClient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	
	
	
		frame = new JFrame("Supprimer Client");
		frame.setBounds(100, 100, 450, 300);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblVosInformationsPersonnelles = new JLabel("Supprimer Client");
		lblVosInformationsPersonnelles.setForeground(new Color(255, 0, 0));
		lblVosInformationsPersonnelles.setFont(new Font("LM Roman 12", Font.BOLD, 17));
		lblVosInformationsPersonnelles.setBounds(34, 12, 288, 32);
		frame.getContentPane().add(lblVosInformationsPersonnelles);
		
		
		JLabel lblCodeOffre = new JLabel("CIN");
		lblCodeOffre.setBounds(79, 73, 124, 15);
		frame.getContentPane().add(lblCodeOffre);
		
		
	
		JButton btnA = new JButton("");
		btnA.setIcon(new ImageIcon("src/image/1458948595_Remove-Male-User.png"));
		btnA.setBounds(189, 100, 48, 52);
		frame.getContentPane().add(btnA);
		btnA.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				controllerSC = new ControllerSuppClient();
				if (controllerSC != null)
					controllerSC.removePerformed(textField.getText());
				System.out.println("goooood");
			
				
			}
		});
		textField = new JTextField();
		textField.setBounds(221, 68, 177, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/root/samething/Projet/src/image/abstrait-abstract-background-vecteur-arrière-plan-forme-voile-1560x1103.jpg"));
		label.setBounds(0, 0, 448, 165);
		frame.getContentPane().add(label);
		
		frame.setVisible(true);
		frame.setSize(450,200);
		frame.setResizable(false);
	
	
	
	
	}
	public void setClientListner(ActionPerformed<Client> ctr) {
		controllerSC =  (ControllerSuppClient) ctr;
	}
}
