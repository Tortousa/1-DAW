/**
 * Supuesto1_3.java
 * Crea un programa que pida al usuario un número con decimales y compruebe si está dentro algún rango en concreto para realizar una acción en función de dicho rango y mostrar el resultado de cada operación. Los rangos y las acciones son las siguientes:

    Entre 1 y 4: Se debe calcular una potencia en la que la base es el propio número y el exponente es el siguiente número entero (ej: Si el número es 2,24, la potencia será 2,243.
    Entre 5 y 10: El número debe multiplicarse por 2.
    Después de 10 y menor 20: Al número se le debe sumar el valor de su parte entera. (Ej: Si el número es 4,87 se debe hacer la suma 4,87+4).
    Entre 25 y menor que 30: El número debe multiplicarse por el número Pi.
    Para cualquier otro valor, el número debe dividirse entre 10.



 * Daniel Tortosa Burtseva 6 oct 2023
 */

import java.util.Scanner;

public class Supuesto1_3 {
    public static void main(String args[]) {     
        Scanner teclado = new Scanner(System.in);
        
    System.out.print("Inserte un numero decimal: ");
    double numero = teclado.nextDouble();
    
    if(numero >= 1 && numero <= 4){
      
        double expo = (int)Math.ceil(numero);
    
        System.out.println(numero + " elevado a " + expo);  
    }
    else if(numero >= 5 && numero <= 10){
    
        System.out.println(numero*2);  
    }
    else if(numero > 10 && numero < 20){
        
        double entero = (int)Math.floor(numero);
        
        System.out.println(numero*entero);  
    }
    else if(numero >= 25 && numero < 30){
        
        System.out.println(numero*3.14);  
    }
    else{
        
        System.out.println(numero/10);  
    }
    }
}
