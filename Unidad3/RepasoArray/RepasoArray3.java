
import java.util.Scanner;
public class RepasoArray3 {
    public static void main(String args[]) {     
        Scanner patata = new Scanner(System.in);
        int[] array = new int[11];
        
        for(int i = 1; i < array.length; i++){
            System.out.print("Inserte el "+i+ "º numero entero: ");
            array[i] = patata.nextInt();
        }
        System.out.println("Puestos pares");
        for(int j = 1; j < array.length; j++){
            if (j%2 == 0){
            System.out.println("Numero "+j+"º es "+ array[j]);       
            }
        }
        System.out.println("Puestos impares");
        for(int k = 1; k < array.length; k++){
            if (k%2 == 1){
            System.out.println("Numero "+k+"º es "+ array[k]);       
            }
        }
    }
}
