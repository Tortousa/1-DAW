/*
 * Escribe un programa simple que, en un bucle continuo, pida un número con varios decimales, los que quiera el usuario.
 * Después pregunta a cuantos decimales se quiere redondear.
 * Seguidamente muestra el resultado redondeado, teniendo en cuenta que no hay que cortar, hay que redondear.
 * Debe haber algún medio de terminar el bucle continuo de entrada de datos.
 * Puede resolverse utilizando el método Math.rint(…) que redondea al entero mayor o igual que corresponde al número double recibido como argumento.
 */
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);

        double n, factor, redondeo;
        int decimales;
        String exit;

        do {
            System.out.print("Introduce un numero con los decimales que desees, luego decidiras por donde redondearlo: ");
            n = patata.nextDouble();

            System.out.print("Elige el numero de decimales al que quieres redondear: ");
            decimales = patata.nextInt();

            factor = Math.pow(10, decimales);
            redondeo = Math.round(n * factor) / factor;

            System.out.println("Numero redondeado: " + redondeo);

            System.out.print("Pulsa 'X' para salir o cualquier otra tecla para continuar: ");
            exit = patata.next();
        } while (!exit.equalsIgnoreCase("X"));

        patata.close();
    }
}

