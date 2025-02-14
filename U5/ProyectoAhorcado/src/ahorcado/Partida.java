package ahorcado;

import java.util.Date;
<<<<<<< HEAD
import java.util.HashSet;
import java.util.Set;
=======
>>>>>>> 2f36d60103bf0c8f04e700e3a9036396f5c9a587
import java.util.Scanner;

public class Partida {
    private Jugador jugador;
    private Palabra palabra;
    private Dificultad dificultad;
    private int intentosRestantes;
    private boolean juegoTerminado;
    private Date fecha;
<<<<<<< HEAD
    private Scanner patata;
    private Set<Character> letrasIngresadas;
=======
    private Scanner scanner;
>>>>>>> 2f36d60103bf0c8f04e700e3a9036396f5c9a587

    public Partida(Jugador jugador, Palabra palabra, Dificultad dificultad) {
        this.jugador = jugador;
        this.palabra = palabra;
        this.dificultad = dificultad;
        this.intentosRestantes = 5;
        this.juegoTerminado = false;
        this.fecha = new Date();
<<<<<<< HEAD
        this.patata = new Scanner(System.in);
        this.letrasIngresadas = new HashSet<>();
=======
        this.scanner = new Scanner(System.in);
>>>>>>> 2f36d60103bf0c8f04e700e3a9036396f5c9a587
    }

    public void jugar() {
        while (!juegoTerminado && intentosRestantes > 0) {
            System.out.println("\nPalabra: " + palabra.mostrarEstado());
            Muñeco.dibujar(5 - intentosRestantes);
            System.out.println("Intentos restantes: " + intentosRestantes);

            System.out.print("Ingrese una letra (o 'adivinar' para intentar adivinar la palabra): ");
<<<<<<< HEAD
            String entrada = patata.nextLine().toLowerCase();
=======
            String entrada = scanner.nextLine().toLowerCase();
>>>>>>> 2f36d60103bf0c8f04e700e3a9036396f5c9a587

            if (entrada.equals("adivinar")) {
                intentarAdivinarPalabra();
            } else if (entrada.length() == 1 && Character.isLetter(entrada.charAt(0))) {
                char letra = entrada.charAt(0);
<<<<<<< HEAD
                if (letrasIngresadas.contains(letra)) {
                    System.out.println("Ya has ingresado esa letra.");
                } else {
                    letrasIngresadas.add(letra);
                    adivinarLetra(letra);
                }
            } else {
                System.out.println("Entrada invalida. Ingrese una letra o 'adivinar'.");
            }

            if (palabra.esAdivinada()) {
                System.out.println("\n¡Felicidades, " + jugador.getNombre() + "! Has adivinado la palabra: "
                        + palabra.mostrarEstado());
                juegoTerminado = true;
            } else if (intentosRestantes == 0) {
                System.out.println("\n¡Lo siento, " + jugador.getNombre()
                        + "! Te has quedado sin intentos. La palabra era: " + palabra.getPalabra());
=======
                adivinarLetra(letra);
            } else {
                System.out.println("Entrada inválida. Ingrese una letra o 'adivinar'.");
            }

            if (palabra.esAdivinada()) {
                System.out.println("\n¡Felicidades, " + jugador.getNombre() + "! Has adivinado la palabra: " + palabra.mostrarEstado());
                juegoTerminado = true;
            } else if (intentosRestantes == 0) {
                System.out.println("\n¡Lo siento, " + jugador.getNombre() + "! Te has quedado sin intentos. La palabra era: " + palabra.getPalabra());
>>>>>>> 2f36d60103bf0c8f04e700e3a9036396f5c9a587
                juegoTerminado = true;
            }
        }

        Muñeco.dibujar(5 - intentosRestantes);

        if (palabra.esAdivinada()) {
<<<<<<< HEAD
            System.out.println("\n¡Felicidades, " + jugador.getNombre() + "! Has adivinado la palabra: "
                    + palabra.mostrarEstado());
        } else {
            System.out.println("\n¡Lo siento, " + jugador.getNombre()
                    + "! Te has quedado sin intentos. La palabra era: " + palabra.getPalabra());
=======
            System.out.println("\n¡Felicidades, " + jugador.getNombre() + "! Has adivinado la palabra: " + palabra.mostrarEstado());
        } else {
            System.out.println("\n¡Lo siento, " + jugador.getNombre() + "! Te has quedado sin intentos. La palabra era: " + palabra.getPalabra());
>>>>>>> 2f36d60103bf0c8f04e700e3a9036396f5c9a587
        }

        guardarResultado();
    }

    public void adivinarLetra(char letra) {
        if (palabra.actualizarEstado(letra)) {
            System.out.println("¡Letra correcta!");
        } else {
            intentosRestantes--;
            System.out.println("Letra incorrecta.");
        }
    }

    public void intentarAdivinarPalabra() {
        intentosRestantes--;
        System.out.print("Ingrese la palabra completa: ");
<<<<<<< HEAD
        String palabraIntento = patata.nextLine().toLowerCase();
=======
        String palabraIntento = scanner.nextLine().toLowerCase();
>>>>>>> 2f36d60103bf0c8f04e700e3a9036396f5c9a587
        if (palabra.getPalabra().equals(palabraIntento)) {
            palabra.completar();
            System.out.println("¡Correcto!");
        } else {
            System.out.println("¡Incorrecto!");
        }
    }

    public void guardarResultado() {
<<<<<<< HEAD
        int fallos = 5 - intentosRestantes;
        if (palabra.esAdivinada() && intentosRestantes == 5) {
            fallos = 0;
        }

        Ranking.guardarPartida(jugador.getNombre(), intentosRestantes, dificultad, palabra.mostrarEstado(), fallos);
    }

    public Jugador getJugador() {
        return jugador;
    }

    public Palabra getPalabra() {
        return palabra;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public int getIntentosRestantes() {
        return intentosRestantes;
    }

    public Date getFecha() {
        return fecha;
=======
        
>>>>>>> 2f36d60103bf0c8f04e700e3a9036396f5c9a587
    }
}