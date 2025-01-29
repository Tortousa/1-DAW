package com.ejemplo.libreria;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rutaArchivo = "./files/libros.txt";
		
		ArrayList<Libro> libros = importarLibros(rutaArchivo);

		mostrarMenu(libros, sc);
		
	}
	
	public static void mostrarMenu(ArrayList<Libro> libros, Scanner sc) {
		String opcion = "";
		System.out.println("Titulos de los libros\n-------------------");
		
	    for (int i = 0; i < libros.size(); i++) {
	        System.out.println((i + 1) + " - " + libros.get(i).getTitulo());
	    }

	    System.out.print("Titulo: ");
	    opcion = sc.nextLine().trim();

	    boolean check = false;

	    for (Libro i : libros) {
	        if (opcion.equalsIgnoreCase(i.getTitulo())) {
	           	mostrarLibro(i);
	           	check = true;
												break;
	        }
	    }

	    if (!check) {
	        System.out.println("Título no válido.");
	    }
	}

	public static void mostrarLibro(Libro libro) {
	    System.out.println(libro);
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
}
