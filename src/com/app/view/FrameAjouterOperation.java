package com.app.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class FrameAjouterOperation {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameAjouterOperation window = new FrameAjouterOperation();
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
	public FrameAjouterOperation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Ajouter Operation");
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 230);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAjouterUnOperation = new JLabel("Ajouter une operation");
		lblAjouterUnOperation.setFont(new Font("L M Sans Demi Cond10", Font.BOLD | Font.ITALIC, 20));
		lblAjouterUnOperation.setForeground(new Color(255, 0, 0));
		lblAjouterUnOperation.setBounds(29, 12, 227, 33);
		frame.getContentPane().add(lblAjouterUnOperation);
		
		ButtonGroup group = new ButtonGroup();
		
		JButton btnUnDebit = new JButton("");
		btnUnDebit.setIcon(new ImageIcon("src/image/Add.png"));
		btnUnDebit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new FrameDebit();
			}
		});
		btnUnDebit.setBounds(41, 82, 117, 77);
		frame.getContentPane().add(btnUnDebit);
		
		JButton btnCredit = new JButton("");
		btnCredit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new FrameCredit();
			}
		});
		btnCredit.setIcon(new ImageIcon("src/image/07_minus-48.png"));
		btnCredit.setBounds(172, 82, 117, 77);
		frame.getContentPane().add(btnCredit);
		
		JButton btnVirement = new JButton("");
		btnVirement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new FrameVirement();
			}
		});
		btnVirement.setIcon(new ImageIcon("src/image/E-commerce_and_Shopping-94-64.png"));
		btnVirement.setBounds(304, 82, 117, 77);
		frame.getContentPane().add(btnVirement);
		
		JLabel lblVirement = new JLabel("Virement");
		lblVirement.setFont(new Font("L M Roman10", Font.BOLD | Font.ITALIC, 17));
		lblVirement.setBounds(326, 57, 97, 15);
		frame.getContentPane().add(lblVirement);
		
		JLabel lblCredit = new JLabel("Credit");
		lblCredit.setFont(new Font("L M Roman10", Font.BOLD | Font.ITALIC, 17));
		lblCredit.setBounds(207, 57, 216, 15);
		frame.getContentPane().add(lblCredit);
		
		JLabel lblDebit = new JLabel("Debit");
		lblDebit.setFont(new Font("L M Roman10", Font.BOLD | Font.ITALIC, 17));
		lblDebit.setBounds(72, 57, 351, 15);
		frame.getContentPane().add(lblDebit);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(450, 230);
		frame.setResizable(false);
	}
}
