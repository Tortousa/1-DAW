/*
 * Escribe un programa simple que pida al usuario un texto y compruebe si se trata de la palabra "Java", independientemente de ser mayúsculas, minúsculas e ignorando espacios en blanco tanto por la izquierda por la derecha.
 */
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);

        String palabra = "";

        System.out.print("Introduce la palabra Java: ");
        palabra = patata.nextLine().trim().toLowerCase(); //sin espacios por los lados y pasa todo a minuscula.

        if(palabra.equals("java")){
            System.out.println("Has introducido la palabra JAVA");
        }else{
            System.out.println("NO has introducido la palabra JAVA");
        }

        patata.close();
    }
}