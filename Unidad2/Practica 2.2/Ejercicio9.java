import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);

        System.out.print("Escribe un numero entero positivo o 0: ");
            int numero = patata.nextInt();

        if (numero < 0) {
            System.out.println("Numero no valido");
        }
        else { // multiplica 1 por el numero siguiente y el resultado por el siguiente hasta llegar a multiplicar el numero obtenido por el numero ingresado
            long factorial = 1; //se guarda en un long ya que manejamos numeros grandes
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }   
    }
}
