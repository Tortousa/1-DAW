/*
 * Escribe un programa simple que muestre un menú que permita realizar las operaciones de sumar, restar, multiplicar, dividir y terminar.
 * El menú debe ejecutarse en un bucle continuo controlando la opción terminar del menú.
 * Las operaciones serán siempre de dos operandos
 */
import java.util.Scanner;

public class Ejercicio9 {
    public static final String MENU = "1 - SUMAR\n2 - RESTAR\n3 - MULTIPLICAR\n4 - DIVIDIR\n0 - TERMINAR\nOPCION: ";
    
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);
        int n1 = 0, n2 = 0, opcion;
        double resultado;

        do {
            System.out.print(MENU);
            opcion = patata.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Introduce un numero (1/2): ");
                n1 = patata.nextInt();

                System.out.print("Introduce un numero (2/2): ");
                n2 = patata.nextInt();
            }

            if (opcion == 1) {
                resultado = n1 + n2;
                System.out.println("SUMA: " + n1 + " + " + n2 + " = " + resultado);

            } else if (opcion == 2) {
                resultado = n1 - n2;
                System.out.println("RESTA: " + n1 + " - " + n2 + " = " + resultado);

            } else if (opcion == 3) {
                resultado = n1 * n2;
                System.out.println("MULTIPLICACION: " + n1 + " x " + n2 + " = " + resultado);

            } else if (opcion == 4) {
                if (n2 != 0) {
                    resultado = (double) n1 / n2;
                    System.out.println("DIVISION: " + n1 + " / " + n2 + " = " + resultado);
                } else {
                    System.out.println("No se puede dividir entre 0.");
                }

            } else if (opcion == 0) {
                System.out.println("Has salido del programa.");
                break;

            } else {
                System.out.println("Opcion no valida.");
            }
            
        } while (true);

        patata.close();
    }
}

