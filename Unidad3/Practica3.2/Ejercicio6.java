import java.util.Scanner;
public class Ejercicio6 {
    public static Scanner patata = new Scanner(System.in);

    public static void main(String[] args) {

    System.out.print("Introduce un numero: ");
    int numero = patata.nextInt();

    rombo(numero);

    }
    public static void rombo(int numero){
        int i,j;
        
        for(i = 1; i<=numero; i=i+2){
            for(j = 1; j<=(numero-i)/2; j++){
                System.out.print(" ");
            }
            for(j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(i = numero-2; i>=1; i=i-2){
            for(j = 1; j<=(numero-i)/2; j++){
                System.out.print(" ");
            }
            for(j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
