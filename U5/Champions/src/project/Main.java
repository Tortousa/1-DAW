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
        Scanner patata = new Scanner(System.in);
        String rutaFichero = "Futbolista.txt";

        System.out.print("Pulsa ENTER para analizar el fichero: ");
        patata.nextLine();

        try{
            String texto = leerFichero(rutaFichero);
            Futbolista[] arrayFut = importarFut(texto);

            mostrarDatos(arrayFut);
            mostrarTitular(arrayFut);
            mostrarOrdenGoles(arrayFut);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        patata.close();
    }

    private static String leerFichero(String rutaFichero) throws IOException {
        StringBuilder sb = new StringBuilder();

        try(BufferedReader br = new BufferedReader(new FileReader(rutaFichero))) {
            String linea;
            while((linea = br.readLine()) != null) {
                sb.append(linea).append("\n");
            }
        }
        return sb.toString();
    }

    private static Futbolista[] importarFut(String texto) {
        String[] registros = texto.split(";");
        ArrayList<Futbolista> lista = new ArrayList<>();

        for(String reg : registros) {
            reg = reg.trim();
            if(reg.isEmpty()) {
                continue;
            }

            String[] campo = reg.split(",,");
            if(campo.length < 8) {
                continue;
            }

            String nombre = campo[0].trim();
            String apellidos = campo[1].trim();
            String id = campo[2].trim();
            String direccion = campo[3].trim();
            String email = campo[4].trim();
            String fechaAlta = campo[5].trim();
            String tipo = campo[6].trim();
            int goles = 0;

            try {
                goles = Integer.parseInt(campo[7].trim());
            } catch (NumberFormatException e) {
                goles = 0;
            }

            lista.add(new Futbolista(nombre, apellidos, id, direccion, email, fechaAlta, tipo, goles));
        }
        return lista.toArray(new Futbolista[0]);
    }

    private static void mostrarDatos(Futbolista[] arrayFut) {
        System.out.println("Datos de Futbolistas\n--------------------------");

        for(Futbolista f : arrayFut) {
            if(f == null) {
                continue;
            }

            boolean idValido = validarId(f.getId());
            boolean fechaValida = validarFecha(f.getFechaAlta());

            System.out.println("Nombre: " + f.getNombre() + " " + f.getApellidos());
			System.out.println("Id: " + f.getId() + " (" + (idValido ? "Válido" : "Inválido") + ")");
			System.out.println("Dirección: " + f.getDireccion());
			System.out.println("Email: " + f.getEmail());
			System.out.println("Fecha de Alta: " + f.getFechaAlta() + " (" + (fechaValida ? "Válida" : "Inválida") + ")");
			System.out.println("Tipo: " + f.getTipo());
			System.out.println("Goles: " + f.getGoles());
			System.out.println("--------------------------");
        }
    }

    private static void mostrarTitular(Futbolista[] arrayFut) {
        List<Futbolista> lista = Arrays.asList(arrayFut);

        List<Futbolista> titular = lista.stream()
                .filter(f->"titular".equalsIgnoreCase(f.getTipo()))
                .collect(Collectors.toList());

        System.out.println("Titulares\n--------------------------");
        for(Futbolista f : titular) {
            System.out.println(f.toString());
        }
        System.out.println("--------------------------");
    }

    private static void mostrarOrdenGoles(Futbolista[] arrayFut) {
        ArrayList<Futbolista> listaF = new ArrayList<>();

        for(Futbolista f : arrayFut) {
            listaF.add(f);
        }

        Collections.sort(listaF, new Comparator<Futbolista>() {
            public int compare(Futbolista o1, Futbolista o2) {
                return Integer.compare(o2.getGoles(), o1.getGoles());
            }
        });

        Iterator<Futbolista> it = listaF.iterator();

        System.out.println("Maximos goleadores\n--------------------------");
        while(it.hasNext()) {
            Futbolista f = it.next();
            System.out.println(f.toStringGoles());
            
        }
    }

    private static boolean validarFecha(String fechaAlta) {
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        return fechaAlta.matches(regex);
    }

    private static boolean validarId(String id) {
        String regexNIF = "^[0-9]{8}[a-zA-Z]$";
        String regexNIE = "^[xXyYzZ][0-9]{7}[a-zA-Z]$";

        return id.matches(regexNIE) || id.matches(regexNIF);
    }
}