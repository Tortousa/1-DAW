package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import conexion.ConexionBD;
import modelo.Alumno;

public class AlumnoDAO {
	//Insertamos alumnos a la base de datos
	public void insertarAlumnos(List<Alumno> lista) throws SQLException {
		String sql = "INSERT INTO alumnos(id, nombre, apellidos, dni, email, direccion, telefono) VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		try(Connection con = ConexionBD.getConnection();
				PreparedStatement ps = con.prepareStatement(sql)){
				
			for(Alumno a : lista) {
				ps.setInt(1, a.getId());
				ps.setString(2, a.getNombre());
				ps.setString(3, a.getApellidos());
				ps.setString(4, a.getDni());
				ps.setString(5, a.getEmail());
				ps.setString(6, a.getDireccion());
				ps.setString(7, a.getTelefono());
				ps.executeUpdate();
			}
		}
	}
}