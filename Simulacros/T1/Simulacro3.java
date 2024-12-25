/*
 * Simulacro3.java
 * Crea un programa que pida al usuario un número decimal y segun el rango en el que se encuentre, realiza lo siguiente:

 * Entre 1 y 5: Realiza ua base con ese numero y el exponente es 3.
 * Entre 6 y 10: sumarle 0,75.
 * Entre 11 y 20: Decir si es par o impar.

 * Daniel Tortosa Burtseva 29 oct 2024
 */

import java.lang.Math;
import java.util.Scanner;

public class Simulacro3 {
    public static void main(String args[]) {     
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Inserte un numero decimal: ");
        String numeroString = teclado.nextLine();

        numeroString = numeroString.replace(",", "."); //cuando se encuentre una coma en el terminal, lo reemplaza por un punto para no dar error.

        double numero = Double.valueOf(numeroString);

        if(numero >= 1 && numero <= 5){
          
            double resultado = Math.pow(numero, 3);
            
            System.out.println(numero + " elevado a " + 3 + " = " + resultado);  
        }
        else if(numero >= 6 && numero <= 10){
        
            System.out.println(numero + " + " + "0,75 = " + (numero + 0.75));  
        }
        else if(numero >= 11 && numero <= 20){
            
            double modulo = numero%2;

            if(modulo != 0){
                System.out.println("Numero impar"); 
            }
            else{
                System.out.println("Numero par"); 
            } 
        }
        else{
            System.out.println("Numero no valido");  
        }

        teclado.close();
    }
}
