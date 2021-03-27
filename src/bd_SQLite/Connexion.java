package bd_SQLite;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {
	static String url="jdbc:mysql://localhost:3308/java_master";
	static Connection con=null;
	public static Connection getConnexion() {
		try {
			Class.forName("org.sqlite.JDBC");
			con=DriverManager.getConnection("jdbc:sqlite:Shop.db");
			return con;
		}catch(Exception e) {
			System.out.println("yaaaay");
			return null;
		}	
	}
}
