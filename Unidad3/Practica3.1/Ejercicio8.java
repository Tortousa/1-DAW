import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] vector1 = obtenerVector();
        int[] vector2 = obtenerVector();
        boolean iguales = vectoresIntIguales(vector1, vector2);

        if (iguales) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores no son iguales");
        }
    }

    public static int[] obtenerVector() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserte la longitud del vector: ");
        int longitud = scanner.nextInt();

        int[] vector = new int[longitud];

        for (int i = 0; i < longitud; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        return vector;
    }

    public static boolean vectoresIntIguales(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            return false;
        }

        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector2[i]) {
                return false;
            }
        }
        return true;
    }
}



