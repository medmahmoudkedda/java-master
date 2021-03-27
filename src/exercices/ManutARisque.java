package exercices;

class ManutARisque extends Manutentionnaire implements ARisque {
	 static int manu_Risque=0;
    public ManutARisque(String prenom, String nom, int age, String date, int heures) {
        super(prenom, nom, age, date, heures);
        manu_Risque++;
    }
 
    public double calculerSalaire(){
        return super.calculerSalaire() + PRIME;
    }
}
