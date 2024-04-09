import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ". Numero: ");
            array[i] = patata.nextInt();
        }

        int resultado = ordenarBurbuja(array);

        System.out.println("Resultado: " + resultado);
    }

    public static int ordenarBurbuja(int[] array) {
        if (array.length <= 1) {
            return 0;
        }

        boolean ordenado = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                ordenado = false;
                break;
            }
        }

        if (ordenado) {
            return 0;
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            return 1;
        }
    }
}


