package com.app.model;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class JDBC {
	private static Connection connexion = null;
	private static String url = "jdbc:mysql://127.0.0.1:3306/";
	private static String dbName = "GCB";
	private static String driver = "com.mysql.jdbc.Driver";
	private static String userName = "root";
	private static String password = "looool17";

	private JDBC() {
		try {
			Class.forName(driver);
			if (connexion == null) {
				connexion = DriverManager.getConnection(url + dbName, userName, password);
			}

		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Mount DB and Try", "Message d'avertissement",
					JOptionPane.ERROR_MESSAGE);
		}
		/*finally {
			if(connexion !=null)
				try {
					connexion.close();
				} catch (SQLException e) {
				}
		}*/
	}

	public static Connection getConnection() {
		new JDBC();
		return connexion;
	}

}

