package devoir;

public class Etudiant extends Personne{
	public static int nbEtudiants=0;
	String diplomeEnCours;
	public Etudiant(String nom, String prenom, String rue, String ville, String diplomeEnCours) {
		super(nom, prenom, rue, ville);
		this.diplomeEnCours=diplomeEnCours;
		nbEtudiants++;
	}
	
	@Override
	public void ecrirePersonne() {
		System.out.println("Etudiant: " + this.toString());
	}
	
	public String toString() {
		return super.toString() +" " + this.diplomeEnCours;
	}

}
