package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// Necesario cambiar datos, ya que lo ejecute desde mi PC.
public class ConexionBD {
	private static final String URL = "jdbc:mysql://localhost:3306/bd_instituto?serverTimezone=UTC";
	private static final String USER = "root"; //alumno
	private static final String PASS = "ZombiE300?"; //alumno123
	
	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}  catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return DriverManager.getConnection(URL,USER,PASS);
	}
}