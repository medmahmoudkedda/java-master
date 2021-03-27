package RimBoite.gestionMagasin;

public class ListeProduits {
	private int nbrproduit;
	static final int maxProduit = 50;
	Produit p=null;
	ListeProduits suivant;
	public ListeProduits(){}
	public ListeProduits(ListeProduits l, Produit p){
		this.p = p;
		this.suivant = l;
	}

	ListeProduits ajouter(ListeProduits l, Produit p) {
		if(Gestion.chercherProduit(p)==-1) {
			if(nbrproduit >maxProduit) {
				System.out.println("La magasin est pleinne");
				return null;
			}
			nbrproduit++;
			return new ListeProduits(l,p);
		}
		
		return null;
	}
	
	ListeProduits supprimerProduit(Produit p, Magasin m) {
		ListeProduits temp = m.getListe();
		ListeProduits temp2=null;
		while(temp!=null) {
			if(temp.p == p) {
				this.nbrproduit--;
				continue;
			}
			temp2 = ajouter(temp2,temp.p);
			temp = temp.suivant;
		}
		m.setListe(temp2);
		return m.getListe();
	}
	
	void afficherProduits(ListeProduits l) {
		ListeProduits temp = l;
		System.out.println("Id \t Libelle \t Marque \t Prix");
		while(temp!=null) {
			System.out.println(temp.p.toString());
		}
	}
	
	Produit chercherProd(int id) {
		ListeProduits temp = this;
		while(temp!=null) {
			if(temp.p.getIdentifiant()==id) {
				return temp.p;
			}
			temp = temp.suivant;
		}
		return null;
	}

}