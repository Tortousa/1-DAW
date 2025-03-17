package dao;

import java.util.List;

import modelo.Producto;

public interface IProductoDAO {
	//Ej 1
	List<Producto> listarProductosConPrecio() throws Exception;
	
	// Ej 2
	List<Producto> listarProductosPrecioMinimo(double precioMinimo) throws Exception;
}
