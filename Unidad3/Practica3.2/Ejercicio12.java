import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Inserte 10 numeros y mostraremos si todos son consecutivos o hay alguna interrpcion.");

        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ". Numero: ");
            array[i] = patata.nextInt();
        }

        boolean resultado = yaOrdenadoInt(array);
        System.out.println("¿Esta el vector ordenado?: "+resultado);

    }

    public static boolean yaOrdenadoInt(int array[]) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
				return false;
            }
        }
        return true;
    }
}

