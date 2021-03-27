package RimBoite.gestionMagasin;

import java.util.Scanner;

public class Gestion {
	static Magasin magasin=null;
	static ListStore listmagasin=null;
	static Produit produit=null;
	static int ID = 2020;
	public static Scanner sc =  new Scanner(System.in);
	public static void main(String[] args) {
		int choix = 0,i=0;
		do {
			System.out.println("Gestion de magasin:\n------------\n1.Creer une magasin\n2.Ajouter un produit\n3.Afficher les magasin\n4.Afficher les produits d'une magasin\n5.Chercher un produit\n6.Supprimer produit");
			
			System.out.println("Donner votre choix:");
			choix = sc.nextInt();
			switch(choix) {
			case 1 : 
				System.out.println("Donner l'adresse de magasin:");
				String adresse = sc.next();
				System.out.println("Donner sa capacite:");
				double capacite = sc.nextDouble();
				int ID = 100 + i;
				magasin = new Magasin(ID,adresse,capacite);
				listmagasin = new ListStore(listmagasin, magasin);
				break;
			case 2:
				
				listmagasin.afficherMagasins(listmagasin);
				System.out.println("Choisir ID de magasin:");
				int Idmag =sc.nextInt();
				magasin =  listmagasin.RechercherUnemagasin(listmagasin, Idmag);
				if(magasin==null) {
					System.out.println("La magasin n'existe pas ou liste de magasins vide!!!");
				}else {
					System.out.println("Donner le libelle de produit:");
					String libelle = sc.next();
					System.out.println("Donner sa marque:");
					String marque = sc.next();
					int IDproduit = 200 + i;
					System.out.println("Donner son prix:");
					double prix = sc.nextDouble();
					produit = new Produit(IDproduit,libelle,marque,prix);
					magasin.setListe(magasin.getListe().ajouter(magasin.getListe(), produit));
					
				}
				break;
			case 3:
				listmagasin.afficherMagasins(listmagasin);
				break;
			case 4:
				listmagasin.afficherMagasins(listmagasin);
				System.out.println("Choisir ID de magasin:");
				int Idm =sc.nextInt();
				magasin =  listmagasin.RechercherUnemagasin(listmagasin, Idm);
				if(magasin==null) {
					System.out.println("La magasin n'existe pas ou liste de magasins vide!!!");
				}else {
					magasin.afficherProduits(magasin);
				}
				break;
			case 5:
				System.out.println("donne son identifiant:");
				int id = sc.nextInt();
				Produit p = magasin.getListe().chercherProd(id);
				if(chercherProduit(p)!=-1) {
					System.out.println("Le produit se trouve dans la magsin dont ID= " + chercherProduit(p));
				}else {
					System.out.println("Le produit n'existe pas");
				}
			case 6:
				System.out.println("donne son identifiant:");
				int id2 = sc.nextInt();
				Produit p2 = magasin.getListe().chercherProd(id2);
				magasin.setListe(magasin.getListe().supprimerProduit(p2, magasin));
				break;
			}
			i++;
		}while(true);	
		
	}
	
	public static boolean comparer(Produit p1, Produit p2) {
		return p1.getIdentifiant() == p2.getIdentifiant();
	}
	
	public static int chercherProduit(Produit p) {
		ListStore temp =listmagasin;
		while(temp!=null) {
			Magasin m = temp.magasin;
			ListeProduits prod = m.getListe();
			while(prod !=null) {
				if(prod.p == p) {
					return m.getIdentifiant();
				}
				
				prod = prod.suivant;
			}
			temp = temp.suivant;
		}
		return -1;
	}
	
}
