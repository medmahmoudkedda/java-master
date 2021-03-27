package exercices;

class TechnARisque extends Technicien implements ARisque {
	 static int nbrTech_risque=0;
    public TechnARisque(String prenom, String nom, int age, String date, int unites) {
        super(prenom, nom, age, date, unites);
        nbrTech_risque++;
    }
 
    public double calculerSalaire() {
        return super.calculerSalaire() + PRIME;
    }
}
