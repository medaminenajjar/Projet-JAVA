package com.app.entity;



public class Credit {

	private String compte;
	private String dateDeCreation;
	private String montant;
	private String modeDePaiment;
	private String categorie;
	private String ref;
	private String description;

	
	
	public String getDateDeCreation() {
		return dateDeCreation;
	}



	public void setDateDeCreation(String dateDeCreation) {
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



	public Credit() {
		// TODO Auto-generated constructor stub
	}



	public String getCompte() {
		return compte;
	}



	public void setCompte(String compte) {
		this.compte = compte;
	}

}
