package bd_Mysql;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
public class PersonneDAO implements Interface_gen_DAO<Personne>{
	Connection con= Myconnection.getconnection();
	String sql;
	Statement st = null;
	ResultSet rs = null;
	
	public PersonneDAO() {}
	@Override
	public void save(Personne p){
		try {
			if(this.findByid(p.getNum())==null){
				sql = "insert into Person values('"+p.getNum()+"','"+p.getNom()+"','"+p.getPrenom()+"')";
				st = con.createStatement();
				int result = st.executeUpdate(sql);
				if(result!=0) {
					System.out.println("Personne ajoutee avec succes");
				}else {
					System.out.println("Echec d'ajout de la personne");
				}
			}else {
				System.out.println("Personne existe deja !!!");
			}
			
		}catch(Exception e) {
			System.out.println("baaad");
		}
		
	}

	@Override
	public void remove(Personne p) {
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
	public void update(Personne p, String nom) {
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
	public Personne findByid(int id) {
		try {
			sql = "select * from Person where num='" +id+ "'";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				Personne p = new Personne(rs.getInt("num"),rs.getString("nom"),rs.getString("prenom"));
				return p;
			}
			return null;
		}catch(Exception e) {
			System.out.println("yooy");
			return null;
		}
		
	}

	@Override
	public ArrayList<Personne> getAll() {
		ArrayList<Personne> persons = new ArrayList<>();
		try {
			sql = "select * from Person";
			st = con.createStatement();
			rs = st.executeQuery(sql);
            while (rs.next()){  
                Personne person = new Personne(rs.getInt("num"),rs.getString("nom"),rs.getString("prenom"));
                persons.add(person);
            }
		}catch(Exception e) {
			System.out.print("Erreur");
		}
		
		return persons;
	}
	
	

}
