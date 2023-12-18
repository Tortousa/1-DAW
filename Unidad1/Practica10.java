import java.util.Scanner; // && hace la funcion de AND y || quiere decir OR
public class Practica10 {
    public static void main(String[] args){
     
    Scanner patata = new Scanner(System.in);
    
    System.out.print("Introduce un numero:");
        int numero = patata.nextInt();
 
    System.out.print("Condicion ");
    System.out.println(numero > 5 && numero <=10 );

    if (numero > 5 && numero <=10) {
    System.out.println("Es mayor que 5");
}

        System.out.println("FIN DEL PROGRAMA");
    }
}
