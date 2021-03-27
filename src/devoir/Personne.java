package devoir;

public abstract class Personne {
	static int nbPersonnes=0;
	String nom;
	String prenom;
	String rue;
	String ville;
	public Personne(String nom, String prenom, String rue, String ville) {
		this.nom = nom;
		this.prenom = prenom;
		this.rue = rue;
		this.ville = ville;
		nbPersonnes++;
	}
	public String toString() {
		return this.nom + " "+this.prenom+" "+this.rue+" "+this.ville;
	}
	 public abstract void ecrirePersonne();
	 public static void nbPersonne(){
		 System.out.println("Nombre de personnes : " + nbPersonnes);
		 System.out.println("Nombre de secretaires : " + Secretaire.nbSecretaires);
		 System.out.println("Nombre de d'enseignants : " + Enseignant.nbEnseignants);
		 System.out.println("Nombre d'etudiants : " + Etudiant.nbEtudiants);
	 }
	 
	 public void modifierPersonne(String rue, String ville) {
		 this.rue = rue;
		 this.ville = ville;
		 this.ecrirePersonne();
	 }
	 
}
