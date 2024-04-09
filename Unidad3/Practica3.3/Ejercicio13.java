import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una palabra (letras admitidas A,B,C,O): ");
        String entrada = scanner.nextLine().toUpperCase();

        for (int i = 0; i < entrada.length(); i++) {
            char letra = entrada.charAt(i);

            System.out.print(bannerLetra(letra));
        }

        System.out.println();
    }

    public static String bannerLetra(char letra) {
        switch (letra) {
            case 'A':
                return letraA();
            case 'B':
                return letraB();
            case 'C':
                return letraC();
            case 'O':
                return letraO();
            default:
                return "Letra no admitida";
        }
    }

    public static String letraA() {
        return "  A  " +
               " A A " +
               "AAAAA" +
               "A   A" +
               "A   A";
    }

    public static String letraB() {
        return "BBBB " +
               "B   B" +
               "BBBB " +
               "B   B" +
               "BBBB ";
    }

    public static String letraC() {
        return " CCCC" +
               "C    " +
               "C    " +
               "C    " +
               " CCCC";
    }

    public static String letraO() {
        return " OOOO" +
               "O    O" +
               "O    O" +
               "O    O" +
               " OOOO";
    }
    // Agrega más métodos de letras según sea necesario
}

