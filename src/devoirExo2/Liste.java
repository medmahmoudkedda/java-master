package devoirExo2;
class Liste{
	int val;
	Liste suivant;
	Liste(int val){
		this.val = val;
		this.suivant = null;
	}
	
	Liste ajouter(int val, Liste l) {
		if(l==null) {
			return new Liste(val);
		}
		Liste temp=l;
		for(;temp.suivant!=null;temp=temp.suivant);
		temp.suivant = new Liste(val);
		return l;
	}
	
	Liste suppVal(Liste l,int val) {
		if(l.val == val) {
			return l.suivant;
		}
		Liste a =l,b=a.suivant;
		for(;b!=null;a=b, b=b.suivant) {
			if(b.val == val) {
				a.suivant = b.suivant;
				break;
			}
		}
		return l;
	}
	
	Liste suppLast(Liste l) {
		Liste a =l,b=a.suivant;
		for(;b.suivant!=null;a=b, b=b.suivant) {
		}
		a.suivant=null;;
		return l;
	}
	
	
}