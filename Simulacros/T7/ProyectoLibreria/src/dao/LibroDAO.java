package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import modelo.Libro;

public class LibroDAO {
	public void insertarLibro(Libro libro) throws SQLException {
		String sql = "INSERT INTO libros (titulo, autor, precio) VALUES (?, ?, ?)";
		
		try(Connection con = Conexion.getConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, libro.getTitulo());
			ps.setString(2, libro.getAutor());
			ps.setDouble(3, libro.getPrecio());
			ps.executeUpdate();
		}
	}
	
	public List<Libro> leerLibros() throws SQLException {
		List<Libro> lista = new ArrayList<>();
		String sql = "SELECT id, titulo, autor, precio FROM libros";
		
		try(Connection con = Conexion.getConnection();
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			while(rs.next()) {
				Libro libro = new Libro();
				libro.setId(rs.getInt("id"));
				libro.setTitulo(rs.getString("titulo"));
				libro.setAutor(rs.getString("autor"));
				libro.setPrecio(rs.getDouble("precio"));
				lista.add(libro);
			}
		}
	}
}
