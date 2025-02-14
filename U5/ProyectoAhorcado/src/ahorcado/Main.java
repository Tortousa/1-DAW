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
<<<<<<< HEAD
        Scanner patata = new Scanner(System.in);
=======
        Scanner scanner = new Scanner(System.in);
>>>>>>> 2f36d60103bf0c8f04e700e3a9036396f5c9a587
        int opcion;

        do {
            System.out.println(MENU);
<<<<<<< HEAD
            opcion = pedirInt("Opcion nº: ", patata);

            switch (opcion) {
                case 1:
                    nuevoJuego(patata);
                    break;
                case 2:
                    try {
                        Ranking.mostrarRanking();
                    } catch (FileNotFoundException e) {
                        System.out.println("Error al mostrar el ranking: " + e.getMessage());
                    }
=======
            opcion = pedirInt("Opcion nº: ", scanner);

            switch (opcion) {
                case 1:
                    nuevoJuego(scanner);
                    break;
                case 2:
                    // Implementar la lógica para ver el ranking (se hará más adelante)
>>>>>>> 2f36d60103bf0c8f04e700e3a9036396f5c9a587
                    break;
                case 0:
                    System.out.println("\nHasta luego!");
                    break;
                default:
<<<<<<< HEAD
                    System.out.println("\nOpcion no valida, intenta de nuevo.");
            }
        } while (opcion != 0);

        patata.close();
    }

    private static void nuevoJuego(Scanner patata) {
        System.out.print("Ingrese su nombre: ");
        String nombreJugador = patata.nextLine();
        Jugador jugador = new Jugador(nombreJugador);

        System.out.println("Seleccione la dificultad:");
        System.out.println("1. Facil");
        System.out.println("2. Normal");
        System.out.println("3. Dificil");
        System.out.print("Ingrese el numero de la dificultad: ");
        int opcionDificultad = patata.nextInt();
        patata.nextLine();

        Dificultad dificultad = obtenerDificultad(opcionDificultad);

        String rutaArchivo = "./files/palabras.txt";
=======
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
>>>>>>> 2f36d60103bf0c8f04e700e3a9036396f5c9a587
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
<<<<<<< HEAD
                System.out.println("Dificultad no valida. Se asignará dificultad normal.");
=======
                System.out.println("Dificultad no válida. Se asignará dificultad normal.");
>>>>>>> 2f36d60103bf0c8f04e700e3a9036396f5c9a587
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

<<<<<<< HEAD
    public static int pedirInt(String enunciado, Scanner patata) {
=======
    public static int pedirInt(String enunciado, Scanner scanner) {
>>>>>>> 2f36d60103bf0c8f04e700e3a9036396f5c9a587
        int n = 0;
        boolean check = false;

        do {
            System.out.print(enunciado);
            try {
<<<<<<< HEAD
                n = Integer.parseInt(patata.nextLine().trim());
=======
                n = Integer.parseInt(scanner.nextLine().trim());
>>>>>>> 2f36d60103bf0c8f04e700e3a9036396f5c9a587
                check = true;
            } catch (Exception e) {
                System.out.println("Error: No has introducido un numero valido.");
            }
        } while (!check);
        return n;
    }
}