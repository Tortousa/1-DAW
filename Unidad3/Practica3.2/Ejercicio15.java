import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);

        System.out.print("Introduce una palabra:");
        String entrada = patata.nextLine().toUpperCase();

        for (int i = 0; i < entrada.length(); i++) {
            char letra = entrada.charAt(i);
            
            System.out.println(bannerLetra(letra));
            
            System.out.println();
        }
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
                return "Letra no admitida ya que hay que poner muchos metodos";
        }
    }
    public static String letraA() {
        return "  A  \n" +
               " A A \n" +
               "AAAAA\n" +
               "A   A\n" +
               "A   A";
    }
    public static String letraB() {
        return "BBBB \n" +
               "B   B\n" +
               "BBBB \n" +
               "B   B\n" +
               "BBBB ";
    }
    public static String letraC() {
        return " CCCC\n" +
               "C    \n" +
               "C    \n" +
               "C    \n" +
               " CCCC";
    }
    public static String letraO() {
        return " OOOO\n" +
               "O    O\n" +
               "O    O\n" +
               "O    O\n" +
               " OOOO";
    }

    //Agrega más métodos de letras según sea necesario
}



