package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import modelo.Libro;

public class Utils {
	public List<Libro> leerFichero(String ruta) {
		List<Libro> lista = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(ruta))) {
			String linea;
			while((linea = br.readLine()) != null) {
				String[] partes = linea.split("&");
				if(partes.length == 3) {
					String titulo = partes[0];
					String autor = partes[1];
					double precio = Double.parseDouble(partes[2]);
					Libro libro = new Libro(titulo, autor, precio);
					lista.add(libro);
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		return lista;
	}
}
