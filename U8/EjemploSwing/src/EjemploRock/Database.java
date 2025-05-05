package EjemploRock;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {
	private static final String SERVER = "172.16.16.60";
	private static final String USER = "alu";
	private static final String PASS = "alu123";
	private static final String DB = "bd_rock";
	private static final String PORT = "3306";
	private static final String URL = "jdbc:mysql://" + SERVER + ":" + "/" + DB + "?serverTimezone=UTC";
	
	public boolean insertarDisco(String titulo, String grupo, Double precio) {
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL,USER,PASS);
		Statement stmt = conn.createStatement();
		
		String query = "INSERT INTO discos(titulo,grupo,precio) VALUES ('<<titulo>>','<<grupo>>','<<precio>>')";
		
		query = query.replaceAll("<<titulo>>",titulo)
				.replaceAll("<<grupo>>", grupo)
				.replaceAll("<<precio>>", String.valueOf(precio));
						stmt.executeUpdate(query);
						stmt.close();
						conn.close();
						
	}catch(Exception e) {
		System.out.println("ERROR: " + e );
		return false;
	}
	return true;
	}
}
