package bd_Mysql;

import java.util.ArrayList;

public interface Interface_gen_DAO<T> {
	public void save(T p);
	public void remove(T p);
	public void update(T p, String nom);
	public T findByid(int id);
	ArrayList<T> getAll();
}
