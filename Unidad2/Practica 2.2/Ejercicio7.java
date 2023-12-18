import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingresa un numero decimal: ");
            double num = patata.nextDouble();

            System.out.print("Decimales a redondear: ");
            int deci = patata.nextInt();

            double pot = Math.pow(10, deci);
            double resultado = Math.rint(num*pot)/pot;

            System.out.println("Resultado final: " + resultado);

            System.out.print("¿Desea continuar? (1 para sí, 0 para no): ");
            int opcion = patata.nextInt();
            if (opcion == 0) {
                continuar = false;
            }
        }     
    }
}

