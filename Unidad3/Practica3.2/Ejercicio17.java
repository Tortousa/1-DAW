import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        int[] indices = indiceAlfabetico(palabra);

        System.out.println("Indices alfabéticos de la palabra \"" + palabra + "\":");
        for (int i = 0; i < indices.length; i++) {
            System.out.println(palabra.charAt(i) + ": " + indices[i]);
        }
    }

    public static int[] indiceAlfabetico(String palabra) {

        char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        int[] indices = new int[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.toLowerCase().charAt(i);

            for (int j = 0; j < alfabeto.length; j++) {
                if (letra == alfabeto[j]) {
                    indices[i] = j + 1;
                    break;
                }
            }
        }

        return indices;
    }
}

