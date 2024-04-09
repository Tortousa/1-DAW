import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        
        System.out.print("Introduce un numero a buscar del 1 al 20: ");
        int valorBuscado = patata.nextInt();

        int indice = buscarNumero(array, valorBuscado);

        if (indice != -1) {
            System.out.println("El valor " + valorBuscado + " se encuentra en la posición "+indice+" del array.");
        } else {
            System.out.println("El valor " + valorBuscado + " no se encuentra en el array.");
        }
    }

    public static int buscarNumero(int[] array, int valor) {
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (array[medio] == valor) {
                return medio;
            } else if (array[medio] < valor) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1;
    }
}
