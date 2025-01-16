/*
Ejercicio donde ordenamos un array desordenado con el metodo burbuja.
Daniel Tortosa Burtseva
*/
import java.util.Scanner;

public class Supuesto1 {

	public static Scanner patata = new Scanner(System.in);

	public static void main(String[] args) {
		int[] array = new int[6];

		array = pedirIntArray(array);

		System.out.print("Array inicial: ");
		mostrarArray(array);

		array = ordenarBurbuja(array);

		System.out.print("Array ordenado: ");
		mostrarArray(array);
	}

	/*
	Metodo que ordenado un array desordenado con el algoritmo burbuja

	@param array: paso por parametro el array que esta en el main
	@return array: devuelve el array ordenado
	*/

	public static int[] ordenarBurbuja(int[] array) {
		int aux;

		if(array == null || array.length == 0) {
			throw new IllegalArgumentException("Error, array nulo o vacio");
		}

		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length - i - 1; j++) {
				if(array[j] > array[j + 1]) {
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}
		return array;
	}

	/*
	Metodo que muestra el array

	@param array: paso por parametro el array que esta en el main
	*/

	public static void mostrarArray(int[] array) {
		for(int i : array) {
			System.out.print("[" + i + "]");
		}
		System.out.println();
	}

	/*
	Metodo que pide numeros a ingresar en el array con control de excepciones

	@param array: paso por parametro el array que esta en el main
	@return array: devuelve el array final
	*/

	public static int[] pedirIntArray(int[] array) {
        for (int i = 0; i < array.length;) {
            System.out.print((i + 1) + ". Numero: ");

            try {
                array[i] = Integer.parseInt(patata.nextLine().trim());
                i++;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return array;
    }
}