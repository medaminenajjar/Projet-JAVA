package com.app.controller;


import com.app.model.*;
import com.app.entity.*;
import com.app.view.*;

public class ControllerModifierClient implements  ActionPerformed<Client> {
	private FrameModifierClient modifierClient;
	private ModelClient log1;

	public ControllerModifierClient() {
		modifierClient = new FrameModifierClient();
		//login.setVisible(true);
		modifierClient.setClientListner(this);
	}

	@Override
	public void SearchPerformed(String cl) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void modifyPerformed(String cl, String[] tabContenu) {
		// TODO Auto-generated method stub

		modifierClient.getTextField().setText(tabContenu[2]);
		modifierClient.getTextField_1().setText(tabContenu[3]);
		//modifierClient.get.setText(tabContenu[3]);
		modifierClient.getTextField_3().setText(tabContenu[5]);
		modifierClient.getTextField_5().setText(tabContenu[6]);
		modifierClient.getTextField_6().setText(tabContenu[7]);
		modifierClient.getTextField_7().setText(tabContenu[8]);
		modifierClient.getTextField_8().setText(tabContenu[9]);
		modifierClient.getTextField_9().setText(tabContenu[10]);
		modifierClient.getTextField_2().setText(tabContenu[11]);
		modifierClient.getPasswordField().setText(tabContenu[12]);
		log1 = new ModelClient(JDBC.getConnection());
		log1.modify(cl,tabContenu);	
		System.out.println("hhhhhhhhh "+tabContenu[1]);

			System.out.println("koulou machi tammam modiff ");
	}

	@Override
	public void removePerformed(String cl) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addPerformed(Client cl) {
		
	}



	
	
	
	
}
