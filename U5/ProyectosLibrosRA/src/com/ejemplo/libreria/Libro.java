package com.ejemplo.libreria;

import java.util.regex.Pattern;

public class Libro {
	private String titulo, autor, editorial, isbn;
	private int anioPublicacion;
	private double precio;
	
	private static final Pattern REGEX_TITULO = Pattern.compile("^[\\p{L}0-9,.-]{2,20}$");
	
	private static final Pattern REGEX_EDITORIAL = Pattern.compile("^[\\p{L}0-9,.-]{2,100}$");
	
	private static final Pattern REGEX_AUTOR = Pattern.compile("^[\\p{L}]{2,10}$");
	
	private static final Pattern REGEX_ISBN = Pattern.compile("^(97(8|9))?\\d{9}(\\d|X)$");
	
	private static final Pattern REGEX_PRECIO= Pattern.compile("^[\\d{1,7}(\\.\\d{1,2})?$");
	
	public static boolean esValidoAnio(int anioPublicacion) {
		int anioActual = java.time.Year.now().getValue();
		return anioPublicacion >= 1000 && anioPublicacion <= anioActual;
	}
	
	public static boolean esValidoPrecio(double precio) {
		return precio >= 0 && REGEX_PRECIO.matcher(String.valueOf(precio)).matches();
	}
	
	public static boolean esValidoIsbn(String isbn) {
		return REGEX_ISBN.matcher(isbn).matches();
	}
	
	public static boolean esValidoAutor(String autor) {
		return REGEX_AUTOR.matcher(autor).matches();
	}
	
	public static boolean esValidoTitulo(String titulo) {
		return REGEX_TITULO.matcher(titulo).matches();
	}
	
	public static boolean esValidoEditorial(String editorial) {
		return REGEX_EDITORIAL.matcher(editorial).matches();
	}
	
	public Libro(String titulo, String autor, String editorial, String isbn, int anioPublicacion, double precio) {
		this.titulo = titulo;
		if(!esValidoTitulo(titulo)) {
			throw new IllegalArgumentException("Titulo no valido.");
		}
		
		this.autor = autor;
		if(!esValidoAutor(autor)) {
			throw new IllegalArgumentException("Nombre no valido.");
		}
		
		this.editorial = editorial;
		if(!esValidoEditorial(editorial)) {
			throw new IllegalArgumentException("Editorial no valida.");
		}
		
		this.isbn = isbn;
		if(!esValidoIsbn(isbn)) {
			throw new IllegalArgumentException("Isbn no valido.");
		}
		
		this.anioPublicacion = anioPublicacion;
		if(!esValidoAnio(anioPublicacion)) {
			throw new IllegalArgumentException("Año de publicacion no valido.");
		}
		
		this.precio = precio;
		if(!esValidoPrecio(precio)) {
			throw new IllegalArgumentException("Precio no valido.");
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
	    return "Título: " + titulo +
	           "\nAutor: " + autor +
	           "\nEditorial: " + editorial +
	           "\nIsbn: " + isbn +
	           "\nAño: " + anioPublicacion +
	           "\nPrecio: " + precio + " €";
	}
}
