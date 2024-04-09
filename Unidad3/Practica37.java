
import java.util.Scanner;
public class Practica37 {
    public static void main(String args[]) {     
        Scanner patata = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = patata.nextLine();
        System.out.print("Edad: ");
        int edad = patata.nextInt();

        String cadena = generarFrase(nombre,edad);
        System.out.println(cadena);

    }
    public static String generarFrase(String nombre, int edad){ 
            
        String texto = "Tu nombre es "+ nombre + " y tienes "+edad+" años";
            return texto;
    }
}

