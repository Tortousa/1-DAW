package ahorcado;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final String MENU = """
            \n1 - Nuevo juego
            2 - Ver ranking
            0 - Finalizar
            """;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println(MENU);
            opcion = pedirInt("Opcion nº: ", scanner);

            switch (opcion) {
                case 1:
                    nuevoJuego(scanner);
                    break;
                case 2:
                    // Implementar la lógica para ver el ranking (se hará más adelante)
                    break;
                case 0:
                    System.out.println("\nHasta luego!");
                    break;
                default:
                    System.out.println("\nOpción no valida, intenta de nuevo.");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void nuevoJuego(Scanner scanner) {
        System.out.print("Ingrese su nombre: ");
        String nombreJugador = scanner.nextLine();
        Jugador jugador = new Jugador(nombreJugador);

        System.out.println("Seleccione la dificultad:");
        System.out.println("1. Fácil");
        System.out.println("2. Normal");
        System.out.println("3. Difícil");
        System.out.print("Ingrese el número de la dificultad: ");
        int opcionDificultad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Dificultad dificultad = obtenerDificultad(opcionDificultad);

        String rutaArchivo = "./files/palabras.txt"; // Ruta relativa
        ArrayList<String> palabras = cargarPalabrasDesdeArchivo(rutaArchivo);

        String palabraSeleccionada = seleccionarPalabraAlAzar(palabras, dificultad);
        Palabra palabra = new Palabra(palabraSeleccionada);

        Partida partida = new Partida(jugador, palabra, dificultad);
        partida.jugar();
    }

    private static Dificultad obtenerDificultad(int opcion) {
        switch (opcion) {
            case 1:
                return Dificultad.FACIL;
            case 2:
                return Dificultad.NORMAL;
            case 3:
                return Dificultad.DIFICIL;
            default:
                System.out.println("Dificultad no válida. Se asignará dificultad normal.");
                return Dificultad.NORMAL;
        }
    }

    public static ArrayList<String> cargarPalabrasDesdeArchivo(String rutaArchivo) {
        ArrayList<String> palabrasFuncion = new ArrayList<>();
        File archivo = new File(rutaArchivo);

        try (Scanner lector = new Scanner(archivo)) {
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                palabrasFuncion.add(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: No se encontró el archivo en " + rutaArchivo);
        }
        return palabrasFuncion;
    }

    private static String seleccionarPalabraAlAzar(List<String> palabras, Dificultad dificultad) {
        List<String> palabrasFiltradas = new ArrayList<>();
        for (String palabra : palabras) {
            if (Dificultad.determinarDificultad(palabra) == dificultad) {
                palabrasFiltradas.add(palabra);
            }
        }

        if (palabrasFiltradas.isEmpty()) {
            throw new IllegalArgumentException("No hay palabras para la dificultad seleccionada.");
        }

        Random random = new Random();
        int indiceAleatorio = random.nextInt(palabrasFiltradas.size());
        return palabrasFiltradas.get(indiceAleatorio);
    }

    public static int pedirInt(String enunciado, Scanner scanner) {
        int n = 0;
        boolean check = false;

        do {
            System.out.print(enunciado);
            try {
                n = Integer.parseInt(scanner.nextLine().trim());
                check = true;
            } catch (Exception e) {
                System.out.println("Error: No has introducido un numero valido.");
            }
        } while (!check);
        return n;
    }
}