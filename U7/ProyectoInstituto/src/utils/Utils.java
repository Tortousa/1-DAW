package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;

public class Utils {
    public static List<Usuario> leerUsuarios(String rutaFichero) {
        List<Usuario> usuarios = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaFichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("&");
                if (datos.length == 6) { // Verificamos que haya 6 datos por línea
                    String nombre = datos[0].trim();
                    String apellidos = datos[1].trim();
                    String dni = datos[2].trim();
                    String email = datos[3].trim();
                    String direccion = datos[4].trim();
                    String telefono = datos[5].trim();
                    
                    usuarios.add(new Usuario(nombre, apellidos, dni, email, direccion, telefono));
                } else {
                    System.out.println("Error en la línea: " + linea);
                }
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
        return usuarios;
    }
}