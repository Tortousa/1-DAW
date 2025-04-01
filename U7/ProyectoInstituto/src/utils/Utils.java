package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import modelo.Alumno;
import modelo.Modulo;
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
    
    public static List<Alumno> leerAlumnos(String rutaFichero) {
    	List<Alumno> lista = new ArrayList<>();
    	
    	try (BufferedReader br = new BufferedReader(new FileReader(rutaFichero))) {
    		String linea;
    		while ((linea = br.readLine()) != null) {
                String[] campo = linea.split("&");
                Alumno a = new Alumno(Integer.parseInt(campo[0]),
                									   campo[1], 
                									   campo[2], 
                									   campo[3], 
                									   campo[4], 
                									   campo[5],
                									   campo[6]);
                
                lista.add(a);
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
        return lista;
    }
    
    public static List<Modulo> leerModulos(String rutaFichero) throws IOException {
    	List<Modulo> lista = new ArrayList<>();
    	
    	try (BufferedReader br = new BufferedReader(new FileReader(rutaFichero))) {
    		String linea;
    		while ((linea = br.readLine()) != null) {
                String[] campo = linea.split("&");
                Modulo m = new Modulo();
                m.setId(Integer.parseInt(campo[0]));
                m.setNombreMod(campo[1]);
                m.setCurso(Integer.parseInt(campo[2]));
                m.setHora(Integer.parseInt(campo[3]));
                m.setProfesor(campo[4]);
                lista.add(m);
            }
        }
        return lista;
    }
}