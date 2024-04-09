import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);
        int[] array = new int[10];

        for(int i = 0; i < array.length; i++){
            System.out.print((i+1)+". Numero: ");
            array[i] = patata.nextInt();
        }
        
        int resultado = masFrecuenteInt(array);
        System.out.println("El elemento más frecuente es: " + resultado);
    }

    public static int masFrecuenteInt(int[] array) {
        if (array.length == 0) {
            System.out.println("El array no puede estar vacío");
        }

        int elementoMasFrecuente = array[0];
        int frecuenciaMaxima = 1;

        for (int i = 0; i < array.length - 1; i++) {
            int elementoActual = array[i];
            int frecuenciaActual = 1;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == elementoActual) {
                    frecuenciaActual++;
                }
            }

            if (frecuenciaActual > frecuenciaMaxima) {
                frecuenciaMaxima = frecuenciaActual;
                elementoMasFrecuente = elementoActual;
            }
        }
        return elementoMasFrecuente;
    }
}

