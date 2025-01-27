/**
 * Supuesto1_2.java
 * Crea un programa que pida al usuario el precio de un producto por unidad y la cantidad de unidades de dicho producto. A continuación, debe mostrar por consola los siguientes elementos mediante un mensaje que indique con claridad cada uno de ellos:

    Precio por unidad
    Cantidad
    Precio total
    Total sin IVA
    IVA total


 * Daniel Tortosa Burtseva 6 oct 2023
 */

import java.util.Scanner;

public class Supuesto1_2 {
    public static void main(String args[]) {     
        Scanner teclado = new Scanner(System.in);
        
    System.out.print("Inserte el precio de un producto por unidad: ");
    double precio = teclado.nextDouble();

    System.out.print("Inserte la cantidad de dicho producto: ");
    int cantidad = teclado.nextInt();
    
    if(precio > 0 && cantidad > 0){
        double precioTotal = precio*cantidad;

        double iva = 0.21;
    
        double precioSinIva = precioTotal-(precioTotal*iva);

        System.out.println("Precio por unidad: "+ precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio total: " + precioTotal);
        System.out.println("Precio sin IVA: " + precioSinIva);
        System.out.println("IVA total: " + precioTotal*iva);  
    }
    else {
        System.out.println("Precio o cantidad no valida");
    }
    
    }
}
