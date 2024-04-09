
import java.util.Scanner;
public class Practica46 {
    
    public static Scanner patata = new Scanner(System.in); // variable global

    public static void main(String args[]) {     

        System.out.print("Introduce un numero entero: ");
        int numero = patata.nextInt();

        int numero2 = pedirNumero();

        System.out.println("Primer numero: "+ numero);
        System.out.println("Segundo numero: "+ numero2);

    }
    public static int pedirNumero(){
        System.out.print("Introduce un numero entero: ");
        int numero = patata.nextInt();
        return numero;
    }
}
