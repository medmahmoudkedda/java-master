package test;

public class sacados {

	public static void main(String[] args) {
		int nbrObj=4;
		int[] poids= {2,3,4,5};
		int[] valeurs= {5,10,15,9};
		int capacite=6;
		int[][] tab= new int[nbrObj+1][capacite+1];
		
		for(int i=0;i<=nbrObj;i++) {
			tab[i][0]=0;
		}
		
		for(int j=0;j<=capacite;j++) {
			tab[0][j]=0;
		}
		
		for(int i=1;i<=nbrObj;i++) {
			for(int j=1;j<=capacite;j++) {
				if(poids[i-1]<=j) {
					tab[i][j] = Math.max(tab[i-1][j],tab[i-1][j-poids[i-1]]+valeurs[i-1]);
				}else {
					tab[i][j]=tab[i-1][j];
				}
			}
		}
		
		System.out.println(tab[nbrObj][capacite]);

	}

}
