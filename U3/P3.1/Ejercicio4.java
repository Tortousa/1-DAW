/*
 * Escribe un método que se llame triangulo() que reciba un número entero como parámetro y muestre por pantalla una pirámide de asteriscos.
 */
import java.util.Scanner;
public class Ejercicio4 {
    public static Scanner patata = new Scanner(System.in);
    public static void main(String[] args) {

    System.out.print("Introduce un numero: ");
    int numero = patata.nextInt();

    patata.close();

    triangulo(numero);

    }
    public static void triangulo(int numero){
        int i,j,k;

        for(i = 1; i <= numero; i++){
            for(j = 1; j <= numero - i; j++){
                System.out.print(" ");
            }
            for(k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
        System.out.println();
        } 
    }
}