import java.util.Arrays;
import java.util.Scanner;

public class TryCatch05 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] words = { "Esto", "es", "un", "texto" };
		System.out.println("Array -> " + Arrays.toString(words));
		
		System.out.print("Indica una posicion del array: ");
		int position = teclado.nextInt();
		
		mostrarPalabra(words, position);

		teclado.close();
	}

	static void mostrarPalabra(String[] palabras, int posicion) {
		boolean correcto = true;
		try {
			System.out.println(palabras[posicion]);
		} catch (Exception e) {
			System.out.println("La posicion " + posicion + " no existe en el array");
			correcto = false;
		} finally {
			System.out.println("La comprobacion ha terminado con " + (correcto ? "exito" : "errores") );
		}
	}
}