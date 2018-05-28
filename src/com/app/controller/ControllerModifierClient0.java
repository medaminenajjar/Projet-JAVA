package com.app.controller;


import com.app.model.*;

import javax.swing.JOptionPane;

import com.app.entity.*;
import com.app.view.*;

public class ControllerModifierClient0 implements  ActionPerformed<Client> {
	private FrameModifierClient modifierClient;
	private ModelClient log1;
	private String [] tab ;

	public ControllerModifierClient0() {
		//modifierClient = new FrameModifierClient();

		//login.setVisible(true);
		//modifierClient.setClientListner(this);
	}

	@Override
	public void SearchPerformed(String cl) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void modifyPerformed(String cl, String[] tabContenu) {
		// TODO Auto-generated method stub
		tab = new String[20];
		log1 = new ModelClient(JDBC.getConnection());
		//log1.modify(cl, 1 , tab);
		//System.out.println("hhhhhhhhhiiii "+log1.getTab()[1]);
		if (log1.modify(cl, 1 , tab)) {
			ControllerModifierClient controllerModifierClient= new ControllerModifierClient();
			controllerModifierClient.modifyPerformed(cl, tab);
			
			
			System.out.println("koulou machi tammam modiff ");
		} else {
			JOptionPane.showMessageDialog(null, "mahouch fel base", "Message d'avertissement", JOptionPane.ERROR_MESSAGE);


		}
		
	}

	@Override
	public void removePerformed(String cl) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addPerformed(Client cl) {
		
	}



	
	
	
	
}
