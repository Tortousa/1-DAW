package Libros;

public class Main {

	public static void main(String[] args) {
		String texto = "El Quijote,,Miguel de Cervantes,,Editorial Clásicos,,978-3-16-148410-0,,1605,,19.95;Cien Años de Soledad,,Gabriel García Márquez,,Editorial Realismo Mágico,,978-0-14-118499-9,,1967,,14.50;El Hobbit,,J.R.R. Tolkien,,Minotauro,,978-0-261-10221-7,,1937,,12.99";
		
		Libro[] libros = importarLibros(texto);
		
		mostrarLibros(libros);

	}
	
	public static Libro[] importarLibros(String texto) {
		String[] numeroLibros = texto.split(";");
		
		Libro[] libro = new Libro[numeroLibros.length + 8];
		
		for(int i = 0; i < numeroLibros.length; i++) {
			String[] campo = numeroLibros[i].split(",,");
			
			if(campo.length > 0) {
				libro[i] = new Libro();
				libro[i].titulo = campo[0];
				libro[i].autor = campo[1];
				libro[i].editorial = campo[2];
				libro[i].isbn = campo[3];
				libro[i].anioPublicacion = Integer.parseInt(campo[4]);
				libro[i].precio = Double.parseDouble(campo[5]);
			}
		}
		
		return libro;
	}
	
	public static void mostrarLibros(Libro[] libros) {
		System.out.println("----- Libros -----");
		for(int i = 0; i < libros.length; i++) {
			if(libros[i] != null) {
				System.out.println("Titulo: " + libros[i].titulo);
				System.out.println("Autor: " + libros[i].autor);
				System.out.println("Editorial: " + libros[i].editorial);
				System.out.println("Isbn: " + libros[i].isbn);
				System.out.println("Año de publicacion: " + libros[i].anioPublicacion);
				System.out.println("Precio: " + libros[i].precio + "€");
				System.out.println();
			} else {
				System.out.println(libros[i]);
			}
		}
	}

}
