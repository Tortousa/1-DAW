package com.ejemplo.libreria;

import java.util.regex.Pattern;

public class Libro {
	private String titulo, autor, editorial, isbn;
	private int anioPublicacion;
	private double precio;
	
	public static final Pattern regexTitulo = Pattern.compile("^[\\p{L}0-9\\p{Z}]{2,20}$");
	
	public Libro(String titulo, String autor, String editorial, String isbn, int anioPublicacion, double precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.isbn = isbn;
		this.anioPublicacion = anioPublicacion;
		this.precio = precio;
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
