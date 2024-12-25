/*
 * Escribe un programa simple que pida tres datos de tipo entero por teclado, los guarde y los muestre ordenados por pantalla.
 */
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("Inserta un numero(1/3): ");
        n1 = patata.nextInt();

        System.out.print("Inserta un numero(2/3): ");
        n2 = patata.nextInt();

        System.out.print("Inserta un numero(3/3): ");
        n3 = patata.nextInt();

        System.out.println(n1 + " - " + n3 + " - " + n2);

        patata.close();
    }
}