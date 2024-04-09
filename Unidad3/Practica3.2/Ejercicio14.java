import java.util.Scanner;
public class Ejercicio14 {
	public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);
		int[] vector = new int[7];
        int[] secuencia = new int[4];

		System.out.println("Introduce 7 enteros para el primer vector:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print((i + 1) + ". Numero: ");
            vector[i] = patata.nextInt();
        }

        System.out.println("Introduce 4 enteros para el segundo vector:");
        for (int i = 0; i < secuencia.length; i++) {
            System.out.print((i + 1) + ". Numero: ");
            secuencia[i] = patata.nextInt();
        }

        int coincidencias = buscarCoincidencias(vector, secuencia);
        System.out.println("Número de enteros coincidentes: " + coincidencias);

    }
    public static int buscarCoincidencias(int[] vector, int[] secuencia) {
        int coincidencias = 0;

        for (int i = 0; i < secuencia.length; i++) {
            for (int j = 0; j < vector.length; j++) {
                if (secuencia[i] == vector[j]) {
                    coincidencias++;
                    break;
                }
            }
        }
        return coincidencias;
    }
}


