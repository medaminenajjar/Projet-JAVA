package com.app.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.app.entity.*;

public class ModelLoginConn extends AbstractModel<Connexion> {

	private String query;
	private Statement statement;
	private ResultSet rset = null;

	public ModelLoginConn(Connection connection) {
		super(connection);
	}

	@Override
	public boolean find(Connexion c1) {
		try {
			String pseudo,pass ;
			query = "SELECT *  FROM Login";
			statement = connection.createStatement();
			rset = statement.executeQuery(query);
			while (rset.next()) {
				pseudo = rset.getString("pseudo");				
				pass = rset.getString("pass");
				/*if (c1.getPseudo().equals("")&& c1.getPass().equals("")) {
					
					System.out.println("noooo for login");
					return false;
					
				}*/
				if (c1.getPseudo().equals(pseudo)&& c1.getPass().equals(pass)) {
					System.out.println("ooookkkkkkkk for login");
					return true;
				}
				
				//return false;

			}

			//System.out.println("nnnnoooo for login");
		} catch (SQLException e) {
			e.printStackTrace(); 
			}
		return false;

	}

	

	@Override
	public void create(Connexion c1) {
		
		
	}

	@Override
	public void remove(String c1) {
		
	
	}
	@Override
	public void modify(String c1, String[] tabContenu) {
		
	}


	@Override
	public boolean find() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean find(String a) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
