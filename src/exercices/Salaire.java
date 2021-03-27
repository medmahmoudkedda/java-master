package exercices;

class Salaires{
	 public static void main(String[] args) {
	 Personnel p = new Personnel();
	 try {
	 p.ajouterEmploye(new Vendeur("Ali", "jjjjj", 45, "1995", 3000));
	 p.ajouterEmploye(new Representant("Titi", "lol", 25, "2001", 1000));
	 p.ajouterEmploye(new Technicien("Tata", "lolo", 28, "1998", 900));
	 p.ajouterEmploye(new Manutentionnaire("Mouss", "", 32, "1998", 45));
	 p.ajouterEmploye(new TechnARisque("Jiji", "nou", 28, "2000", 1000));
	 p.ajouterEmploye(new ManutARisque("Jaja", "", 30, "2001", 45));
	 p.afficherSalaires();
	 }catch(Nom_Exception  e) {
		 System.out.println(e.getMessage());
	 }catch(Chiffre_Exception e) {
		 System.out.println(e.getMessage());
	 }catch(Exception_salaire e) {
		 System.out.println(e.getMessage());
	 }
	 System.out.println("Le salaire moyen dans l'entreprise est de " +
	 p.salaireMoyen() + " Ouguiya.");
	 
	 System.out.println("\n\n\nLe nombre total des employes: "+ Employe.nbr_employe);
	 System.out.println("Le nombre total des vendeurs: "+ Vendeur.nbr_vendeur);
	 System.out.println("Le nombre total des Techniciens: "+ Technicien.nbr_technicien);
	 System.out.println("Le nombre total des Techniciens avec risque: "+ TechnARisque.nbrTech_risque);
	 System.out.println("Le nombre total des Techniciens sans risque: "+ (Technicien.nbr_technicien-TechnARisque.nbrTech_risque));
	 System.out.println("Le nombre total des Manutentionnaires: "+ Manutentionnaire.nbrManut);
	 System.out.println("Le nombre total des Manutetionnaires avec risque: "+ ManutARisque.manu_Risque);
	 System.out.println("Le nombre total des Manutetionnaires sans risque: "+ (Manutentionnaire.nbrManut-ManutARisque.manu_Risque));
	 int nbr_risque = TechnARisque.nbrTech_risque + ManutARisque.manu_Risque;
	 int pourcent_risque=(nbr_risque*100)/Employe.nbr_employe;
	 System.out.println("Pourcentage des employes a risque :" + pourcent_risque);
	 
	 Personnel.afficherRisque();
	 }
}
