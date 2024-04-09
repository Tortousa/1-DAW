
import java.util.Scanner;
public class Practica36 {
    public static void main(String args[]) {     
        Scanner patata = new Scanner(System.in);
        
        System.out.println("Introduce dos numeros para mostrar la multiplicacion de sus valores absolutos: ");

        System.out.print("Primer numero: ");
        int num1 = patata.nextInt();
        System.out.print("Segundo numero: ");
        int num2 = patata.nextInt();

        int resultado = producto(num1, num2); //lo guardamos en una variable
        System.out.println("Resultado: "+resultado);

    }
    public static int producto(int num1, int num2){ //el int sirve para poder guardar el metodo en una variable
            
        int resultado = (int)(Math.abs(num1) * Math.abs(num2));
            return resultado; //como resultado es una variable int,se devuelve correctamente

    }
}

