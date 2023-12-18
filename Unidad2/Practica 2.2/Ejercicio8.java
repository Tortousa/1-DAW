import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del lado del cuadrado: ");
        int lado = patata.nextInt();

        if (lado <= 0) {
            System.out.println("El tamaño del lado debe ser un numero entero positivo");
        }
        else {
            for (int i = 1; i <= lado; i++) {
                for (int j = 1; j <= lado; j++) { // Poner asterisco si estamos en el borde o las esquinas del cuadrado
                    if (i == 1 || i == lado || j == 1 || j == lado) {
                        System.out.print(" * ");
                    }
                    else {
                        System.out.print("   ");
                    }
                }
                System.out.println(); // Saltar a una nueva linea despues de cada fila
            }
        }
    }
}

