/*
 * Escribe un método que se llame yaOrdenadoInt() que recibe un vector de enteros. Devuelve true si está ordenado.
 * Por ejemplo: {3, 2, 3, 4, 7, 2, 4} devolvería false.
 * Hay que recorrer el vector secuencialmente comprobando por parejas y si se encuentra un par de elementos desordenados hay que terminar sin llegar al final del recorrido.
 */

import java.util.Scanner;

public class Ejercicio6 {
    public static Scanner patata = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[4];

        array = pedirIntArray(array);

        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Error, array nulo o menor a 2 numeros.");
        } else {
            mostrarArray(array);
            System.out.println("Orden: " + yaOrdenadoInt(array));
        }
    }

    public static boolean yaOrdenadoInt(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1] - 1) {
                return false;
            }
        }
        return true;
    }

    public static int[] pedirIntArray(int[] array) {
        for (int i = 0; i < array.length;) {
            System.out.print((i + 1) + ". Numero: ");

            try {
                array[i] = Integer.parseInt(patata.nextLine().trim());
                i++;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return array;
    }

    public static void mostrarArray(int[] array) {
        for (int i : array) {
            System.out.print("[" + i + "]");
        }
        System.out.println();
    }
}