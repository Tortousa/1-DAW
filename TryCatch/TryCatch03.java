import java.util.Scanner;

public class TryCatch03 {
	public static void main(String[] args) {
		int numero = pedirInt("Escribe un numero: ");

		System.out.print("El numero es " + numero);
	}

	static int pedirInt(String enunciado) {
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		boolean correcto = false;
		while(!correcto) {
			System.out.print(enunciado);
			try {
				numero = teclado.nextInt();
			} catch(Exception e) {
				System.out.println("El valor no es un numero entero. Intentelo de nuevo");
				teclado.next();
				continue;
			}
			correcto = true;
		}
		teclado.close();
		return numero;
	}
}