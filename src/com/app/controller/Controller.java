package com.app.controller;

import com.app.model.*;

import javax.swing.JOptionPane;

import com.app.entity.*;
import com.app.view.*;

public class Controller implements LoginListners<Connexion>, ActionPerformed<Connexion> {
	private Login login;
	private ModelLoginConn log;

	public Controller() {
		login = new Login();
		//login.setVisible(true);
		login.setLoginListner(this);
	}

	@Override
	public void SearchPerformed(String cl) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPerformed(Connexion cl) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyPerformed(String cl, String[] tabContenu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePerformed(String cl) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginPerformed(Connexion cl) {
		
		//cl = new ModelLoginConn(JDBC.getConnection());
		//login.setVisible(true);
		
		
		log = new ModelLoginConn(JDBC.getConnection());
		if (log.find(cl) == true) {			
			System.out.println("hhhhhhhhhh "+ cl.getPseudo());
			new FrameBanque();
			JOptionPane.showMessageDialog(null, "Bienvenu "+ cl.getPseudo(), "Hi",
					JOptionPane.INFORMATION_MESSAGE);
			login.getFrame().setVisible(false);
		}
		else {
		System.out.println("shitttt");
		JOptionPane.showMessageDialog(null, "Erreur de connexion", "Message d'avertissement", JOptionPane.ERROR_MESSAGE);

		}
		}

	
	
	
	
}
