
import java.util.Scanner;
public class Practica41 {
    public static void main(String args[]) {     
        
        int numero1 = pedirInt("Introduce un numero: ");
        System.out.println("El numero es: "+numero1);
        int numero2 = pedirInt("Introduce otro numero: ");
		System.out.println("El numero es: "+numero2);
        int numero3 = pedirInt("Introduce un ultimo numero: ");
		System.out.println("El numero es: "+numero3);
        
    }
    public static int pedirInt(String enunciado){ 
        Scanner patata = new Scanner(System.in);       
			
            System.out.print(enunciado);
			int numero = patata.nextInt();

			return numero;
    }
}

