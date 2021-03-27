package devoir;

public class Secretaire extends Personne{
	public static int nbSecretaires=0;
	String numeroBureau;
	public Secretaire(String nom, String prenom, String rue, String ville, String numeroBureau) {
		super(nom, prenom, rue, ville);
		this.numeroBureau = numeroBureau;
		nbSecretaires++;
	}
	
	@Override
	public void ecrirePersonne() {
		System.out.println("Secretaire: " + this.toString());
	}
	
	public String toString() {
		return super.toString() +" " + this.numeroBureau;
	}

}
