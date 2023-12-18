import java.util.Scanner;
	public class Ejercicio7 {
		public static void main(String[] args){
			Scanner teclado = new Scanner(System.in);

			System.out.println("Introduce un texto: ");
			String texto = teclado.nextLine().trim().toLowerCase();// esto hace que reduzca el mensaje a minusculas y sin contar los espacios

			if (texto.equals("java")) { //.equals hace que comprare el texto que se escriba
				System.out.println("Texto ingresado es 'Java'");
			}
			else {
				System.out.println("Texto ingresado diferente a 'Java'");
			}
			System.out.println("Fin del programa");
	}
}
