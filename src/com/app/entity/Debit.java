package com.app.entity;

import java.sql.Date;


public class Debit {

	
	private Date dateDeCreation;
	private String montant;
	private String modeDePaiment;
	private String categorie;
	private String ref;
	private String description;

	
	
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



	public String getRef() {
		return ref;
	}



	public void setRef(String ref) {
		this.ref = ref;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Debit() {
		// TODO Auto-generated constructor stub
	}

}
