package RimBoite.gestionMagasin;

public class Magasin {
	private int identifiant;
	private String adresse;
	private double capacite;
	private ListeProduits liste= new ListeProduits();
	
	public Magasin() {
		
	}
	public Magasin(int identifiant, String adresse, double capacite) {
		this.identifiant = identifiant;
		this.adresse = adresse;
		this.capacite = capacite;
	}
	
	public int getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public double getCapacite() {
		return capacite;
	}
	public void setCapacite(double capacite) {
		this.capacite = capacite;
	}
	public ListeProduits getListe() {
		return liste;
	}
	public void setListe(ListeProduits liste) {
		this.liste = liste;
	}
	
	public void afficherProduits(Magasin m) {
		if(m.getListe()==null) {
			System.out.println("La magasin est vide!!!");
		}else {
			ListeProduits temp = liste;
			System.out.println("voici liste de produits:");
			System.out.println("Id \t libelle \t marque\t prix");
			while(temp!=null) {
				System.out.println(temp.p);
				temp = temp.suivant;
			}
			
		}
	}
	public int ChercherProduit(Produit p, Magasin m) {
		ListeProduits temp = m.getListe();
		while(temp!=null) {
			if(temp.p == p) {
				return 1;
			}
			temp = temp.suivant;
		}
		return -1;
	}
	public String toString() {
		return this.identifiant + "\t" +this.adresse + "\t"+this.capacite;
	}
	
}
