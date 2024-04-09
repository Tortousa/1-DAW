
import java.util.Scanner;
public class Practica40 {
    public static void main(String args[]) {     
        
		int numero = pedirInt();
		System.out.print("El numero es: "+numero);

    }
    public static int pedirInt(){ 
    	Scanner patata = new Scanner(System.in);       
		System.out.print("Inserte un numero entero: ");
		int numero = patata.nextInt();

		return numero;
    }
}

