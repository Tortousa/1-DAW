import java.util.Scanner;
public class Practica6 {
    public static void main(String[] args){
        Scanner patata = new Scanner(System.in);

    System.out.print("Introduce un numero con decimales: ");
        double a = patata.nextDouble();
        double resultado = Math.ceil(a); //Math.ceil() sirve para aproximar hacia arriba
        
        //double resultado = Math.floor(a); Math.floor() sirve para aproximar hacia abajo
    
    System.out.println("El numero mas cercano es " + resultado);

    }
}
