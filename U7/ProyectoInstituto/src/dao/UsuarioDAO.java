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
			
			ps.setString(1, u.getNombreUsuario());
			ps.setString(2, u.getContraseña());
			ps.setString(3, u.getEmail());
			ps.executeUpdate();
		}
	}

	@Override
	public void insertarUsuariosLista(List<Usuario> usuarios) throws Exception {
		String sql = "INSERT INTO usuarios(nombre_usuario, password, email) VALUES (?,MD5(?),?)";
		
	}
}