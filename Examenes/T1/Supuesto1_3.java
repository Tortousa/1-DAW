/**
* Supuesto1_3.java
* Crea un programa que pida al usuario un número entero y compruebe si está dentro
  algún rango en concreto para realizar una acción en función de dicho rango y
  mostrar el resultado de cada operación. Los rangos y las acciones son las
  siguientes:
● Entre 1 y 4: El número introducido será la base y el exponente será 3.
● Entre 5 y 10: Suma al número introducido el valor de 0.30.
● Después de 10 y menor 20: El número debe dividirse entre 2.

* Daniel Tortosa Burtseva 30 oct 2024
*/
import java.util.Scanner;
public class Supuesto1_3 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        double resultado;

        System.out.print("Inserta un entero y se realizará una operacion: ");
        numero = teclado.nextInt();

        if(numero >= 1 && numero <=4){            
            
            resultado = Math.pow(numero, 3);

            System.out.println(numero + " elevado al cubo es igual a " + resultado);

        }else if(numero >= 5 && numero <=10){

            resultado = numero + 0.30;

            System.out.println(numero + " + 0,30 = " + resultado);

        }else if(numero > 10 && numero < 20){

            double divisor = 2.0; //gracias a que guardo el numero 2 en una variable doulbe, la division siguiente sale exacta.

            resultado = numero / divisor;

            System.out.println(numero + " / 2 = " + resultado);
        }
    }
}
