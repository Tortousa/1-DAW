package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import modelo.Producto;

public class ProductoDAOImpl implements IProductoDAO{
	//Ajustar la URL a la ip/host del equipo que aloja la BD 
	private static final String URL = "jdbc:mysql://172.16.16.98:3306/tienda?serverTimezone=UTC";
	private static final String USER = "tienda";
	private static final String PASS = "tienda";
	
	//Cargar el driver
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Producto> listarProductosConPrecio() throws Exception {
		List<Producto> lista = new ArrayList<>();
		
		try(Connection con = DriverManager.getConnection(URL,USER,PASS)) {
			String sql = "SELECT nombre AS nombre, "
					+ "precio AS euros, "
					+ "(precio * 1.08) AS dolares, "
					+ "'' AS fabricante FROM producto";
			
			try(PreparedStatement ps = con.prepareStatement(sql)) {
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					Producto p = new Producto();
					String nombre = rs.getString("nombre");
					double euros = rs.getDouble("euros");
					double dolares = rs.getDouble("dolares");
					
					p.setNombre(nombre);
					p.setPrecio(euros);
					
					lista.add(p);
				}
			}
		}
		return lista;
	}
	
	public List<Producto> listarProductosMinimo() throws Exception {
		List<Producto> lista = new ArrayList<>();
		
		try(Connection con = DriverManager.getConnection(URL,USER,PASS)) {
			String sql = "SELECT nombre, "
					+ "precio AS euros, "
					+ "(precio * 1.08) AS dolares, "
					+ "'' AS fabricante FROM producto"
					+ "ORDER BY precio ASC LIMIT 1;";
			
			try(PreparedStatement ps = con.prepareStatement(sql)) {
				ResultSet rs = ps.executeQuery();
				
				while(rs.next()) {
					Producto p = new Producto();
					String nombre = rs.getString("nombre");
					double euros = rs.getDouble("euros");
					double dolares = rs.getDouble("dolares");
					
					p.setNombre(nombre);
					p.setPrecio(euros);
					
					lista.add(p);
				}
			}
		}
		return lista;
	}
	
}
