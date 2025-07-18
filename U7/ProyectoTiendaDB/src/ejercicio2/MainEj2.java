package ejercicio2;

import java.util.List;
import java.util.Scanner;

import dao.IProductoDAO;
import dao.ProductoDAOImpl;
import modelo.Producto;

public class MainEj2 {

	public static void main(String[] args) {
		IProductoDAO dao = new ProductoDAOImpl();
		
		Scanner patata = new Scanner(System.in);

		try {
			System.out.print("Intoduce el precio minimo: ");
			double precioMin = patata.nextDouble();
			
			List<Producto> productos = dao.listarProductosPrecioMinimo(precioMin);
			
			System.out.println("Mostramos los productos con precio mayor o igual a " + precioMin);
			for(Producto p : productos) {
				String nombre = p.getNombre();
				double precio = p.getPrecio();
				String fabricante = p.getFabricante();
				System.out.println("Nombre: " + nombre + "|Precio: " + precio + "|Fabricante: " + fabricante);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
