package src.Libros;

import java.util.Scanner;

public class Main {

    public static final int CANTIDAD_LIBROS = 3;

    public static void main(String[] args) {
        Libro[] libros = new Libro[CANTIDAD_LIBROS];

        for(int i = 0; i < libros.length; i++) {
            System.out.println("Libro " + (i + 1));
            libros[i] = pedirLibro();
            System.out.println();
        }

        Menu(libros);

    }

    public static Libro pedirLibro() {
        Scanner patata = new Scanner(System.in);

        Libro libros = new Libro();

        System.out.print("Titulo: ");
        libros.setTitulo(patata.nextLine().trim());
        System.out.print("Autor: ");
        libros.setAutor(patata.nextLine().trim());
        System.out.print("Isbn: ");
        libros.setIsbn(patata.nextLine().trim());

        return libros;
    }
    
    public static Libro[] ordenarLibro(Libro[] libros) {
		for(int i = 0; i < libros.length; i++) {
			libros[i].getTitulo();
		}
        return libros;
    }
    
    public static void Menu(Libro[] libros) {
		Scanner patata = new Scanner(System.in);

        int opcion;

		System.out.println("--- Titulos ---");

		for(int i = 0; i < libros.length; i++) {
			System.out.println((i + 1) + ". " + libros[i].getTitulo());
		}

		System.out.print("Opcion: ");
		opcion = patata.nextInt();

		if(opcion > 0 && opcion <= libros.length) {
			mostrarLibro(libros, opcion - 1);
		} else {
			System.out.println("Hasta luego!");
		}
    }

    public static void mostrarLibro(Libro[] libros, int indice) {
		Libro libro = libros[indice];
		System.out.println("\n--- Detalles del libro ---");
		System.out.println("Titulo: " + libro.getTitulo());
		System.out.println("Autor: " + libro.getAutor());
		System.out.println("ISBN: " + libro.getIsbn());
	}
	
}