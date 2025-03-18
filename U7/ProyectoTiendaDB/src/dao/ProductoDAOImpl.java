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

	@Override
	public List<Producto> listarProductosPrecioMinimo(double precioMinimo) throws Exception {
		List<Producto> lista = new ArrayList<>();
		
		try(Connection con = DriverManager.getConnection(URL,USER,PASS)) {
			String sql = "SELECT p.nombre, p.precio, f.nombre AS fabricante "
					+ "FROM producto p "
					+ "INNER JOIN fabricante f ON p.id_fabricante = f.id "
					+ "WHERE p.precio >= ? "
					+ "ORDER BY p.precio ASC";
			
			try(PreparedStatement ps = con.prepareStatement(sql)) {
				ps.setDouble(1, precioMinimo);
				
				try(ResultSet rs = ps.executeQuery()){
					while(rs.next()) {
						Producto p = new Producto();
						p.setNombre(rs.getString("nombre"));
						p.setPrecio(rs.getDouble("precio"));
						p.setFabricante(rs.getString("fabricante"));
						
						lista.add(p);
					}
				}
			}
		}
		return lista;
	}

	@Override
	public List<Producto> listarProductosPorNombre(String texto) throws Exception {
		List<Producto> lista = new ArrayList<>();
		
		try(Connection con = DriverManager.getConnection(URL, USER, PASS)) {
			String sql = "SELECT p.nombre, p.precio, f.nombre AS fabricante "
					+ "FROM producto p "
					+ "INNER JOIN fabricante f ON p.id_fabricante = f.id "
					+ "WHERE"
					+ "ORDER BY ";
			
			try(PreparedStatement ps = con.prepareStatement(sql)) {
				ps.setString(1, texto);
				
				try(ResultSet rs = ps.executeQuery()){
					while(rs.next()) {
						Producto p = new Producto();
						p.setNombre(rs.getString("nombre"));
						p.setPrecio(rs.getDouble("precio"));
						p.setFabricante(rs.getString("fabricante"));
						
						lista.add(p);
					}
				}
			}
		}
		return lista;
	}
	
}
