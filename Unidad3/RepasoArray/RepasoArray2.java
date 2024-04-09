//Realizar un programa que utilice un estructura array de enteros de 10 posiciones
//Leer 10 enteros por teclado e introducirlos en el array uno a uno
//Recorrer el array y mostrar cada entero con la posición con la que ocupa pero de forma inversa
//en la que se introdujeron
import java.util.Scanner;

public class RepasoArray2 {
    public static void main(String args[]) {     
        Scanner patata = new Scanner(System.in);
        int[] array = new int[10];
        
        for(int i = 0; i < array.length; i++){
            System.out.print("Inserte un numeros enteros: ");
            array[i] = patata.nextInt();
        }
                for(int j = 9; j >= 0; j--){
                    System.out.println("Numero "+j+":"+ array[j]);
                
                }
        
    }
}
