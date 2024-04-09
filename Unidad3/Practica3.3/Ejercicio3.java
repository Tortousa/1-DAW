import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);

        int lado = 0;
        String letra = "";
        boolean check = true;

        do {
            System.out.print("Introduce el lado del cuadrado: ");

            do {
                try {
                    lado = Integer.parseInt(patata.nextLine().trim());
                    check = false;
                } catch (Exception e) {
                    System.out.println("Error: introduce un numero ");
                }
            } while (check);

            check = true;

            if (lado <= 0) {
                System.out.println("Introduce un entero positivo");
                lado = patata.nextInt();
            }
        } while (lado <= 0);

        System.out.print("Introduce la letra que se dibujara en el cuadrado: ");
        letra = patata.next().toUpperCase();

        muestraCuadrado(lado, letra);
    }

    public static void muestraCuadrado(int lado, String letra) {
        for (int i = 1; i <= lado; i++) {
            for (int j = 1; j <= lado; j++) {
                if (i == 1 || i == lado || j == 1 || j == lado) {
                    System.out.print(letra+" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


