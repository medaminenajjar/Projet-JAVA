package com.app.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.app.controller.ActionPerformed;
import com.app.controller.ControllerModifierClient;
import com.app.controller.ControllerModifierClient0;
import com.app.entity.Client;
import com.app.entity.Connexion;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameModifierClient0 {

	private JFrame frame;
	private JTextField textField;
	private  String [] tabContenu;
	private ControllerModifierClient0 controllerMC0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameModifierClient0 window = new FrameModifierClient0();
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
	public FrameModifierClient0() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		
		
		

		frame = new JFrame("Modifier Client");
		frame.setBounds(100, 100, 450, 300);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblVosInformationsPersonnelles = new JLabel("Modifier Client");
		lblVosInformationsPersonnelles.setForeground(new Color(255, 0, 0));
		lblVosInformationsPersonnelles.setFont(new Font("LM Roman 12", Font.BOLD, 17));
		lblVosInformationsPersonnelles.setBounds(34, 12, 288, 32);
		frame.getContentPane().add(lblVosInformationsPersonnelles);
		
		
		JLabel lblCodeOffre = new JLabel("CIN");
		lblCodeOffre.setBounds(79, 73, 124, 15);
		frame.getContentPane().add(lblCodeOffre);
		
		
	
		JButton btnA = new JButton("");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//new FrameModifierClient();
				//ControllerModifierClient0 controller = new ControllerModifierClient0();
				controllerMC0 = new ControllerModifierClient0();
				if (controllerMC0 != null)
					{controllerMC0.modifyPerformed(""+textField.getText(), tabContenu);}
			}
		});
		btnA.setIcon(new ImageIcon("src/image/1458948601_Edit-Male-User.png"));
		btnA.setBounds(189, 100, 48, 52);
		frame.getContentPane().add(btnA);
		
		textField = new JTextField();
		textField.setBounds(221, 68, 177, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		frame.setVisible(true);
		frame.setSize(450,200);
		frame.setResizable(false);
	
	
	
	}


	public void setClientListner(ActionPerformed<Client> ctr) {
		controllerMC0 =  (ControllerModifierClient0) ctr;
	}

}
