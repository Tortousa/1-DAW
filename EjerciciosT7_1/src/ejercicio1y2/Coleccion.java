package ejercicio1y2;

public abstract class Coleccion {
	private String nombre;
	private int anio;
	private double precio;
	
	public Coleccion(String nombre, int anio, double precio) {
		this.nombre = nombre;
		this.anio = anio;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
        return "Nombre: " + nombre + ", Año: " + anio + ", Valor: " + precio + "€";
    }
}