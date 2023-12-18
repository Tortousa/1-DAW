//Crea un programa que realice operaciones matemáticas básicas (suma, resta, multiplicación y división) en dos números ingresados por el usuario.
//El usuario debe seleccionar la operación que desea realizar.

import java.util.Scanner;
public class Operacionesseleccionswitch {
    public static void main(String[] args){
     
    Scanner patata = new Scanner(System.in);
    
    System.out.print("Introduce un numero:");
        double n1 = patata.nextDouble();
    
    System.out.print("Introduce otro numero:");
        double n2 = patata.nextDouble();

    System.out.print("Elige la operacion que quieres realizar\n1-Suma\n2-Resta\n3-Multiplicacion\n4-Division:");
        int opcion = patata.nextInt();
    
    switch(opcion) {
        case 1:
            System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
            break;
        case 2:
            System.out.println(n1 + " + " + n2 + " = " + (n1-n2));
            break;
        case 3:
            System.out.println(n1 + " + " + n2 + " = " + (n1*n2));
            break;
        case 4:
            System.out.println(n1 + " + " + n2 + " = " + (n1/n2));
            break;
        default:
            System.out.println("Opcion no valida");
        }
    System.out.println("Fin del programa");
  }
}
