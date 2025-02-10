package ahorcado;

import java.util.Date;
import java.util.Scanner;

public class Partida {
    private Jugador jugador;
    private Palabra palabra;
    private Dificultad dificultad;
    private int intentosRestantes;
    private boolean juegoTerminado;
    private Date fecha;
    private Scanner scanner;

    public Partida(Jugador jugador, Palabra palabra, Dificultad dificultad) {
        this.jugador = jugador;
        this.palabra = palabra;
        this.dificultad = dificultad;
        this.intentosRestantes = 5;
        this.juegoTerminado = false;
        this.fecha = new Date();
        this.scanner = new Scanner(System.in);
    }

    public void jugar() {
        while (!juegoTerminado && intentosRestantes > 0) {
            System.out.println("\nPalabra: " + palabra.mostrarEstado());
            Muñeco.dibujar(5 - intentosRestantes);
            System.out.println("Intentos restantes: " + intentosRestantes);

            System.out.print("Ingrese una letra (o 'adivinar' para intentar adivinar la palabra): ");
            String entrada = scanner.nextLine().toLowerCase();

            if (entrada.equals("adivinar")) {
                intentarAdivinarPalabra();
            } else if (entrada.length() == 1 && Character.isLetter(entrada.charAt(0))) {
                char letra = entrada.charAt(0);
                adivinarLetra(letra);
            } else {
                System.out.println("Entrada inválida. Ingrese una letra o 'adivinar'.");
            }

            if (palabra.esAdivinada()) {
                System.out.println("\n¡Felicidades, " + jugador.getNombre() + "! Has adivinado la palabra: " + palabra.mostrarEstado());
                juegoTerminado = true;
            } else if (intentosRestantes == 0) {
                System.out.println("\n¡Lo siento, " + jugador.getNombre() + "! Te has quedado sin intentos. La palabra era: " + palabra.getPalabra());
                juegoTerminado = true;
            }
        }

        Muñeco.dibujar(5 - intentosRestantes);

        if (palabra.esAdivinada()) {
            System.out.println("\n¡Felicidades, " + jugador.getNombre() + "! Has adivinado la palabra: " + palabra.mostrarEstado());
        } else {
            System.out.println("\n¡Lo siento, " + jugador.getNombre() + "! Te has quedado sin intentos. La palabra era: " + palabra.getPalabra());
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
        String palabraIntento = scanner.nextLine().toLowerCase();
        if (palabra.getPalabra().equals(palabraIntento)) {
            palabra.completar();
            System.out.println("¡Correcto!");
        } else {
            System.out.println("¡Incorrecto!");
        }
    }

    public void guardarResultado() {
        
    }
}