/*
 * Escribe un programa simple que lea una serie de números enteros por teclado e indique cuál es el mayor de todos ellos.
 * No se deben guardar los datos introducidos; sólo debe ir guardándose el que vaya siendo mayor.
 * Cada vez que se lee un dato el programa pregunta si se quiere seguir. Se debe pulsar la tecla S para seguir.
 */
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);
        
        int n, mayor = Integer.MIN_VALUE, intentos = 0;
        String seguir = "";

        do{
            System.out.print("Inserta un entero: ");
            n = patata.nextInt();

            patata.nextLine(); //bug Java

            System.out.print("Pulse S si desea seguir: ");
            seguir = patata.nextLine();
            intentos++;

            if(intentos < 1){
                mayor = n;
            }else{
                if(n > mayor){
                    mayor = n;
                }
            }
            
            if(!seguir.equalsIgnoreCase("S")){
                System.out.println("Has salido del programa!");
            }
        }while(seguir.equalsIgnoreCase("S"));

        System.out.print("El numero mayor es: " + mayor);

        patata.close();
    }
}
