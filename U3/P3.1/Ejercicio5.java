/*
 * Escribe un método que se llame masFrecuenteInt() que recibe un vector de enteros.
 * Devuelve el valor del elemento más frecuente, si hay coincidencia devolvería el primero de ellos.
 * Por ejemplo: {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3} devolvería 4.
 * Una forma sería recorrer el vector anidar un bucle que averigüe la frecuencia del valor de cada elemento, utilizando un par de variables auxiliares para retener la frecuencia máxima y el valor asociado.
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static Scanner patata = new Scanner(System.in);

    public static void main(String[] args) {
        int resultado;
        int[] array = new int[8];

        array = pedirIntArray(array);

        mostrarArray(array);

        resultado = masFrecuenteInt(array);

        System.out.println("Numero mas frecuente: " + resultado);
    }

    public static int masFrecuenteInt(int[] array) {
        int frecuenciaMax = 0, masFrecuente = array[0], frecuenciaActual;

        for (int i = 0; i < array.length; i++) {
            frecuenciaActual = 0;

            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    frecuenciaActual++;
                }
            }
            if (frecuenciaActual > frecuenciaMax) {
                frecuenciaMax = frecuenciaActual;
                masFrecuente = array[i];
            }
        }
        return masFrecuente;
    }

    public static int[] pedirIntArray(int[] array) {
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

    public static void mostrarArray(int[] array) {
        for (int i : array) {
            System.out.print("[" + i + "]");
        }
        System.out.println();
    }
}