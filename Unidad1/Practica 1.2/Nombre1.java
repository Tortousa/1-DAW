import java.util.Scanner; //libreria necesaria para poder escribir
public class Nombre1 {
    public static void main(String[] args){
     
    Scanner patata = new Scanner(System.in); //comando para habilitar la escritura
    
    System.out.print("Introduce tu nombre:");
        String nombre1 = patata.nextLine(); //hay que poner la variable justo debajo del System.out.print() donde queremos escribir. Al ser un String,ponemos .nextLine()
    System.out.print("Introduce tu edad: ");
        String edad1 = patata.nextLine();

    System.out.print("Introduce tu nombre:");
        String nombre2 = patata.nextLine();
    System.out.print("Introduce tu edad: ");
        String edad2 = patata.nextLine();
 
    System.out.println("Te llamas " + nombre1 + "y tienes " + edad1); //finalmente el resultado sumando las variables especificas
    System.out.println("Te llamas " + nombre2 + "y tienes " + edad2);
    
    }
}
