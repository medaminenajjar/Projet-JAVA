package com.app.entity;

public class Connexion {

	private String pseudo;
	private String pass;

	
	public Connexion(String pseudo, String pass) {
		// TODO Auto-generated constructor stub
		this.pass=pass;
		this.pseudo=pseudo;
	}


	public String getPseudo() {
		return pseudo;
	}


	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}

}
