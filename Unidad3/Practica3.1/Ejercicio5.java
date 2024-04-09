import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args){

	    int[] numeros = pedirNumeros();
        mostrarArray(numeros);

    }
    public static int[] pedirNumeros(){
        Scanner patata = new Scanner(System.in);
        int[] array = new int[11];
        
		for(int i = 1; i < array.length; i++){
			array[i]=7;
        }
	    return array;
    }
    public static void mostrarArray(int[] array){

        for(int i = 1; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
    }
}
