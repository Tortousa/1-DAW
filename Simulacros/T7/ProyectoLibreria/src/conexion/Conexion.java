package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static final String URL = "jdbc:mysql://192.168.0.191:3306/bd_libreria?serverTimezone=UTC";
    private static final String USER = "alumno";
    private static final String PASS = "alumno123";
	
	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return DriverManager.getConnection(URL, USER, PASS);
	}
}
