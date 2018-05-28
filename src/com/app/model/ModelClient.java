package com.app.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
//import javax.swing.JTable;
//import javax.swing.table.DefaultTableModel;

//import com.app.model.*;
import com.app.view.Test;
import com.mysql.jdbc.ResultSetMetaData;
import com.app.entity.*;

public class ModelClient extends AbstractModel<Client> {

	private String query;
	private PreparedStatement prepstat;
	private Statement statement;
	private ResultSet rset;
	String[] tab = new  String[20];

	public String[] getTab() {
		return tab;
	}


	public void setTab(String[] tab) {
		this.tab = tab;
	}


	public ModelClient(Connection connection) {
		super(connection);
	}


	@Override
	public void create(Client c1) {
		try {
			
			System.out.println("biennnnnnnn le creation d'un client ");
			
			if ("".equals(c1.getPseudo()) || "".equals(c1.getPass())||"".equals(c1.getNom())|| "".equals(c1.getEmail())|| "".equals(c1.getCin())
					|| "".equals(c1.getNumTel())|| "".equals(c1.getPays()) ||"".equals(c1.getNumTel())) {
				JOptionPane.showMessageDialog(null, "ERROR ADD INTO DB des champs Non rempli", "Message d'avertissement",
						JOptionPane.ERROR_MESSAGE);
			} else {

			
			query = "INSERT INTO Login  VALUES(?,?,?,?)";

			
			prepstat = connection.prepareStatement(query);
			
			prepstat.setString(1, c1.getPseudo());
			prepstat.setString(2, c1.getPass());
			prepstat.setString(3, c1.getCin());			
			prepstat.setString(4, "2");

			prepstat.executeUpdate();
			
			
			query = "INSERT INTO Client  VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

			
			prepstat = connection.prepareStatement(query);
			
			prepstat.setString(1, c1.getCivilite());
			prepstat.setString(2, c1.getNom());
			prepstat.setString(3, c1.getPrenom());
			prepstat.setString(4, c1.getDateDeNaissance());
			prepstat.setString(5, c1.getCin());
			prepstat.setString(6, c1.getRue());
			prepstat.setString(7, c1.getVille());
			prepstat.setString(8, c1.getPays());
			prepstat.setString(9, c1.getNumTel());
			prepstat.setString(10, c1.getEmail());
			prepstat.setString(11, c1.getPseudo());
			prepstat.setString(12, c1.getPass());
			prepstat.executeUpdate();
			JOptionPane.showMessageDialog(null, "Successfull Add", "Message d'avertissement",
					JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(null, "ERROR ADD INTO DB", "Message d'avertissement",
					JOptionPane.ERROR_MESSAGE);

		}

	}

	@Override
	public void remove(String c1) {
		try {

			query = "DELETE FROM Client WHERE cin=?";
			prepstat = connection.prepareStatement(query);
			prepstat.setString(1, c1);
			prepstat.executeUpdate();
			
			query = "DELETE FROM Login WHERE cin=?";
			prepstat = connection.prepareStatement(query);
			prepstat.setString(1, c1);
			prepstat.executeUpdate();
			/*JOptionPane.showMessageDialog(null, "Successfull DELETE", "Message d'avertissement",
					JOptionPane.INFORMATION_MESSAGE);*/

		} catch (SQLException ex) {
			ex.printStackTrace();
			//JOptionPane.showMessageDialog(null, "ERROR", "Message d'avertissement", JOptionPane.ERROR_MESSAGE);
		}
		/*finally {
			JOptionPane.showMessageDialog(null, "ERROR", "Message d'avertissement", JOptionPane.ERROR_MESSAGE);
			}*/
	}

	

	@Override
	public void modify(String c1, String[] tabContenu) {
		try {
			query = "UPDATE `Client` SET `civilite`=?,`nom`=?,`prenom`=?,`dateDeNaissance`=?,`rue`=?,`ville`=?,`pays`=?,`numTel`=?,`email`=?,`cin`=?,`pseudo`=?,`pass`=? WHERE `cin`=?";
			//query = "UPDATE `Client` SET `civilite`=?,`nom`=?,`prenom`=?,`dateDeNaissance`=?,`cin`=?,`rue`=?,`ville`=?,`pays`=?,`numTel`=?,`email`=?,`pass`=? WHERE `cin`=?";
			//query = "UPDATE `Client` SET `nom`=?,`prenom`=? WHERE `cin`=?";
			prepstat = connection.prepareStatement(query);
			
			prepstat.setString(1, tabContenu[1]);
			prepstat.setString(2, tabContenu[2]);
			prepstat.setString(3, tabContenu[3]);
			prepstat.setString(4, tabContenu[4]);
			prepstat.setString(5, tabContenu[5]);
			prepstat.setString(6, tabContenu[6]);
			prepstat.setString(7, tabContenu[7]);
			prepstat.setString(8, tabContenu[8]);
			prepstat.setString(9, tabContenu[9]);
			prepstat.setString(10, tabContenu[10]);
			prepstat.setString(11, tabContenu[11]);
			prepstat.setString(12, tabContenu[12]);
			prepstat.setString(13, tabContenu[10]);
			
			prepstat.executeUpdate();
			
			
			
			query = "UPDATE `Login` SET `pseudo`=?,`pass`=? WHERE `cin`=?";
			prepstat = connection.prepareStatement(query);
			
			prepstat.setString(1, tabContenu[11]);
			prepstat.setString(2, tabContenu[12]);
			prepstat.setString(3, tabContenu[10]);
			
			prepstat.executeUpdate();
			
			
			
		} catch (SQLException ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(null, "ERROR", "Message d'avertissement", JOptionPane.ERROR_MESSAGE);

		}
	}


	@Override
	public boolean find() {
		return false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean find(String a) {
		try {
			new DefaultListModel<>();
			
			//tab= new JTable();
			
			//Statement st = null;

			Vector<String> tc = new Vector<String>();
			statement = connection.createStatement();
			query = "select nom , prenom ,dateDeNaissance,cin,rue,ville,pays, numTel,email,pseudo,pass  from Client  " ;
			//prepstat = connection.prepareStatement(query);
			//prepstat.setString(1, a);
			//int b = prepstat.executeUpdate();
			//System.out.println("biennnnnnnn le recherche d'un clientet effectuee " + b);

			ResultSet rs = statement.executeQuery(query);

			
			
			ResultSetMetaData md = (ResultSetMetaData) rs.getMetaData();
			int nc = md.getColumnCount();
			int nl=0;
			while (rs.next()) {
				nl++;
				}
			rs.first();
			Object[][] td = new Object[nl][nc];
			tc.clear();
			
			for (int j = 1; j <= nc; j++) {
				tc.add(md.getColumnName(j));
			}
			
			System.out.println(tc );
			for (int i = 0; i < nl; i++, rs.next()) {
				for (int j = 0; j < nc; j++) {
					td[i][j]=rs.getString(j+1);
					System.out.println((String) td[i][j] );
					
				}
			}
			
			
			
			//statement.close();
			//connection.close();

			//DefaultTableModel tm = new DefaultTableModel(td, tc.toArray());
			//tab.setModel(tm);
			/*for (int i = 0; i < tc.size(); i++) {
				System.out.println(tc.get(i));
			}*/
			Test t = new Test();
			t.setModell(td , tc);
			JOptionPane.showMessageDialog(null, "Successfull Alter", "Message d'avertissement",
					JOptionPane.INFORMATION_MESSAGE);
			
			
			return true ;
		} catch (SQLException ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(null, "ERROR", "Message d'avertissement", JOptionPane.ERROR_MESSAGE);

		}
		return false;
	}


	@Override
	public boolean find(Client c1) {
		// TODO Auto-generated method stub
		String cin ;
		query = "SELECT *  FROM Client";
		try {
			statement = connection.createStatement();
		
		rset = statement.executeQuery(query);
		rset.first();
		while (rset.next()) {
			cin = rset.getString("cin");				
			//pass = rset.getString("pass");
			/*if (c1.getPseudo().equals("")&& c1.getPass().equals("")) {
				
				System.out.println("noooo for login");
				return false;
				
			}*/
			if (c1.getCin().equals(cin)) {
				System.out.println("ooookkkkkkkk");
				return true;
			}	
			}	


	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return false;
}


	public boolean modify(String cl,int a , String [] tab) {
		// TODO Auto-generated method stub
		String cin ;
		Client c1 = new Client();
		c1.setCin(cl);
		query = "SELECT *  FROM Client";
		try {
			statement = connection.createStatement();
		
		rset = statement.executeQuery(query);
		rset.first();
		while (rset.next()) {
			cin = rset.getString("cin");				
			
			if (c1.getCin().equals(cin)) {
				System.out.println("ooookkkkkkkk");
				tab[1] = rset.getString("civilite");				
				tab[2] = rset.getString("nom");
				tab[3] = rset.getString("prenom");				
				tab[4] = rset.getString("dateDeNaissance");				
				tab[5] = rset.getString("rue");				
				tab[6] = rset.getString("ville");				
				tab[7] = rset.getString("pays");				
				tab[8] = rset.getString("numTel");				
				tab[9] = rset.getString("email");				
				tab[10] = rset.getString("cin");				
				tab[11] = rset.getString("pseudo");				
				tab[12] = rset.getString("pass");				

				//tab[3] = rset.getString("nom");				
				//tab[4] = rset.getString("nom");
				System.out.println(tab[1]);
				System.out.println(tab[2]);
				return true;
			}	
			}	


	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return false;

	}
	
}