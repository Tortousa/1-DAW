import java.util.Scanner;
public class practica13 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Selecciona una conversion\n" +
                         "\t1 - Opcion A\n" +
                         "\t2 - Opcion B\n" + 
                         "\t3 - Opcion C\n" +
                         "\t4 - Opcion D\n\n" +
                         "Elige una opcion: ");
    int opcion = teclado.nextInt();
    
    switch(opcion) {
        case 1:
            System.out.println("Has seleccionado la opcion A");
            break; //hay que ponerla siempre despues de un caso, ya que asi no ejecuta todo el programa al encontrarse con la respuesta correcta.
        case 2:
            System.out.println("Has seleccionado la opcion B");
            break;
        case 3:
            System.out.println("Has seleccionado la opcion C");
            break;
        case 4:
            System.out.println("Has seleccionado la opcion D");
            break;
        default :
            System.out.println("Opcion no valida");//sirve para cuando no se cumple ninguna de las opciones definidas anteriores
        }
     System.out.println("\nFin del programa");
    }
}
