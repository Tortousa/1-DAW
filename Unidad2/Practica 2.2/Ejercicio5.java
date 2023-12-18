import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);
        int numero;
        int suma = 0;
        int cont = 0; //declaro esta variable para poder hacer la media con el total de numeros escritos

        System.out.println("Introduce numeros enteros positivos (cuando quiera finalizar, introduce un 0)");

        do {
            System.out.print("Introduzca numero: ");
            numero = patata.nextInt();

            if (numero > 0) {
                suma += numero;
                cont++;
            } else if (numero < 0) {
                System.out.println("Introduce solo numeros positivos.");
            }

        } while (numero > 0);

        if (cont > 0) {
            double media = (double) suma/cont;
            System.out.println("Suma: " + suma);
            System.out.println("Media: " + media);
        } else {
            System.out.println("No se introdujeron numeros positivos.");
        }
    }
}


