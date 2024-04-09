//metodo que pida 10 numeros y devuelva esos 10 numeros
import java.util.Scanner;
public class Practica42 {
    public static void main(String args[]) {     
        
        int[] numeros = pedirNum();
        mostrarNumeros(numeros);

    }
    public static int[] pedirNum(){ 
        Scanner patata = new Scanner(System.in);       
			int[] array = new int[11];
            
        System.out.println("Inserte 10 numeros");

        for(int i=1; i<array.length; i++){
            System.out.print("Inserte "+i+"º numero: ");     
                array[i] = patata.nextInt();
        }
        return array; 
    }
    public static void mostrarNumeros(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.print(i+ ", ");
        }

    }
}

