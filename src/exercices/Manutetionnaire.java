package exercices;

class Manutentionnaire extends Employe {
    private final static double SALAIRE_HORAIRE = 65.0;
    private int heures;
    static int nbrManut=0;
    public Manutentionnaire(String prenom, String nom, int age, String date,
                     int heures) {
        super(prenom, nom, age, date);
        this.heures = heures;
        nbrManut++;
    }
 
    public double calculerSalaire() {
        return SALAIRE_HORAIRE * heures;
    }
 
    public String getTitre()
        {
            return "Le manut. " ;
        }
}
