// Escribe en pantalla los múltiplos de 2 por debajo de un TOPE, 16.
import java.util.Scanner;

public class Multiplos 	{
	public static void main(String argumentos[]) {
        Scanner teclado = new Scanner(System.in);
		final int TOPE = 16;
		int mult = 0;
		int cont = 0;

		System.out.println("\t Múltiplos de 2");
        multiplos(mult, TOPE, cont);
		
		teclado.close();
	}

    public static void multiplos(int mult, int TOPE, int cont){
        while (mult < TOPE) {
			mult = cont * 2;
			System.out.println("\t  " + '#' + (cont+1) + '\t' + mult);
			++cont;
		}
    }
}
