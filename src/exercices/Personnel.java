package exercices;

class Personnel {
    private static Employe[] employe;
    private int nbreEmploye=0;
    private final static int MAXEMPLOYE = 200;
 
    public Personnel() {
        employe = new Employe[MAXEMPLOYE];
        nbreEmploye = 0;
    }
 
    public void ajouterEmploye(Employe e) throws Exception_salaire,Chiffre_Exception,Nom_Exception{
        ++nbreEmploye;
        if (nbreEmploye <= MAXEMPLOYE) {
            employe[nbreEmploye - 1] = e;
        } else {
            System.out.println("Pas plus de " + MAXEMPLOYE + " employés");
        }
        if(e.getNom().contains("Moussa") || e.getNom().contains("Issa") ||e.getNom().contains("Ahmed")) {
        	throw new Nom_Exception("Exception, " +e.getNom() + ", son nom invalide");
        }
        
        if((e instanceof Representant) || (e instanceof Vendeur)){
        	Representant r;
        	Vendeur v;
        	if((e instanceof Representant)) {
        		r = (Representant)e;
        		if (r.getChiffreAffaire() < 1000) {
            		throw new Chiffre_Exception("Exception, " +r.getNom() + " son chiffre d'affaire non valide");
            	}
        	}else {
        		v = (Vendeur)e;
        		if (v.getChiffreAffaire() < 1000) {
            		throw new Chiffre_Exception("Exception, " +v.getNom() + " son chiffre d'affaire non valide");
            	}
        	}
        	
        }
        
        if(e.calculerSalaire() < 1000 || e.calculerSalaire() > 20000) {
        	throw new Exception_salaire("Exception, " + e.getNom() + ", son salaire est non valide");
        }
        
    }
    static void afficherRisque() {
    	System.out.println("\nVoici les employes a risque:");
    	for(int i=0;i<MAXEMPLOYE; i++) {
    		if((employe[i] instanceof TechnARisque) || (employe[i] instanceof ManutARisque)) {
    			System.out.println(employe[i].getNom());
    		}
    	}
    }
    public double salaireMoyen() {
        double somme = 0.0;
        for (int i = 0; i < nbreEmploye; i++) {
            somme += employe[i].calculerSalaire();
        }
        return somme / nbreEmploye;
    }
 
    public void afficherSalaires() {
        for (int i = 0; i < nbreEmploye; i++) {
            System.out.println(employe[i].getNom() + " gagne "
                    + employe[i].calculerSalaire() + " UM.");
        }
    }
}