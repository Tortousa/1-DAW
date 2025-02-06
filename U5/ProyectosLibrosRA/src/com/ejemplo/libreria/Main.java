package com.ejemplo.libreria;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	private static final String MENU = 
		"\n1 - Mostrar Libros\n2 - Buscar libro por título\n3 - Salir\n";
	
	public static void main(String[] args) {
		Scanner patata = new Scanner(System.in);
		String rutaArchivo = "./files/libros.txt";
		
		ArrayList<Libro> libros = importarLibros(rutaArchivo);

		mostrarMenu(libros, patata);
		patata.close();
	}
	
	public static void mostrarMenu(ArrayList<Libro> libros, Scanner patata) {
		int opcion;

		do {
			System.out.println(MENU);
			opcion = pedirInt("Opcion nº: ", patata);
			
			switch (opcion) {
				case 1:
					System.out.println("\nLibros almacenados\n--------------------");
					mostrarLibros(libros);
					break;
				case 2:
					buscarLibroPorTitulo(libros, patata);
					break;
				case 3:
					System.out.println("\nHasta luego!");
					break;
				default:
					System.out.println("\nOpción no valida, intenta de nuevo.");
			}
		} while (opcion != 3);
	}
	
	public static void mostrarLibros(ArrayList<Libro> libros) {
		if (libros.isEmpty()) {
			System.out.println("\nNo hay libros disponibles.");
			return;
		}
		for (Libro libro : libros) {
			System.out.println(libro + "\n--------------------");
		}
	}
	
	public static void buscarLibroPorTitulo(ArrayList<Libro> libros, Scanner patata) {
		System.out.print("\nIntroduce el titulo del libro: ");
		String titulo = patata.nextLine().trim();

		for (Libro libro : libros) {
			if (titulo.equalsIgnoreCase(libro.getTitulo())) {
				System.out.println("\nLibro encontrado:\n" + libro);
				return;
			}
		}
		System.out.println("\nNo se encontró un libro con ese titulo.");
	}
	
	public static ArrayList<Libro> importarLibros(String rutaArchivo) {
		ArrayList<Libro> librosFuncion = new ArrayList<>();
		File archivo = new File(rutaArchivo);

		try (Scanner lector = new Scanner(archivo)) {
			while (lector.hasNextLine()) {
				String linea = lector.nextLine();
				String[] datos = linea.split(",,");
				
				if (datos.length == 6) {
					try {
						int anio = Integer.parseInt(datos[4]);
						double precio = Double.parseDouble(datos[5]);
						
						Libro libro = new Libro(datos[0], datos[1], datos[2], datos[3], anio, precio);
						librosFuncion.add(libro);
					} catch (NumberFormatException e) {
						System.out.println("Error en la linea: " + linea + " (Formato incorrecto)");
					}
				} else {
					System.out.println("Linea ignorada (Formato incorrecto): " + linea);
				}
			}
		} catch (Exception e) {
			System.out.println("Error: No se encontró el archivo en " + rutaArchivo);
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
				System.out.println("Error: No has introducido un numero valido.");
			}
		} while (!check);
		return n;
	}
}