package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import dao.IUsuarioDAO;
import dao.UsuarioDAO;
import modelo.Usuario;

public class Main {

	public static void main(String[] args) {
		IUsuarioDAO dao = (IUsuarioDAO) new UsuarioDAO();
		Scanner patata = new Scanner(System.in);
		List<Usuario> lista;
		
		try {
			lista = new ArrayList<>();
			
			System.out.print("Introduzca su nombre de usuario: ");
			
			System.out.print("Introduzca contraseña: ");
			
			System.out.print("Introduzca email: ");
			
		}catch(Exception e){
			
		}	
	}
}