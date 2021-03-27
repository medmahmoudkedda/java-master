package bd_Mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CarDAO implements Interface_gen_DAO<Car>{
	Connection con= Myconnection.getconnection();
	String sql;
	Statement st = null;
	ResultSet rs = null;
	
	@Override
	public void save(Car c) {
		try {
			if(this.findByid(c.getNum())==null){
				sql = "insert into car values('num','type','modele')('"+c.getNum()+"','"+c.getType()+"','"+c.getModele()+"')";
				st = con.createStatement();
				int result = st.executeUpdate(sql);
				if(result!=0) {
					System.out.println("Car ajoutee avec succes");
				}else {
					System.out.println("Echec d'ajout de la car");
				}
			}else {
				System.out.println("Car existe deja !!!");
			}
			
		}catch(Exception e) {
			System.out.println("baaad");
		}
		
	}

	@Override
	public void remove(Car p) {
		try {
			if(this.findByid(p.getNum())!=null){
				sql = "delete from Person where num ='"+p.getNum()+"'";
				st = con.createStatement();
				int result = st.executeUpdate(sql);
				if(result!=0) {
					System.out.println("Personne supprimee avec succes");
				}else {
					System.out.println("Echec de suppression de la personne");
				}
			}else {
				System.out.println("Personne deja supprimee!!!");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void update(Car p, String nom) {
		try {
			sql = "update Person set nom='"+nom+"' where num ='"+p.getNum()+"'";
			st = con.createStatement();
			int result = st.executeUpdate(sql);
			if(result!=0) {
				System.out.println("Personne renommee avec succes");
			}else {
				System.out.println("Echec de renommage de la personne");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public Car findByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Car> getAll() {
		ArrayList<Car> cars = new ArrayList<>();
		try {
			sql = "select * from Car";
			st = con.createStatement();
			rs = st.executeQuery(sql);
            while (rs.next()){  
                Car car = new Car(rs.getInt("num"),rs.getString("type"),rs.getString("modele"),rs.getInt("numPerson"));
                cars.add(car);
            }
		}catch(Exception e) {
			System.out.print("Erreur");
		}
		
		return cars;
	}
	
	public ArrayList<Car> listcar(Personne p){
		ArrayList<Car> cars = new ArrayList<>();
		try {
			sql = "select * from Car wher numPerson ='"+p.getNum()+"'";
			st = con.createStatement();
			rs = st.executeQuery(sql);
            while (rs.next()){  
                Car car = new Car(rs.getInt("num"),rs.getString("type"),rs.getString("modele"),rs.getInt("numPerson"));
                cars.add(car);
            }
		}catch(Exception e) {
			System.out.print("Erreur");
		}
		
		return cars;
	}
}
