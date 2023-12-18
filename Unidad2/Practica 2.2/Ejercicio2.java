import java.util.Scanner;
import java.lang.Math; //para poder usar comandos Math. necesito importar esta libreria

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);
        
        System.out.print("Introduce el capital principal inicial: ");
        int capInicial = patata.nextInt();

        System.out.print("Introduce el tipo de interes anual: ");
        double interAn = patata.nextDouble();

        System.out.print("Introduce los años: ");
        int anyos = patata.nextInt();

        double capFinal = capInicial * Math.pow((1 + interAn),anyos); //Math.pow realiza la funcion de una potencia. Donde el primer termino es la base y el segundo es el exponente.

        double valInter = capFinal-capInicial;

        System.out.println("El Capital Final es de "+capFinal+" euros");
        System.out.println("El valor de los intereses es de "+valInter+" euros");
    }
}
