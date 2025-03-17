package ejercicio2;

import java.util.List;

import dao.IProductoDAO;
import dao.ProductoDAOImpl;
import modelo.Producto;

public class MainEj2 {

	public static void main(String[] args) {
		IProductoDAO dao = new ProductoDAOImpl();

		try {
			List<Producto> productos = dao.listarProductosConPrecio();
			
			System.out.println("Mostramos los resultados");
			for(Producto p : productos) {
				double euros = p.getPrecio();
				double dolares = euros*1.08;
				dolares = Math.round(dolares * 100) / 100d;
				System.out.println("Nombre: " + p.getNombre() + "|Euros: " + euros + "|Dolares: " + dolares);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
