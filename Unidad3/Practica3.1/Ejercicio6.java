public class Ejercicio6 {
    public static void main(String[] args) {
        
		int[] array = inicializarArray();
        mostrarArray(array);
    }

    public static int[] inicializarArray() {
        int[] array = new int[21];

        for (int i = 1; i < array.length; i++) {
            array[i] = i * 5;
        }

        return array;
    }

    public static void mostrarArray(int[] array) {
        
		System.out.println("Contenido del array:");

        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i]+", ");
		}
    }
}


