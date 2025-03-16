package ejercicio1y2;

public abstract class Disco {
    private String titulo;
    private String artista;
    private int anio;
    private double precio;

    public Disco(String titulo, String artista, int anio, double precio) {
        this.titulo = titulo;
        this.artista = artista;
        this.anio = anio;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
    public String toString() {
        return "Título: " + titulo + ", Artista: " + artista + ", Año: " + anio + ", Precio: " + precio + "€";
    }
}