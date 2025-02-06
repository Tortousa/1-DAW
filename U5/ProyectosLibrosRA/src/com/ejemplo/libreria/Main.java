package com.ejemplo.libreria;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Main {
	
	public static final String MENU = "1 - Mostrar Libros\n2 - Buscar libro por titulo\n3 - Salir";
	
	public static void main(String[] args) {
		Scanner patata = new Scanner(System.in);
		String rutaArchivo = "./files/libros.txt";
		
		ArrayList<Libro> libros = importarLibros(rutaArchivo);

		mostrarMenu(libros, patata);
		
	}
	
	public static void mostrarMenu(ArrayList<Libro> libros, Scanner patata) {
		String titulo = "";
		int opcion;
		
		do {
			System.out.println(MENU);
			opcion = pedirInt("Opcion nº: ", patata);
			
			if(opcion < 0 || opcion > 3) {
				System.out.println("Opcion no valida.");
			}
		}while(opcion < 0 || opcion > 3);
		
		if(opcion == 1) {
			System.out.println("Libros almacenados\n--------------------");
			
			mostrarLibro(libros);
		}
		if(opcion == 2) {
			for (int i = 0; i < libros.size(); i++) {
		        System.out.println((i + 1) + " - " + libros.get(i).getTitulo());
		    }
		    
			System.out.print("Titulo: ");
			titulo = patata.nextLine().trim();
			
			for (Libro i : libros) {
	    		if (titulo.equalsIgnoreCase(i.getTitulo())) {
	    			 mostrarLibro(libros);
	    			 return;
	        	}
	    	}
		}
		if(opcion == 3) {
			System.out.println("Hasta luego!");
		}
	}
	
	public static void mostrarLibro(ArrayList<Libro> libros) {
	    System.out.println(libros);
	    System.out.println();
	}
	
	public static ArrayList<Libro> importarLibros(String rutaArchivo) {
		ArrayList<Libro> librosFuncion = new ArrayList<>();
		
		File archivo = new File(rutaArchivo);
		
		try(Scanner lector = new Scanner(archivo)){
			while(lector.hasNextLine()) {
				String linea = lector.nextLine();
				String[] datos = linea.split(",,");
				
				if(datos.length == 6) {
					try {
						int anio = Integer.parseInt(datos[4]);
						double precio = Double.parseDouble(datos[5]);
						
						Libro libro = new Libro(datos[0], datos[1], datos[2], datos[3], anio, precio);
						
						librosFuncion.add(libro);
						
					} catch(NumberFormatException e) {
						System.out.println("Error en la linea " + linea);
					}
				}
			}
		}catch(Exception e) {
			System.out.println("Error, no se encontro el archivo: " + rutaArchivo);
		}
		return librosFuncion;
	}
	
	public static int pedirInt(String enunciado, Scanner patata) {
		int n = 0;
		boolean check = false;

		do {
			System.out.print(enunciado);

			try {
				n = Integer.parseInt(patata.nextLine().trim());
				check = true;
			} catch (Exception e) {
				System.out.println("Error, no has introducido un numero.");
			}
		} while (!check);
		return n;
	}
}
