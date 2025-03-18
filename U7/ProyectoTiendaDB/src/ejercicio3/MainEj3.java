package ejercicio3;

import java.util.List;
import java.util.Scanner;

import dao.IProductoDAO;
import dao.ProductoDAOImpl;
import modelo.Producto;

public class MainEj3 {

	public static void main(String[] args) {
		IProductoDAO dao = new ProductoDAOImpl();
		
		Scanner patata = new Scanner(System.in);

		try {
			System.out.print("Intoduce el precio minimo: ");
			String buscarNombre = patata.nextLine();
			
			List<Producto> productos = dao.listarProductosPorNombre(buscarNombre);
			
			System.out.println("Mostramos los productos con que contengan " + buscarNombre + " en su nombre");
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

