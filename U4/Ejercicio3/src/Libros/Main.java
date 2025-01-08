import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static final int CANTIDAD_LIBROS = 3;

    public static void main(String[] args) {
    	Scanner patata = new Scanner(System.in);
    	
        Libro[] libros = new Libro[CANTIDAD_LIBROS];

        for(int i = 0; i < libros.length; i++) {
            System.out.println("Libro " + (i + 1));
            libros[i] = pedirLibro(patata);
            System.out.println();
        }
        
        Libro[] librosOrd = ordenarLibro(libros);

        crearMenu(librosOrd, patata);
        
        patata.close();

    }

    public static Libro pedirLibro(Scanner patata) {
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
    	Comparator<Libro> comparador = (libro1,libro2) -> (libro1).getTitulo().compareTo((libro2).getTitulo());
    	//Compara dos objetos, libro1 y libro2. No son libro[0] y libro[1] sino que compara dos objetos a lo largo del proceso.
        Arrays.sort(libros, comparador);
        
        return libros;
    }
    
    public static void crearMenu(Libro[] libros, Scanner patata) {
		System.out.println("--- Titulos ---");
		
		int opcion;

		for(int i = 0; i < libros.length; i++) {
			System.out.println((i + 1) + ". " + libros[i].getTitulo());
		}
		
		System.out.println("0. Salir");
		
		do {
			opcion = pedirInt("Opcion: ", patata);
			
			if(opcion > 0 && opcion <= libros.length) {
				mostrarLibro(libros, opcion - 1);
				break;
			} if(opcion < 0 || opcion > libros.length) {
				System.out.println("Opcion no valida.");
				continue;
			} else {
				System.out.println("Hasta luego!");
			}
		}while(opcion != 0);
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

    public static void mostrarLibro(Libro[] libros, int indice) {
		Libro libro = libros[indice];
		System.out.println("\n--- Detalles del libro ---");
		System.out.println("Titulo: " + libro.getTitulo());
		System.out.println("Autor: " + libro.getAutor());
		System.out.println("ISBN: " + libro.getIsbn());
	}
}
