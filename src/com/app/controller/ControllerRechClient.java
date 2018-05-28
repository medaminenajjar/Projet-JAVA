package com.app.controller;


import com.app.model.*;
import com.app.entity.*;
import com.app.view.*;

public class ControllerRechClient implements  ActionPerformed<Client> {
	private FrameRechClient rechClient;
	private ModelClient log1;

	public ControllerRechClient() {
		//rechClient = new FrameRechClient();

		//login.setVisible(true);
		//rechClient.setClientListner(this);
	}


	@Override
	public void SearchPerformed(String cl) {
		// TODO Auto-generated method stub

		log1 = new ModelClient(JDBC.getConnection());
		boolean a = log1.find(cl);
		System.out.println("koulou machi tammam " + a);
		
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

			//new FrameBanque();

		
		
		
	}



	
	
	
	
}
