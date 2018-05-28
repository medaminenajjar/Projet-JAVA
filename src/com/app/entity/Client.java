package com.app.entity;


public class Client {

	public String getCivilite() {
		return civilite;
	}




	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}




	public String getPays() {
		return pays;
	}




	public void setPays(String pays) {
		this.pays = pays;
	}




	private String civilite;
	private String nom;
	private String prenom;
	private String dateDeNaissance;
	private String cin;
	private String rue;
	private String ville;
	private String pays;
	private String numTel;
	private String email;
	private String pseudo;
	private String pass;
	private double sold;

	
	
	
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








	public Client(String civilite, String nom, String prenom, String dateDeNaissance, String cin, String rue,
			String ville, String pays, String numTel, String email, String pseudo, String pass) {
		super();
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.cin = cin;
		this.rue = rue;
		this.ville = ville;
		this.pays = pays;
		this.numTel = numTel;
		this.email = email;
		this.pseudo = pseudo;
		this.pass = pass;
	}




	public Client() {
		// TODO Auto-generated constructor stub
		
		
	}




	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	public String getPrenom() {
		return prenom;
	}




	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	public String getDateDeNaissance() {
		return dateDeNaissance;
	}




	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}




	public String getRue() {
		return rue;
	}




	public void setRue(String rue) {
		this.rue = rue;
	}





	public String getVille() {
		return ville;
	}




	public void setVille(String ville) {
		this.ville = ville;
	}




	public String getNumTel() {
		return numTel;
	}




	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getCin() {
		return cin;
	}




	public void setCin(String cin) {
		this.cin = cin;
	}




	public double getSold() {
		return sold;
	}




	public void setSold(double sold) {
		this.sold = sold;
	}
	
	

}
