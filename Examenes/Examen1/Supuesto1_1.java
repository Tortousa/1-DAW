/**
 * Supuesto1_1.java
 * Crea un programa que pida al usuario los siguientes datos:

    Nombre completo
    DNI, NIF o NIE
    Email
    Dirección
    Código Postal
    Provincia

 * Daniel Tortosa Burtseva 6 oct 2023
 */

import java.util.Scanner;

public class Supuesto1_1 {
    public static void main(String args[]) {     
        Scanner teclado = new Scanner(System.in);
        
    System.out.print("Inserte su nombre completo: ");
    String nombre = teclado.nextLine();

    System.out.print("Inserte su DNI: ");
    String dni = teclado.nextLine();

    System.out.print("Inserte su email: ");
    String email = teclado.nextLine();

    System.out.print("Inserte su direccion: ");
    String direccion = teclado.nextLine();

    System.out.print("Inserte su CP: ");
    int cp = teclado.nextInt();

    System.out.print("Inserte su provincia: ");
    String provincia = teclado.nextLine();

    System.out.println("La persona es "+ nombre + "(" + dni + ")");
    System.out.println("Email de contacto: " + email);
    System.out.println("Direccion: " + direccion + ". " + cp + ", "+ provincia);
    }
}
