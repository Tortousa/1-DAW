import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
     
    Scanner patata = new Scanner(System.in);
    
    System.out.print("Menu disponible\n1-Pizza\n2-Croquetas\n3-Coliflor cruda\n4-Pollo\n");//muestro en pantalla 4 opciones con su numero correspondiente
    
    System.out.print("Introduce el numero del plato a pedir:");//pido al usuario que pida una de las 4 opciones escribiendo el numero de la opcion
        int opcion = patata.nextInt();
    
    switch(opcion) {
        case 1:
            System.out.println("Ha pedido pizza");//muestro en pantalla la opcion que se ha elegido
            break;
        case 2:
            System.out.println("Ha pedido croquetas");//muestro en pantalla la opcion que se ha elegido
            break;
        case 3:
            System.out.println("Ha pedido coliflor cruda");//muestro en pantalla la opcion que se ha elegido
            break;
        case 4:
            System.out.println("Ha pedido pollo");//muestro en pantalla la opcion que se ha elegido
            break;
        default:
            System.out.println("Opcion no valida");//se muestra este mensaje si no se elige ninguna de las opciones definidas
        }
    System.out.println("\nFin del programa");
  }
}
