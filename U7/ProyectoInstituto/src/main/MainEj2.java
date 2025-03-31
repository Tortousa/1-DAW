package main;

import java.util.List;
import dao.IUsuarioDAO;
import dao.UsuarioDAO;
import modelo.Usuario;
import utils.Utils;

public class MainEj2 {
    public static void main(String[] args) {
        IUsuarioDAO dao = new UsuarioDAO();
        String rutaArchivo = "./files/usuarios.txt";

        List<Usuario> usuarios = Utils.leerUsuarios(rutaArchivo);

        if (!usuarios.isEmpty()) {
            try {
                dao.insertarUsuariosLista(usuarios);
            } catch (Exception e) {
                System.out.println("Error al insertar usuarios: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            System.out.println("No se encontraron usuarios en el archivo.");
        }
    }
}