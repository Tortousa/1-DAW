package main;

import java.util.Scanner;
import dao.IUsuarioDAO;
import dao.UsuarioDAO;
import modelo.Usuario;

public class MainEj1 {

    public static void main(String[] args) {
        IUsuarioDAO dao = new UsuarioDAO();
        Scanner patata = new Scanner(System.in);
        
        try {
            System.out.print("Introduzca su nombre de usuario: ");
            String user = patata.nextLine();
            
            System.out.print("Introduzca contraseña: ");
            String pass = patata.nextLine();
            
            System.out.print("Introduzca email: ");
            String email = patata.nextLine();
            
            Usuario usuario = new Usuario(user, pass, email);
            dao.insertarUsuario(usuario);
            
            System.out.println("Usuario insertado correctamente.");
        } catch (Exception e) {
            System.out.println("Error al insertar usuario.");
            e.printStackTrace();
        } finally {
        	patata.close();
        }
    }
}