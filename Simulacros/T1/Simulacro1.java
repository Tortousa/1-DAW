/*
 * Simulacro1.java
 * Crea un programa que pida al usuario los siguientes datos:

 * Modelo de coche
 * Matricula
 * Email
 * Dirección
 * Código Postal
 * Provincia

 * Daniel Tortosa Burtseva 29 oct 2024
 */

import java.util.Scanner;

public class Simulacro1 {
    public static void main(String args[]) {     
        Scanner teclado = new Scanner(System.in);
        
        String modelo, matricula, email, direccion, provincia;
        int cp;

        System.out.print("Inserte el modelo de coche: ");
        modelo = teclado.nextLine();

        System.out.print("Inserte su matricula: ");
        matricula = teclado.nextLine();

        System.out.print("Inserte su email: ");
        email = teclado.nextLine();

        System.out.print("Inserte su direccion: ");
        direccion = teclado.nextLine();

        System.out.print("Inserte su CP: ");
        cp = teclado.nextInt();

        teclado.nextLine(); //quitar bug Java

        System.out.print("Inserte su provincia: ");
        provincia = teclado.nextLine();

        System.out.println("El coche es "+ modelo + "(" + matricula + ")");
        System.out.println("Email de contacto: " + email);
        System.out.println("Direccion: " + direccion + ". " + cp + ", "+ provincia);

        teclado.close();
    }
}
