package RimBoite.gestionMagasin;

public class Produit {
	private int identifiant;
	private String libelle;
	private String marque;
	private double prix;
	public Produit() {
		
	}
	public Produit(int identifiant, String libelle, String marque, double prix) {
		this.identifiant = identifiant;
		this.libelle = libelle;
		this.marque = marque;
		this.prix = prix;
	}
	
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public String toString() {
		return this.identifiant+"\t" + this.libelle +"\t" +this.marque+"\t" +this.prix;
	}

}
