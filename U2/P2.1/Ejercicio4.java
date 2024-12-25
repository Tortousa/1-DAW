/*
 * Escribe un programa simple que lea tantos números enteros positivos como se quiera mientras no sea un cero, que terminaría.
 * Cuando termina la entrada, se muestra, como resultado, la suma de todos los números leídos y su media aritmética.
 * No hay que guardar los valores individualmente introducidos.
 */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);
        
        int n, suma = 0, contador = 0;

        do{
            System.out.print("Inserta numeros enteros positivos (0 para Salir): ");
            n = patata.nextInt();

            if(n > 0){
                suma+= n; //es equivalente a suma = suma + n;
                contador++;
            }else if(n < 0){
                System.out.println("Los numeros negativos no contabilizan.");
            }
        }while(n != 0);

        if(contador > 0){
            double media = (double) suma / contador; //convierto suma en un double para que cuente los decimales en la division.
            System.out.println("La suma es igual a " + suma);
            System.out.println("La media aritmetica es " + suma + " / " + contador + " = " + media);
        }else{
            System.out.println("No se han introducido numeros enteros positivos.");
        }

        patata.close();
    }
}