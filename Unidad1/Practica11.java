import java.util.Scanner; // && hace la funcion de AND y || quiere decir OR
public class Practica11 {
    public static void main(String[] args){
     
    Scanner patata = new Scanner(System.in);
    
    System.out.print("Introduce un numero:");
        int numero = patata.nextInt();

    if (numero >=0 && numero <=10) {
    System.out.println("Numero es valido");
    } 
        else 
    {
        System.out.print("Numero no valido");
            }
    }
}
