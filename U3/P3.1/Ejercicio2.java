/*
 * Escribe un programa que muestre las tablas de multiplicar. Para la visualización utiliza un método llamado calcularMostrarTabla().
 * La tabla mostrará productos hasta el 15. 
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        calcularMostrarTabla(4);
    }

    public static void calcularMostrarTabla(int n) {
        int mult;

        System.out.println("Tabla del " + n);
        System.out.println("------------");

        for (int i = 1; i <= 15; i++) {
            mult = n * i;
            System.out.println(n + " x " + i + " = " + mult); 
        }
    }
}
