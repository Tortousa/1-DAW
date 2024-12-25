/*
 * Escribe un método que se llame ordenarBaraja() que recibe un vector de enteros para ordenarlos por el método de la baraja.
 * Devuelve 1 si ha ordenado, 0 si ya estaba ordenado y un valor negativo si no se ha podido ordenar.
 */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int[] array = new int[6];

        array = pedirIntArray(array);

        System.out.print("Array inicial: ");
        mostrarArray(array);

        int resultado = ordenarBaraja(array);

        System.out.print("Array ordenado: ");
        mostrarArray(array);

        System.out.println("Resultado del metodo: " + resultado);
    }

    public static int ordenarBaraja(int[] array) {
        boolean check = true;
        int aux, pos;

        if (array == null || array.length == 0) {
            return -1;
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                check = false;
            }

            pos = i;
            aux = array[i];

            while (pos > 0 && array[pos - 1] > aux) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = aux;
        }

        if (check) {
            return 0;
        }
        return 1;
    }

    public static int[] pedirIntArray(int[] array) {
        Scanner patata = new Scanner(System.in);

        for(int i = 0; i < array.length;){
            System.out.print((i + 1) + ". Numero: ");

            try{
                array[i] = Integer.parseInt(patata.nextLine().trim());
                i++;
            }catch(Exception e) {
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
