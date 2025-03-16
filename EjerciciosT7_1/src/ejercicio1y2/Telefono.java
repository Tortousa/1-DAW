package ejercicio1y2;

public class Telefono extends Producto{
	private String marca;
	
	public Telefono(String nombre, double precio, String codigoBarras, String marca) {
		super(nombre, precio, codigoBarras);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Marca: " + marca;
	}
}
