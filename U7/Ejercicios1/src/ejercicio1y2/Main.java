package ejercicio1y2;
/*
 * * Diseña en eclipse las jerarquías de clases para representar los siguientes conjuntos de objetos:
 * * - Una colección de discos compactos, entre los cuales hay obras de música (CDs de audio), discos con ficheros de música en MP3 , discos de aplicaciones (CD-ROMs con software) y discos con datos (CD-ROMs con datos y documentos).
 * * - Los diferentes productos que se pueden encontrar en una tienda de electrónica de consumo, que tienen un conjunto de características comunes (precio, código de barras…) y una serie de características específicas de cada producto.
 * * - Los objetos de una colección de monedas/billetes/sellos.
 */

public class Main {
    public static void main(String[] args) {
        CarritoCompra carrito = new CarritoCompra();

        carrito.addCosa(new Electrodomestico("Frigorifico", 599.99, "8412345678907", "B"));
        carrito.addCosa(new Telefono("S24", 249.99, "012345678905", "Samsung"));

        carrito.addCosa(new CDAudio("Thriller", "Michael Jackson", 1982, 49.99, 8));
        carrito.addCosa(new CDMP3("Greatest Hits", "Queen", 2000, 51.99, 700));
        
        carrito.addCosa(new Moneda("Yen", 2023, 1.0, "Aluminio"));

        carrito.imprimirTicket();
    }
}