package dao;

import java.util.List;
import modelo.Usuario;

public interface IUsuarioDAO {
	void insertarUsuario(Usuario u) throws Exception;
	
	void insertarUsuariosLista(List<Usuario> usuarios) throws Exception;
}