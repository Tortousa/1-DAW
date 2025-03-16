package ejercicio1y2;

public class Electrodomestico extends Producto{
	private String eficienciaEn;
	
	public Electrodomestico(String nombre, double precio, String codigoBarras, String eficienciaEn) {
		super(nombre, precio, codigoBarras);
		this.eficienciaEn = eficienciaEn;
	}

	public String getEficienciaEn() {
		return eficienciaEn;
	}

	public void setEficienciaEn(String eficienciaEn) {
		this.eficienciaEn = eficienciaEn;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Eficiencia: " + eficienciaEn;
	 }
}
