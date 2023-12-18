import java.util.Scanner; // && hace la funcion de AND y || quiere decir OR
public class Practica9 {
    public static void main(String[] args){
     
    Scanner patata = new Scanner(System.in);
    
    System.out.print("Introduce un numero:");
        int numero = patata.nextInt();
 
    System.out.print("Condicion ");
    System.out.println(numero > 2 );

    if (numero > 2) {
    System.out.println("Es mayor que 2");
}

        System.out.println("FIN DEL PROGRAMA");
    }
}
