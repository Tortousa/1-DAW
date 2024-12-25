/*
 * Simulacro2.java
 * Ikea

 * Precio por unidad
 * Cantidad
 * Precio total
 * Precio con iva

 * Daniel Tortosa Burtseva 29 oct 2024
 */

import java.util.Scanner;

public class Simulacro2 {
    public static void main(String args[]) {     
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Inserte el precio de un producto por unidad: ");
        double precio = teclado.nextDouble();

        System.out.print("Inserte la cantidad de dicho producto: ");
        int cantidad = teclado.nextInt();
    
        if(precio > 0 && cantidad > 0){
            double precioTotal = precio*cantidad;

            double iva = 0.21;
    
            double precioConIva = precioTotal * (1 + iva);

            System.out.println("Precio por unidad: "+ precio +"€");
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Precio total: " + precioTotal);
            System.out.println("Precio con IVA(21%): " + precioConIva); 
        }
        else {
            System.out.println("Precio o cantidad no valida");
        }

        teclado.close();
    }
}
