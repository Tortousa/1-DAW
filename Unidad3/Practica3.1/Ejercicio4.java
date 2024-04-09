import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] argumentos) {
        int tope = pedirTope();
        mostrarMultiplos2(tope);
    }

    public static void mostrarMultiplos2(int tope) {
        int mult;
        int cont;

        mult = 0;
        cont = 0;

        System.out.println("\t Múltiplos de 2\n");
        while (mult < tope) {
            mult = cont * 2;
            System.out.println("\t  #" + (cont + 1) + '\t' + mult);
            ++cont;
        }
    }

    public static int pedirTope() {
        Scanner patata = new Scanner(System.in);
        int tope;
        System.out.println("Inserte el tope: ");
        tope = patata.nextInt();
        return tope;
    }
}

