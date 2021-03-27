package exercices;

class Vendeur extends Commercial {
    private final static double POURCENT_VENDEUR = 0.2;
    private final static int BONUS_VENDEUR = 400;
    static int nbr_vendeur=0;
    
    public Vendeur(String prenom, String nom, int age, String date,
            double chiffreAffaire) {
        super(prenom, nom, age, date, chiffreAffaire);
        nbr_vendeur++;
    }
 
    public double calculerSalaire() {
        return (POURCENT_VENDEUR * getChiffreAffaire()) + BONUS_VENDEUR;
    }
 
    public String getTitre()
        {
            return "Le vendeur ";
        }
 
}
