package com.app.entity;

import java.sql.Date;


public class Virement {

	
	private Date dateDeCreation;
	private String montant;
	private String modeDePaiment;
	private String categorie;
	private String description;
	private String compte1 , compte2 ;
	
	
	public String getCompte1() {
		return compte1;
	}



	public void setCompte1(String compte1) {
		this.compte1 = compte1;
	}



	public String getCompte2() {
		return compte2;
	}



	public void setCompte2(String compte2) {
		this.compte2 = compte2;
	}



	public Date getDateDeCreation() {
		return dateDeCreation;
	}



	public void setDateDeCreation(Date dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}



	public String getMontant() {
		return montant;
	}



	public void setMontant(String montant) {
		this.montant = montant;
	}



	public String getModeDePaiment() {
		return modeDePaiment;
	}



	public void setModeDePaiment(String modeDePaiment) {
		this.modeDePaiment = modeDePaiment;
	}



	public String getCategorie() {
		return categorie;
	}



	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}




	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Virement() {
		// TODO Auto-generated constructor stub
	}

}
