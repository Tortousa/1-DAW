import java.util.Scanner;
public class Ejercicio8 {
    public static Scanner patata = new Scanner(System.in);

    public static void main(String[] args) {

    System.out.print("Introduce un numero: ");
    int numero = patata.nextInt();

    String respuesta = triangulo(numero);
    System.out.println(respuesta);

    }
    public static String triangulo(int numero){
        String cosa = "";
        int asteriscos = 1;
        int i,j,k;
        for(i = 1; i<=numero; i++){
            for(j = 1; j<=numero-i; j++){
                cosa += " ";
            }
            for(k = 1; k<=2*i-1; k++){
                cosa += "*";
            }
        cosa += "\n";
        asteriscos += 2;
        }
        return cosa;
    }
}
