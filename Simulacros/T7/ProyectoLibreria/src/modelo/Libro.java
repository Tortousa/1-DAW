package modelo;

public class Libro {
	private int id;
	private String titulo;
	private String autor;
	private double precio;
	
	public Libro() {
		
	}
	
	public Libro(String titulo, String autor, double precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}
	
	public Libro(int id, String titulo, String autor, double precio) {
		this(titulo, autor, precio);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Libro [id : " + id + "\ntitulo : " + titulo + "\nautor : " + autor + "\nprecio : " + precio + "€]";
	}
}
