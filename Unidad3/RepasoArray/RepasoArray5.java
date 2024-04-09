import java.util.Scanner;
public class RepasoArray5 {
    public static void main(String args[]) {     
        Scanner patata = new Scanner(System.in);
        int[] array = new int[11];
        int suma = 0;
        int multi = 1;
		
        for(int i = 1; i < array.length; i++){
            System.out.print("Inserte el "+i+ "º numero entero: ");
            array[i] = patata.nextInt();
            suma = suma+array[i];
            multi = multi*array[i];
        }
		
        System.out.println("Suma: "+suma);
        System.out.println("Multiplicacion: "+multi);
    }
}
