//Crea un programa que realice operaciones matemáticas básicas (suma, resta, multiplicación y división) en dos números ingresados por el usuario.
//El usuario debe seleccionar la operación que desea realizar.

import java.util.Scanner;
public class Operacionesseleccion {
    public static void main(String[] args){
     
    Scanner patata = new Scanner(System.in);
    
    System.out.print("Introduce un numero:");
        int n1 = patata.nextInt();
    
    System.out.print("Introduce otro numero:");
        int n2 = patata.nextInt();

    System.out.print("Elige la operacion que quieres realizar\n1-Suma\n2-Resta\n3-Multiplicacion\n4-Division:");
        int opcion = patata.nextInt();
    
    if (opcion == 1) //Suma
    {
    System.out.println(n1 + n2);
    } 
        else if (opcion == 2) //Resta
    {
        System.out.print(n2 - n1);
            }
        else if (opcion == 3) //Multip
    {
        System.out.print(n1 * n2);
    }
        else if (opcion == 4) //Division
    {
        System.out.println(n1/n2);
    }
  }
}
