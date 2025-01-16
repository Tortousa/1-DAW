/**
* Supuesto1_1.java
* Crea un programa que pida al usuario los siguientes datos:
● Nombre completo
● DNI, NIF o NIE
● Email
● Dirección
● Código Postal
● Provincia

  Una vez recogida esta información, se debe presentar la información para que se
  muestre por consola lo más parecido posible al formato del siguiente ejemplo:

  La persona es John Doe (12345678A)
  Email de contacto: johndoe@gmail.com
  Dirección: Calle falsa, 123. 30001, Murcia

* Daniel Tortosa Burtseva 30 oct 2024
*/

import java.util.Scanner; //importa la libreria Scanner para poder escribir en la terminal
public class Supuesto1_1 { //la clase tiene que tener el mismo nombre que el archivo .java
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in); //permite escribir en la terminal

        System.out.print("Inserta tu nombre completo: ");
        String nombre = teclado.nextLine(); //permite insertar un texto a traves del teclado de la terminal

        System.out.print("Inserta tu DNI: ");
        String dni = teclado.nextLine(); //permite insertar un texto a traves del teclado de la terminal

        System.out.print("Inserta tu email: ");
        String email = teclado.nextLine(); //permite insertar un texto a traves del teclado de la terminal

        System.out.print("Inserta tu direccion: ");
        String direccion = teclado.nextLine(); //permite insertar un texto a traves del teclado de la terminal

        System.out.print("Inserta tu provincia: ");
        String provincia = teclado.nextLine(); //permite insertar un texto a traves del teclado de la terminal

        System.out.print("Inserta tu codigo postal: ");
        int cp = teclado.nextInt(); //permite insertar un numero entero a traves del teclado de la terminal

        System.out.print("La persona es " + nombre + " (" + dni + ")\nEmail de contacto: " + email + "\nDireccion: " + direccion + ", " + cp + ", " + provincia); //Muestra por pantalla lo anterior escrito con saltos de linea (\n) y asi poder escribirlo en una linea de codigo

    }
}
