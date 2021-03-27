package bd_Mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class Myconnection {
	 static String url="jdbc:mysql://localhost:3308/java_master";
	 static Connection con=null;
	
	public static Connection getconnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,"MedMahmoud","hahouserver2019");
			return con;
		}catch(Exception e) {
			System.out.println("yaaaay");
			return null;
		}	
	}
	
}
