import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1)+". Numero: ");
            array[i] = patata.nextInt();
        }
        
        int resultado = ordenarBaraja(array);

        System.out.println("Resultado de la ordenación: " + resultado);
    }

    public static int ordenarBaraja(int[] array) {
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
            for (int i = array.length - 1; i > 0; i--) {
                int j = (int) (Math.random() * (i + 1));
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            return 1;
        }
    }
}


