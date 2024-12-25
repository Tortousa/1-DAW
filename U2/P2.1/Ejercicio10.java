/*
 * Escribe un programa simple que pida un número entero y a partir de él cree en pantalla de texto un cuadrado de asteriscos con ese tamaño de lado.
 * Los asteriscos sólo se verán en el borde del cuadrado.
 */
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);

        int n;
        
        System.out.print("Introduce un numero entero que definira los lados del cuadrado: ");
        n = patata.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        patata.close();
    }
}
