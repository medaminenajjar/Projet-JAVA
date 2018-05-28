package com.app.view;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;

import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JButton;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.BorderLayout;
import javax.swing.event.MenuKeyListener;

import com.app.controller.*;

import javax.swing.event.MenuKeyEvent;

public class FrameBanque {

	private JFrame frame;
	JPanel panel;
	JLabel label ;
	JSplitPane splitPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameBanque window = new FrameBanque();
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
	public FrameBanque() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Espace Banque");
		frame.setBounds(100, 100, 450, 300);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1020, 700);
		frame.setResizable(false);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(UIManager.getColor("Button.background"));
		menuBar.setForeground(SystemColor.menu);
		frame.setJMenuBar(menuBar);
		
		JMenu mnGestionDesClents = new JMenu("Client");
		mnGestionDesClents.setIcon(new ImageIcon("src/image/finance_-65-48.png"));
		mnGestionDesClents.setFont(new Font("LM Sans 12", Font.BOLD, 16));
		menuBar.add(mnGestionDesClents);

		
		/*mntmAfficher.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().add(splitPane);

				frame.repaint();
				frame.revalidate();
			}
		});
		*/


		
		JMenuItem mntmA= new JMenuItem("Ajouter");
		mntmA.setIcon(new ImageIcon("src/image/new-20.png"));
		mntmA.addMenuKeyListener(new MenuKeyListener() {
			public void menuKeyPressed(MenuKeyEvent e) {
				new FrameAjouterClient();
				//new ControllerAddClient();
			}
			public void menuKeyReleased(MenuKeyEvent e) {
			}
			public void menuKeyTyped(MenuKeyEvent e) {
			}
		});
		mntmA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//new ControllerAddClient();
				new FrameAjouterClient();
			}
		});
		mntmA.setFont(new Font("L M Sans Quot8", Font.BOLD, 14));
		mntmA.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
		mnGestionDesClents.add(mntmA);
		
		JMenuItem mntmM = new JMenuItem("Modifier");
		mntmM.setIcon(new ImageIcon("src/image/settings-20.png"));
		mntmM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//new ControllerModifierClient0();
				new FrameModifierClient0();
			}
		});
		mntmM.setFont(new Font("L M Sans Quot8", Font.BOLD, 14));
		mntmM.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0));
		mnGestionDesClents.add(mntmM);
		
		JMenuItem mntmR = new JMenuItem("Rechercher");
		mntmR.setIcon(new ImageIcon("src/image/search1-20.png"));
		mntmR.addMenuKeyListener(new MenuKeyListener() {
			public void menuKeyPressed(MenuKeyEvent e) {
				//new ControllerRechClient();
				new FrameRechClient();
			}
			public void menuKeyReleased(MenuKeyEvent e) {
			}
			public void menuKeyTyped(MenuKeyEvent e) {
			}
		});
		mntmR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//new ControllerRechClient();
				new FrameRechClient();
			}
		});
		mntmR.setFont(new Font("L M Sans Quot8", Font.BOLD, 14));
		mntmR.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0));
		mnGestionDesClents.add(mntmR);
		
		JMenuItem mntmS = new JMenuItem("Supprimer");
		mntmS.setIcon(new ImageIcon("src/image/close-20.png"));
		mntmS.addMenuKeyListener(new MenuKeyListener() {
			public void menuKeyPressed(MenuKeyEvent e) {
				new FrameSuppClient();
				//new ControllerSuppClient();
			}
			public void menuKeyReleased(MenuKeyEvent e) {
			}
			public void menuKeyTyped(MenuKeyEvent e) {
			}
		});
		mntmS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new FrameSuppClient();
				//new ControllerSuppClient();
			}
		});
		mntmS.setFont(new Font("L M Sans Quot8", Font.BOLD, 14));
		mntmS.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0));
		mnGestionDesClents.add(mntmS);
		
		JMenu mnGestionDesComptes = new JMenu("Compte");
		mnGestionDesComptes.setIcon(new ImageIcon("src/image/businessman_client_business-48.png"));
		mnGestionDesComptes.setFont(new Font("LM Sans 12", Font.BOLD, 16));
		menuBar.add(mnGestionDesComptes);
		
		
		JMenuItem mntmAjouter_1 = new JMenuItem("Ajouter");
		mntmAjouter_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new FrameAjouterCompte();
			}
		});
		mntmAjouter_1.setIcon(new ImageIcon("src/image/new-20.png"));
		mntmAjouter_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.ALT_MASK));
		mntmAjouter_1.setFont(new Font("L M Sans Quot8", Font.BOLD, 14));
		mnGestionDesComptes.add(mntmAjouter_1);
		
		JMenuItem mntmModifier_1 = new JMenuItem("Modifier");
		mntmModifier_1.setIcon(new ImageIcon("src/image/settings-20.png"));
		mntmModifier_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, InputEvent.ALT_MASK));
		mntmModifier_1.setFont(new Font("L M Sans Quot8", Font.BOLD, 14));
		mnGestionDesComptes.add(mntmModifier_1);
		
		JMenuItem mntmSupprimer_1 = new JMenuItem("Rechercher");
		mntmSupprimer_1.setIcon(new ImageIcon("src/image/search1-20.png"));
		mntmSupprimer_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, InputEvent.ALT_MASK));
		mntmSupprimer_1.setFont(new Font("L M Sans Quot8", Font.BOLD, 14));
		mnGestionDesComptes.add(mntmSupprimer_1);
		
		JMenuItem mntmSupprimer_3 = new JMenuItem("Supprimer");
		mntmSupprimer_3.setIcon(new ImageIcon("src/image/close-20.png"));
		mntmSupprimer_3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
		mntmSupprimer_3.setFont(new Font("L M Sans Quot8", Font.BOLD, 14));
		mnGestionDesComptes.add(mntmSupprimer_3);
		
		JMenu mnGestionDesCredits = new JMenu("Operation");
		mnGestionDesCredits.setIcon(new ImageIcon("src/image/development.gears-48.png"));
		mnGestionDesCredits.setFont(new Font("LM Sans 12", Font.BOLD, 16));
		menuBar.add(mnGestionDesCredits);
		
		
		JMenuItem mntmAjouter_2 = new JMenuItem("Ajouter");
		mntmAjouter_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new FrameAjouterOperation();
			}
		});
		mntmAjouter_2.setIcon(new ImageIcon("src/image/new-20.png"));
		mntmAjouter_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, InputEvent.CTRL_MASK));
		mntmAjouter_2.setFont(new Font("L M Sans Quot8", Font.BOLD, 14));
		mnGestionDesCredits.add(mntmAjouter_2);
		
		JMenuItem mntmModifier_2 = new JMenuItem("Modifier");
		mntmModifier_2.setIcon(new ImageIcon("src/image/settings-20.png"));
		mntmModifier_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, InputEvent.CTRL_MASK));
		mntmModifier_2.setFont(new Font("L M Sans Quot8", Font.BOLD, 14));
		mnGestionDesCredits.add(mntmModifier_2);
		
		JMenuItem mntmSupprimer_4 = new JMenuItem("Supprimer");
		mntmSupprimer_4.setIcon(new ImageIcon("src/image/close-20.png"));
		mntmSupprimer_4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, InputEvent.CTRL_MASK));
		mntmSupprimer_4.setFont(new Font("L M Sans Quot8", Font.BOLD, 14));
		mnGestionDesCredits.add(mntmSupprimer_4);
		
		JMenu mnInfo = new JMenu("A Propos...");
		mnInfo.setIcon(new ImageIcon("src/image/info_blue.png"));
		mnInfo.setFont(new Font("LM Sans 12", Font.BOLD, 16));
		menuBar.add(mnInfo);
		
		JMenuItem mntmSold = new JMenuItem("Sold Banque");
		mntmSold.setIcon(new ImageIcon("src/image/Currency_dollar-24.png"));
		mntmSold.setFont(new Font("L M Sans Quot8", Font.BOLD, 14));
		mnInfo.add(mntmSold);
		
		JMenuItem mntmConvertiseur = new JMenuItem("Convertiseur");
		mntmConvertiseur.setIcon(new ImageIcon("src/image/shopping-10-20.png"));
		mntmConvertiseur.setFont(new Font("L M Sans Quot8", Font.BOLD, 14));
		mnInfo.add(mntmConvertiseur);
		frame.getContentPane().setLayout(null);
		
		splitPane = new JSplitPane();
		splitPane.setBounds(0, 100, 1020, 535);
		//frame.getContentPane().add(splitPane);
		
		JList list = new JList();
		splitPane.setLeftComponent(list);
		
		JButton btnHh = new JButton("hh");
		btnHh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		splitPane.setRightComponent(btnHh);
		
		label = new JLabel("");
		label.setBounds(0, 0, 1098, 634);
		label.setIcon(new ImageIcon("src/image/bank_albom_260915.jpg"));
		
		//frame.getContentPane().add(label, BorderLayout.CENTER);
	
		
		/*
		frame.getContentPane().setIconImage(new ImageIcon("/root/Bureau/imagee/e.jpeg").getImage());
		*/
		//JLabel monPanal = new JLabel();
		//ImageIcon icon = new ImageIcon("/root/Bureau/imagee/e.jpeg");
		//JLabel img = new JLabel(icon);
		//monPanal.setIcon(icon);
		//frame.getContentPane().setLayout(null);
		
	
		frame.getContentPane().add(label);
		//frame.getContentPane().add(pan);

		/*
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 598, 434);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("/root/Bureau/imagee/image_banque__3.jpg"));
		*/
		frame.setVisible(true);
		
	}
}
