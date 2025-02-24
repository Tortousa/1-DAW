package project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
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

		System.out.println("Pulsa Enter para analizar el fichero: ");
		sc.nextLine();

		try{
			String textoFutbolistas = leerFichero(rutaFichero);

			Futbolista[] arrayFutbolista = importarFutbolistas(textoFutbolistas);

			mostrarFutbolsita(arrayFutbolista);

			mostrarTitulares(arrayFutbolista);

			mostrarOrdenadorsPorGoles(arrayFutbolista);

		}catch (IOException e) {
				System.out.println("ERROR");
		}
	}
			
	private static String leerFichero(String rutaFichero) throws FileNotFoundException, IOException{
		StringBuilder sb = new StringBuilder();

		try(BufferedReader br = new BufferedReader(new FileReader(rutaFichero))) {
			String linea;
			while((linea = br.readLine()) != null) {
				sb.append(linea).append("\n");
			}
		}
		return sb.toString();
	}

	public static Futbolista[] importarFutbolistas(String texto) {
		String[] registros = texto.split(";");

		ArrayList<Futbolista> lista = new ArrayList();

		Futbolista[] arrayFutbolista = new Futbolista[lista.size()];

		for(String reg: registros) {
			reg.trim();

			if(reg.isEmpty()) {
				continue;
			}

			String[] campos = reg.split(",,");

			if(campos.length < 8) {
				continue;
			}

			String nombre = campos[0].trim();
            String apellidos = campos[1].trim();
            String identificador = campos[2].trim();
            String direccion = campos[3].trim();
            String email = campos[4].trim();
            String fechaAlta = campos[5].trim();
            String tipo = campos[6].trim();
            int goles = 0;

			try{
				goles = Integer.parseInt(campos[7].trim());
			}catch(NumberFormatException e) {
				goles = 0;
			}

			Futbolista f = new Futbolista(nombre, apellidos, identificador, direccion, email, fechaAlta, tipo, goles);

			lista.add(f);

			for(int i = 0; i < lista.size(); i++) {
				arrayFutbolista[i] = lista.get(i);
			}
		}
		return arrayFutbolista;
	}

	public static void mostrarFutbolsita(Futbolista[] arrayFutbolista) {
		System.out.println("Futbolistas");

		for(Futbolista f : arrayFutbolista) {
			if(f == null) {
				continue;
			}
			
			//boolean idValido = validarIndentificador(f.getIdentificador());
			//boolean fechaValida = validarFecha(f.getFechaAlta());

			
		}
	}

	private static void mostrarTitulares(Futbolista[] arrayFutbolista) {
		List<Futbolista> lista = Arrays.asList(arrayFutbolista);

		List<Futbolista> titularesFutbolistas = lista.stream()
				.filter(Object::null)
				.filter(f->"titulas".equalsIgnoreCase(f.getTipo()))
				.collect(Collectors.toList());
		
		for(Futbolista f : titularesFutbolistas) {

		}
	}

	private static void mostrarOrdenadorsPorGoles(Futbolista[] arrayFutbolista){
		ArrayList<Futbolista> listaF = new ArrayList<>();

		for(Futbolista f : arrayFutbolista) {
			listaF.add(f);
		}

		Collections.sort(listaF, new Comparator<Futbolista>() {
			public int compare(Futbolista o1, Futbolista o2) {
				return Integer.compare(o1.getGoles(), o2.getGoles());
			}
		});

		Iterator<Futbolista> it = listaF.iterator();
		while (it.hasNext()) {
			Futbolista f = it.next();
			f.toString();
		}

		
	}
}
