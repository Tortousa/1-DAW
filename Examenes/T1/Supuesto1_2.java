/**
* Supuesto1_2.java
* Crea un programa que pida al usuario el precio de un producto por unidad y la
  cantidad de unidades de dicho producto. A continuación, debe mostrar por consola
  los siguientes elementos mediante un mensaje que indique con claridad cada uno
  de ellos:
● Precio por unidad
● Cantidad
● Precio total
● Precio con IVA

* Daniel Tortosa Burtseva 30 oct 2024
*/
import java.util.Scanner;
public class Supuesto1_2 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double precio, precioTotal, precioConIva, iva; //las variables tipo double que voy a usar
        int cantidad; //variable tipo int que usare

        System.out.print("Inserta el precio por unidad: ");
        precio = teclado.nextDouble();

        System.out.print("Inserta la cantidad: ");
        cantidad = teclado.nextInt();

        precioTotal = precio * Double.valueOf(cantidad); //convierto el int a double por si pasa algun caso aislado

        iva = 0.21; //guardo el IVA en una variable
        
        precioConIva = precioTotal * (1 + iva); //operacion para saber precio con IVA

        System.out.print("Precio por unidad: " + precio + "€\nCantidad: " + cantidad + "\nPrecio total: " + precioTotal + "€\nPrecio con IVA(21%): " + precioConIva + "€\n");

        for(int i = 0; i < cantidad; i++){ //bucle que hace que imprima el siguiente texto las veces de la cantidad del producto
            System.out.println("\nTu sabes que esto es para un 10 ;p");
        }
        
    }
}
