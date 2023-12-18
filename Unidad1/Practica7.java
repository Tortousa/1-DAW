import java.util.Scanner;
public class Practica7 {
    public static void main(String[] args){
     
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce un numero para asignar la base:");
        double base = sc.nextDouble();
    System.out.print("Introduce otro numero para asignar el exponente: ");
        double expo = sc.nextDouble();
 
        //double potencia = Math.pow(base , expo);
        double raiz = Math.sqrt(base); //exponente es 2
    System.out.println("La raiz da " + raiz);

    sc.close(); //cerrar teclado
    }
}
