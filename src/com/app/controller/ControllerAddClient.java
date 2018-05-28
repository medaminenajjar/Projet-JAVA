package com.app.controller;


import com.app.model.*;
import com.app.entity.*;
import com.app.view.*;

public class ControllerAddClient implements  ActionPerformed<Client> {
	private FrameAjouterClient ajoutClient;
	private ModelClient log1;

	public ControllerAddClient() {
		//ajoutClient = new FrameAjouterClient();

		//login.setVisible(true);
		//ajoutClient.setClientListner(this);
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
	public void removePerformed(String cl) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addPerformed(Client cl) {

		log1 = new ModelClient(JDBC.getConnection());
		log1.create(cl);
					
			System.out.println("koulou machi tammam ");
			//new FrameBanque();	
		
	}



	
	
	
	
}
