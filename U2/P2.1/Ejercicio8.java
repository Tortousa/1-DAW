/*
 * Escribe un programa simple que pida un número entero por consola y muestre por pantalla la tabla de multiplicar de dicho número.
 */
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);

        int n, multiplicacion;
        
        System.out.print("Introduce un numero para mostrar su tabla de multiplicar: ");
        n = patata.nextInt();

        for(int i = 1; i <= 10; i++){
            multiplicacion = n * i;

            System.out.println(n + " x " + i + " = " + multiplicacion);
        }

        patata.close();
    }
}
