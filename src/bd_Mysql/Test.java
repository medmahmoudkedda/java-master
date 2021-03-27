package bd_Mysql;
import java.sql.*;
import java.util.ArrayList;
public class Test {
	static PersonneDAO person = new PersonneDAO();
	static CarDAO car = new CarDAO();
	public static void main(String[] args) throws SQLException{
		Personne p = new Personne(4,"Ahmed", "Ali");
		Personne p1 = new Personne(11,"Sidi", "Ali");
		Personne p2 = new Personne(12,"Moussa", "BA");
		Personne p3 = new Personne(13,"Mariem", "Yeslm");
		person.save(p2);
	
		Car c1 =new Car(104,"Mercdes","190",p.getNum());
		car.save(c1);
		//person.save(p1);
		//person.remove(p1);
		//person.update(p, "Mohamed");
		
		ArrayList<Personne> persons = person.getAll();
		int i= 0;
		System.out.println("#num       Nom          Prenom");
		while(i<persons.size()) {
			Personne perso =persons.get(i);
			System.out.println(perso.getNum() +"       "+perso.getNom()+"          "+perso.getPrenom());
			i++;
		}
		
		System.out.println("Voici les car de Moussa:");
		ArrayList<Car> listcar = car.listcar(p2);
		i=0;
		while(i<persons.size()){
			Personne perso =persons.get(i);
			System.out.println(perso.getNum() +"       "+perso.getNom()+"          "+perso.getPrenom());
			i++;
		}
	} 

}
