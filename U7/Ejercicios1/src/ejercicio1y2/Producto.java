package ejercicio1y2;

public abstract class Producto {
	private String nombre;
	private double precio;
	private String codigoBarras;
	
	public Producto(String nombre, double precio, String codigoBarras) {
		this.nombre = nombre;
		this.precio = precio;
		this.codigoBarras = codigoBarras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	
	@Override
	public String toString() {
        return "Nombre: " + nombre + ", Precio: " + precio + "€, Código de Barras: " + codigoBarras;
    }
}
