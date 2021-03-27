package bd_Mysql;

import java.util.ArrayList;

public interface InterfaceDAO {
	public void save(Personne p);
	public void remove(Personne p);
	public void update(Personne p, String nom);
	public Personne findByid(int id);
	ArrayList<Personne> getAll();
}
