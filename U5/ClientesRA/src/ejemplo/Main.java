package ejemplo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String rutaFichero = "./files/clientes.txt";

        try {
            String textoCliente = leerFichero(rutaFichero);
            Cliente[] arrayClientes = importarClientes(textoCliente);

            mostrarClientes(arrayClientes);
            mostrarClientesPremium(arrayClientes);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    private static void mostrarClientesPremium(Cliente[] arrayClientes) {
        List<Cliente> lista = Arrays.asList(arrayClientes);
        List<Cliente> premium = lista.stream()
                .filter(c -> "premium".equalsIgnoreCase(c.getTipoM()))
                .collect(Collectors.toList());

        System.out.println("\n===== Clientes Premium =====");
        for (Cliente c : premium) {
            System.out.println(c);
        }
    }

    private static void mostrarClientes(Cliente[] arrayClientes) {
        System.out.println("\n===== Mostrando Clientes =====");

        for (Cliente c : arrayClientes) {
            if (c == null) {
                continue;
            }
            boolean nifValido = validarFormatoNif(c.getNif());
            boolean fechaValida = validarFormatoFecha(c.getFechaAlta());

            System.out.println(c + " - NIF válido: " + nifValido + ", Fecha válida: " + fechaValida);
        }
    }

    private static boolean validarFormatoNif(String nif) {
        String regexNIF = "^[0-9]{8}[a-zA-Z]$";
        String regexNIE = "^[xXyYzZ][0-9]{7}[a-zA-Z]$";

        return nif.matches(regexNIE) || nif.matches(regexNIF);
    }

    private static boolean validarFormatoFecha(String fechaAlta) {
        String regexFecha = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        return fechaAlta.matches(regexFecha);
    }

    private static Cliente[] importarClientes(String textoCliente) {
        String[] clienteSeparados = textoCliente.split(";");
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        for (String clientesStr : clienteSeparados) {
            clientesStr = clientesStr.trim();
            if (clientesStr.isEmpty()) {
                continue;
            }

            String[] atributos = clientesStr.split(",,");
            if (atributos.length < 8) {
                continue;
            }

            String nombre = atributos[0].trim();
            String apellidos = atributos[1].trim();
            String nif = atributos[2].trim();
            String direccion = atributos[3].trim();
            String email = atributos[4].trim();
            String fechaAlta = atributos[5].trim();
            String tipoM = atributos[6].trim();
            int descuento = 0;

            try {
                descuento = Integer.parseInt(atributos[7].trim());
            } catch (NumberFormatException e) {
                descuento = 0;
            }

            Cliente nuevoCliente = new Cliente(nombre, apellidos, nif, direccion, email, fechaAlta, tipoM, descuento);
            listaClientes.add(nuevoCliente);
        }

        return listaClientes.toArray(new Cliente[0]);
    }

    private static String leerFichero(String rutaFichero) throws FileNotFoundException, IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaFichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                sb.append(linea).append("\n");
            }
        }
        return sb.toString();
    }
}