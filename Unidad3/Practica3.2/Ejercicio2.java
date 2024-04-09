/*
Escribe un programa que muestre las tablas de multiplicar. Para la visualización utiliza un método llamado calcularMostrarTabla().
El método calcularMostrarTabla() recibe el número del que calculará la tabla y la visualiza por pantalla con el formato adecuado.
La tabla mostrará productos hasta el 15. 
Deben seguirse los principios y estilo del código limpio.
*/
import java.util.Scanner;
public class Ejercicio2 {
    
	public static final Scanner patata = new Scanner(System.in);
    public static final int LIMITE = 15;    
	public static int NUMERO;

    public static void main(String[] args) {
			
		System.out.print("Introduce un numero para mostrar su tabla de multiplicar: ");
        NUMERO = patata.nextInt();

        calcularMostrarTabla();
        
	}
	public static void calcularMostrarTabla(){
		
        for(int i = 1; i<=LIMITE; i++){
            System.out.println("------------");
            System.out.println("Tabla del "+ i);
            for(int j = 1; j<= NUMERO; j++){
                System.out.println(i+" x "+j+" = "+(i*j));
            }
        }
	}
}