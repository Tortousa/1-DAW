import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int valor;

        int[] array = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        valor = pedirInt("Introduce un valor a buscar: ");

        int indice = buscarBinariaRec(array, valor);

        if (indice != -1) {
            System.out.println("El valor " + valor + " se encuentra en la posición " + indice + " del array.");
        } else {
            System.out.println("El valor " + valor + " no se encuentra en el array.");
        }
    }

    public static int buscarBinariaRec(int[] array, int valor) {
        return buscarBinariaRec(array, valor, 0, array.length - 1);
    }

    public static int buscarBinariaRec(int[] array, int valor, int inicio, int fin) {
        if (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (array[medio] == valor) {
                return medio;
            } else if (array[medio] < valor) {
                return buscarBinariaRec(array, valor, medio + 1, fin);
            } else {
                return buscarBinariaRec(array, valor, inicio, medio - 1);
            }
        }
        return -1;
    }

    public static int pedirInt(String enunciado) {
        Scanner patata = new Scanner(System.in);
        int numero = 0;
        boolean check = true;

        do {
            System.out.print(enunciado);

            try {
                numero = Integer.parseInt(patata.nextLine().trim());
                check = true;
            } catch (Exception e) {
                System.out.println("Error: inserte un número.");
                check = false;
            }

        } while (!check);

        return numero;
    }
}

