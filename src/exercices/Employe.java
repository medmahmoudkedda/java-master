package exercices;

abstract class Employe {
    private String nom;
    private String prenom;
    private int age;
    private String date;
    static int nbr_employe=0;
 
    public Employe(String prenom, String nom, int age, String date) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.date = date;
        nbr_employe++;
    }
 
    public abstract double calculerSalaire();
 
    public String getTitre()
        {
            return "L'employé " ;
        }
 
    public String getNom() {
        return getTitre() + prenom + " " + nom;
    }
    
}
