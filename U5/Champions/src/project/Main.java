package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rutaFichero = "Futbolista.txt";

        System.out.println("Champions League");
        System.out.print("Pulsa Enter para analizar el fichero: ");
        sc.nextLine();

        try {
            String textoFutbolistas = leerFichero(rutaFichero);
            Futbolista[] arrayFutbolista = importarFutbolistas(textoFutbolistas);

            mostrarFutbolista(arrayFutbolista);
            mostrarTitulares(arrayFutbolista);
            mostrarOrdenadosPorGoles(arrayFutbolista);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    private static String leerFichero(String rutaFichero) throws IOException {
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaFichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                sb.append(linea).append("\n");
            }
        }
        return sb.toString();
    }

    public static Futbolista[] importarFutbolistas(String texto) {
        String[] registros = texto.split(";");
        ArrayList<Futbolista> lista = new ArrayList<>();

        for (String reg : registros) {
            reg = reg.trim();
            if (reg.isEmpty()) continue;

            String[] campos = reg.split(",,");
            if (campos.length < 8) continue;

            String nombre = campos[0].trim();
            String apellidos = campos[1].trim();
            String identificador = campos[2].trim();
            String direccion = campos[3].trim();
            String email = campos[4].trim();
            String fechaAlta = campos[5].trim();
            String tipo = campos[6].trim();
            int goles = 0;

            try {
                goles = Integer.parseInt(campos[7].trim());
            } catch (NumberFormatException e) {
                goles = 0;
            }

            lista.add(new Futbolista(nombre, apellidos, identificador, direccion, email, fechaAlta, tipo, goles));
        }
        return lista.toArray(new Futbolista[0]);
    }

	public static void mostrarFutbolista(Futbolista[] arrayFutbolista) {
		System.out.println("Futbolistas");
	
		for (Futbolista f : arrayFutbolista) {
			if (f == null) {
				continue;
			}
	
			boolean idValido = validarIdentificador(f.getIdentificador());
			boolean fechaValida = validarFecha(f.getFechaAlta());
	
			System.out.println("Nombre: " + f.getNombre() + " " + f.getApellidos());
			System.out.println("Identificador: " + f.getIdentificador() + " (" + (idValido ? "Válido" : "Inválido") + ")");
			System.out.println("Dirección: " + f.getDireccion());
			System.out.println("Email: " + f.getEmail());
			System.out.println("Fecha de Alta: " + f.getFechaAlta() + " (" + (fechaValida ? "Válida" : "Inválida") + ")");
			System.out.println("Tipo: " + f.getTipo());
			System.out.println("Goles: " + f.getGoles());
			System.out.println("--------------------------");
		}
	}	

	private static void mostrarTitulares(Futbolista[] arrayFutbolista) {
		List<Futbolista> lista = Arrays.asList(arrayFutbolista);
	
		List<Futbolista> titularesFutbolistas = lista.stream()
				.filter(f -> "titular".equalsIgnoreCase(f.getTipo()))
				.collect(Collectors.toList());
	
		System.out.println("\nTitulares:");
		for (Futbolista f : titularesFutbolistas) {
			System.out.println(f);
		}
	}

	private static void mostrarOrdenadosPorGoles(Futbolista[] arrayFutbolista){
		ArrayList<Futbolista> listaF = new ArrayList<>();

		for(Futbolista f : arrayFutbolista) {
			listaF.add(f);
		}

		Collections.sort(listaF, new Comparator<Futbolista>() {
			public int compare(Futbolista o1, Futbolista o2) {
				return Integer.compare(o2.getGoles(), o1.getGoles());
			}
		});

		Iterator<Futbolista> it = listaF.iterator();
		while (it.hasNext()) {
			Futbolista f = it.next();
			f.toString();
		}
	}

	public static boolean validarFecha(String fechaAlta) {
        String regexFecha = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        return fechaAlta.matches(regexFecha);
    }

	public static boolean validarIdentificador(String id) {
        String regexNIF = "^[0-9]{8}[a-zA-Z]$";
        String regexNIE = "^[xXyYzZ][0-9]{7}[a-zA-Z]$";

        return id.matches(regexNIE) || id.matches(regexNIF);
    }
}
