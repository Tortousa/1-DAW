package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import conexion.ConexionBD;
import modelo.Usuario;

public class UsuarioDAO implements IUsuarioDAO {
	
	@Override
	public void insertarUsuario(Usuario u) throws Exception {
		String sql = "INSERT INTO usuarios(nombre_usuario, password, email) VALUES (?,MD5(?),?)";
	
		try(Connection con = ConexionBD.getConnection();
			PreparedStatement ps = con.prepareStatement(sql)){
			
			ps.setString(1, u.getNombre());
			ps.setString(2, u.getContraseña());
			ps.setString(3, u.getEmail());
			ps.executeUpdate();
		}
	}

	@Override
	public void insertarUsuariosLista(List<Usuario> usuarios) throws Exception {
	    String sql = "INSERT INTO usuarios_completa(nombre, apellidos, dni, email, direccion, telefono) VALUES (?,?,?,?,?,?)";

	    try (Connection con = ConexionBD.getConnection();
	         PreparedStatement ps = con.prepareStatement(sql)) {

	        for (Usuario u : usuarios) {
	            ps.setString(1, u.getNombre());
	            ps.setString(2, u.getApellidos());
	            ps.setString(3, u.getDni());
	            ps.setString(4, u.getEmail());
	            ps.setString(5, u.getDireccion());
	            ps.setString(6, u.getTelefono());
	            ps.addBatch();
	        }

	        ps.executeBatch();
	        System.out.println("Usuarios insertados correctamente.");
	    }
	}
}