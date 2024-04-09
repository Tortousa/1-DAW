//*Crear un metodo que recibe un array de enteros,lo ordena de menor a mayor y devuelve el array ya ordenado
import java.util.Scanner;

public class Practica44 {
    public static void main(String args[]) {     
        
        int[] numeros = pedirNum();
        int[] ordenar = ordenarNumeros(numeros);
		mostrarNumeros(ordenar);

    }
    public static int[] pedirNum(){ 
        Scanner patata = new Scanner(System.in);       
		int[] array = new int[10];
            
        System.out.println("Inserte 10 numeros");

        for(int i=0; i<array.length; i++){
            System.out.print("Inserte "+(i+1)+"º numero: ");     
            array[i] = patata.nextInt();
        }
        return array; 
    }
    public static void mostrarNumeros(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i] + ", ");
        }
    }
    public static int[] ordenarNumeros(int[] array){
        for(int i = 1; i < array.length; i++){
            for(int j = 0; j < array.length-i; j++){
                if(array[j] > array[j+1]){
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
        		}
            }
        }
		return array;
    }
}
