package main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import dao.LibroDAO;
import modelo.Libro;
import utils.Utils;

public class Main {
	
	public static final String MENU = "--- GESTION DE LIBROS ---"
	        + "\n1. Insertar libro manualmente."
	        + "\n2. Listar todos los libros."
	        + "\n3. Buscar libro por ID."
	        + "\n4. Actualizar libro por ID."
	        + "\n5. Borrar libro por ID."
	        + "\n6. Buscar libros con precio <= X."
	        + "\n7. Leer libros de fichero e insertar."
	        + "\n0. Salir"
	        + "\nElige una opcion: ";

	public static void main(String[] args) {
		LibroDAO dao = new LibroDAO();
		Scanner patata = new Scanner(System.in);
		int opcion;
		
		do {
			System.out.print(MENU);
			opcion = Integer.parseInt(patata.nextLine());
			
			switch(opcion) {
				case 1 : 
					insertarLibroManual(patata, dao);
					break;
				case 2 :
					listarLibros(dao);
					break;
				case 3 :
					buscarLibroPorId(patata, dao);
					break;
				case 4 :
					actualizarLibro(patata, dao);
					break;
				case 5 :
					borrarLibro(patata, dao);
					break;
				case 6 :
					buscarPorPrecioMax(patata, dao);
					break;
				case 7 :
					leerInsertar(dao);
					break;
				case 0 :
					System.out.println("Hasta luego!");
					break;
				default:
					System.out.println("Opcion no valida.");
			}
			
			System.out.println();
			
		}while(opcion != 0);

		patata.close();
	}

	private static void leerInsertar(LibroDAO dao) {
		Utils lector = new Utils();
		String ruta = "librosRA9.txt";
		List<Libro> lista = lector.leerFichero(ruta);
		
		if(lista.isEmpty()) {
			return;
		}
		try {
			for(Libro l : lista) {
				dao.insertarLibro(l);
			}
			System.out.println("Libros insertados desde fichero correctamente.");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	private static void buscarPorPrecioMax(Scanner patata, LibroDAO dao) {
		try {
			System.out.print("Inserta el precio MAX: ");
			double precio = Double.parseDouble(patata.nextLine());
			List<Libro> libros = dao.buscarPorPrecioMax(precio);
			
			if(libros.isEmpty()) {
				System.out.println("No hay libros con precio <= " + precio);
			} else {
				 System.out.println("Libros con precio <= " + precio + "€:");
				for(Libro l : libros) {
					System.out.println(l);
				}
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	private static void borrarLibro(Scanner patata, LibroDAO dao) {
		try {
			System.out.print("Inserta el ID del libro a buscar y borrar: ");
			int id = Integer.parseInt(patata.nextLine());
			Libro libro = dao.obtenerPorId(id);
			if(libro == null) {
				System.out.println("Libro con ID " + id + " no encontrado.");
				return;
			}
			
			dao.borrarLibro(id);
			System.out.println("Libro borrado correctamente.");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	private static void actualizarLibro(Scanner patata, LibroDAO dao) {
		try {
			System.out.print("Inserta el ID del libro a buscar y actualizar: ");
			int id = Integer.parseInt(patata.nextLine());
			Libro libro = dao.obtenerPorId(id);
			
			if(libro == null) {
				System.out.println("Libro con ID " + id + " no encontrado.");
				return;
			}
			System.out.println("Libro actual: " + libro);
			System.out.print("(Dejar vacio para no actualizar)Titulo nuevo: ");
			String tituloNuevo = patata.nextLine();
			if(!tituloNuevo.isEmpty()) {
				libro.setTitulo(tituloNuevo);
			}
			System.out.print("(Dejar vacio para no actualizar)Autor nuevo: ");
			String autorNuevo = patata.nextLine();
			if(!autorNuevo.isEmpty()) {
				libro.setAutor(autorNuevo);
			}
			System.out.print("(0 para no actualizar)Precio nuevo: ");
			double precioNuevo = Double.parseDouble(patata.nextLine());
			if(precioNuevo != 0) {
				libro.setPrecio(precioNuevo);
			}
			
			dao.actualizaLibro(libro);
			System.out.println("Libro actualizado correctamente.");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	private static void buscarLibroPorId(Scanner patata, LibroDAO dao) {
		try {
			System.out.print("Inserta el ID del libro a buscar: ");
			int id = Integer.parseInt(patata.nextLine());
			Libro libro = dao.obtenerPorId(id);
			
			if(libro != null) {
				System.out.println("Libro con ID " + id + " encontrado:\n" + libro);
			} else {
				System.out.println("Libro con ID " + id + " no encontrado.");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	private static void listarLibros(LibroDAO dao) {
		try {
			List<Libro> libros = dao.leerLibros();
			if(libros.isEmpty()) {
				System.out.println("No hay libros en la BBDD");
			} else {
				for(Libro l : libros) {
					System.out.println(l);
				}
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

	private static void insertarLibroManual(Scanner patata, LibroDAO dao) {
		try {
			System.out.print("Titulo: ");
			String titulo = patata.nextLine();
			System.out.print("Autor: ");
			String autor = patata.nextLine();
			System.out.print("Precio: ");
			double precio = Double.parseDouble(patata.nextLine());
			
			Libro libro = new Libro(titulo, autor, precio);
			dao.insertarLibro(libro);
			System.out.println("Libro insertado correctamente");
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
}
