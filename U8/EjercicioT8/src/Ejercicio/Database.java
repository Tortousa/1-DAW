package Ejercicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {
	private static final String SERVER = "172.16.16.60";
	private static final String USER = "alumno";
	private static final String PASS = "alumno123";
	private static final String DB = "bd_agenda";
	private static final String PORT = "3306";
	private static final String URL = "jdbc:mysql://" + SERVER + ":" + PORT + "/" + DB + "?serverTimezone=UTC";

	public boolean insertarContacto(String nombre, String email, String telefono) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(URL, USER, PASS);
			Statement stmt = conn.createStatement();

			String query = "INSERT INTO contacto(nombre, email, telefono) VALUES ('<<nombre>>', '<<email>>', '<<telefono>>')";

			query = query.replaceAll("<<nombre>>", nombre)
						 .replaceAll("<<email>>", email)
						 .replaceAll("<<telefono>>", telefono);

			stmt.executeUpdate(query);
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("ERROR: " + e);
			return false;
		}
		return true;
	}
}