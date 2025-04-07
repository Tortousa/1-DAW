package main;

import java.util.Scanner;

import dao.LibroDAO;

public class Main {
	
	public static final String MENU = "--- GESTION DE LIBROS ---\n1 - Insertar libros manualmente\n2 - Listar todos los libros";

	public static void main(String[] args) {
		LibroDAO dao = new LibroDAO();
		Scanner patata = new Scanner(System.in);
		int opcion;
		
		do {
			System.out.print(MENU);
			opcion = patata.nextInt();
			
			switch(opcion) {
				case 1 : 
					insertarLibroManual();
					break;
				default:
					System.out.println("Opcion no valida.");
			}
			
		}while(opcion != 0);
		
		patata.close();
	}

}
