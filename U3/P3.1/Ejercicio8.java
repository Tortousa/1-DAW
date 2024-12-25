/*
 * Escribe un método que se llame buscarNumero() que recibe un vector ordenado de enteros y un valor.
 * Devuelve el índice de la posición de ese valor dentro del array recibido utilizando una búsqueda binaria.
 */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15};

        mostrarArray(array);

        int n = pedirInt("Inserta un numero a buscar: ");

        int resultado = buscarNumero(array, n);

        if (resultado != -1) {
            System.out.println("El elemento " + n + " se encuentra en el indice " + resultado);
        } else {
            System.out.println("El elemento " + n + " no está en el array.");
        }
    }

    public static int buscarNumero(int[] array, int n) {
        int limiteInf = 0;
        int limiteSup = array.length - 1;

        while (limiteInf <= limiteSup) {
            int media = (limiteInf + limiteSup) / 2;

            if (array[media] == n) {
                return media;
            } else if (array[media] < n) {
                limiteInf = media + 1;
            } else {
                limiteSup = media - 1;
            }
        }
        return -1;
    }

    public static int pedirInt(String enunciado) {
        Scanner patata = new Scanner(System.in);
        int n = 0;
        boolean check = false;

        do{
            System.out.print(enunciado);
            try{
                n = Integer.parseInt(patata.nextLine().trim());
                check = true;
            }catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }while(!check);
        return n;
    }

    public static void mostrarArray(int[] array) {
        for(int i : array) {
            System.out.print("[" + i + "]");
        }
        System.out.println();
    }
}

