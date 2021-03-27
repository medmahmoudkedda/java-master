package RimBoite.gestionMagasin;

public class ListStore {
	Magasin magasin=null;
	ListStore suivant;
	ListStore(){}
	ListStore(ListStore l, Magasin m){
		this.magasin = m;
		suivant = l;
	}
	
	ListStore ajouter(ListStore l, Magasin m) {
		return new ListStore(l,m);
	}
	public Magasin RechercherUnemagasin(ListStore l, int Idmag) {
		if(l==null) {
			System.out.println("Liste de magasins est vide");
			return null;
		}
		ListStore temp=l;
		while(temp!=null) {
			if(temp.magasin.getIdentifiant() == Idmag) {
				return temp.magasin;
			}
			temp = temp.suivant;
		}
		
		return null;
		
	}
	public void afficherMagasins(ListStore l){
		if(l==null) {
			System.out.println("Aucune magasin n'est trouvee!!");
			return;
		}
		ListStore temp = l;
		System.out.println("Voici liste des magasins:");
		System.out.println("ID \t Adresse\t Capacite");
		while(temp!=null) {
			System.out.println(temp.magasin.toString());
			temp = temp.suivant;
		}
	}
}
