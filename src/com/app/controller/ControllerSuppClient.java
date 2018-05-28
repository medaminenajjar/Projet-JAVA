package com.app.controller;


import com.app.model.*;

import javax.swing.JOptionPane;

import com.app.entity.*;
import com.app.view.*;

public class ControllerSuppClient implements  ActionPerformed<Client> {
	private FrameSuppClient suppClient;
	private ModelClient log1;

	public ControllerSuppClient() {
		//suppClient = new FrameSuppClient();

		//login.setVisible(true);
		//suppClient.setClientListner(this);
	}


	@Override
	public void SearchPerformed(String cl) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void modifyPerformed(String cl, String[] tabContenu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPerformed(Client cl) {

		
			//new FrameBanque();

		
		
		
	}

	@Override
	public void removePerformed(String cl) {
		log1 = new ModelClient(JDBC.getConnection());
		Client c1 = new Client();
		c1.setCin(cl);
		if (log1.find(c1)== true) {
			log1.remove(cl);
			JOptionPane.showMessageDialog(null, "Successfull Alter", "Message d'avertissement",
					JOptionPane.INFORMATION_MESSAGE);
			
			System.out.println("koulou machi tammam ");
		} else {
			JOptionPane.showMessageDialog(null, "mathamech client", "Message d'avertissement", JOptionPane.ERROR_MESSAGE);

		}
		
		
	}



	
	
	
	
}
