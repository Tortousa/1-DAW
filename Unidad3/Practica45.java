
import java.util.Scanner;
public class Practica45 {
    public static int numero; // variable global

    public static void main(String args[]) {     
        Scanner patata = new Scanner(System.in);
        
        int numero;

        System.out.print("Introduce un numero entero: ");
        numero = patata.nextInt();

        mostrarNumero();

    }
    public static void mostrarNumero(){
        System.out.print("Numero entero es "+ numero);

    }
}
