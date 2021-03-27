package bd_Mysql;

public class ListeCars {
	Car car;
	ListeCars suivant;
	public ListeCars() {}
	public ListeCars(Car car, ListeCars l) {
		this.car = car;
		this.suivant = l;
	}
	
	ListeCars ajouterCar(Car c,ListeCars l) {
		return new ListeCars(c, l);
	}
	
	void afficherCars(ListeCars l) {
		System.out.println("#num         Type           modele");
		ListeCars temp =l;
		while(temp!=null) {
			Car c = temp.car;
			System.out.println(c.getNum()+"         "+c.getType()+"           "+c.getModele());
			temp = temp.suivant;
		}
	}
}
