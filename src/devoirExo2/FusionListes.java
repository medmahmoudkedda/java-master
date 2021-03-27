package devoirExo2;

public class FusionListes {
	
	public static void main(String[] args) {
		Liste A = new Liste(10);
		//A = A.ajouter(10, A);
		A = A.ajouter(40, A);
		A = A.ajouter(50, A);
		A = A.ajouter(60, A);
		//A.suppVal(A, 60);
		A.suppLast(A);
		afficherListe(A);
		/*
		 * Liste B = new Liste(5,null); B = B.ajouter(30,B); B = B.ajouter(35,B); B =
		 * B.ajouter(45,B); B = B.ajouter(1,B);
		 */
		
		//Liste fusion = merge(A,B);
		//afficherListe(fusion);
	}
	
	static Liste merge(Liste A, Liste B) {
		Liste temp;
		for(temp=B;temp.suivant!=null;temp=temp.suivant);
		if(A.val >= B.val && A.val > temp.val ) {
			temp.suivant = A;
			return B;
		}else {
			for(temp=A;temp.suivant!=null;temp=temp.suivant);
			temp.suivant = B;
			return A;
		}
	}
	static void afficherListe(Liste l) {
		for(Liste temp=l;temp!=null;temp=temp.suivant) {
			System.out.print(temp.val + " - ");
		}
	}
}
