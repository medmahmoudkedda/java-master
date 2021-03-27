package devoir;

public class Test {
	static Personne[] personne = new Personne[10];
	public static void main(String[] args) {
		 personne[0] = new Secretaire("Sidi","Ali","Gemal","NKTT","B01");
		 personne[1] = new Enseignant("Moussa","Ba","Digol","NKTT","SIG");
		 personne[2] = new Etudiant("Mariem","Med","Kenndy","NKTT","BTS");
		 Personne.nbPersonne();
		 System.out.println("\n\n");
		 System.out.println("Voici les infos des personnes:");
		 int i=0;
		 while(i<Personne.nbPersonnes) {
			 afficherPersonne(personne[i]);
			 i++;
		 }
		 personne[0].modifierPersonne("it", "algo");
	}
	public static void afficherPersonne(Personne P) {
		System.out.println(P);
	}
	
	
}
