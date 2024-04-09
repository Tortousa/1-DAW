import java.util.Scanner;
public class Ejercicio10 {
    public static Scanner patata = new Scanner(System.in);

    public static void main(String[] args) {

    System.out.print("Introduce un numero: ");
    int numero = patata.nextInt();

    String solucion = rombo(numero);
    System.out.print(solucion);

    }
    public static String rombo(int numero){
        String cosa = "";
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
        return cosa;
    } 
}
