package devoir;

public class Enseignant extends Personne{
	public static int nbEnseignants=0;
	String specialite;
	public Enseignant(String nom, String prenom, String rue, String ville, String specialite) {
		super(nom, prenom, rue, ville);
		this.specialite=specialite;
		nbEnseignants++;
	}

	@Override
	public void ecrirePersonne() {
		System.out.println("Enseignant: " + this.toString());
	}
	
	public String toString() {
		return super.toString() +" " + this.specialite;
	}

}
