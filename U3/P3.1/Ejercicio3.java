/*
 * Escribe un método que se llame contarIntConsecutivos() que recibe un vector de enteros.
 * Devuelve cuantos valores -entre sus elementos- están ordenados.
 * Si todos los elementos son diferentes devuelve 0.
 * Por ejemplo: {3, 5, 3, 4, 5, 5, 4} devolvería 3.
 * Recorriendo los datos de izquierda a derecha, empezando por el segundo elemento hay que comprobar si es secuencia del anterior.
 * Se puede utilizar un contador iniciado en 1 que se incrementa al comprobarse que un elemento es consecutivo -en orden- con el anterior.
 * Cada vez que se inicia nueva secuencia hay que guardar el valor del contador en una variable auxiliar con el máximo alcanzado.
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static Scanner patata = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = pedirIntArray();

        for (int i : array) {
            System.out.print("[" + i + "]");
        }

        int resultado = contarIntConsecutivos(array);

        System.out.println("\nMaximos consecutivos: " + resultado);
    }

    public static int contarIntConsecutivos(int[] array) {
        int consecutivo = 1, max = 1;

        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array no puede ser nulo o estar vacio.");
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1] + 1) {
                consecutivo++;

                if (consecutivo > max) {
                    max = consecutivo;
                }
            } else {
                consecutivo = 1;
            }
        }
        return max > 1 ? max : 0;
    }

    public static int[] pedirIntArray() {
        int[] array = new int[6];

        for (int i = 0; i < array.length;) {
            System.out.print((i + 1) + ". Numero: ");

            try {
                array[i] = Integer.parseInt(patata.nextLine().trim());
                i++;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return array;
    }
}