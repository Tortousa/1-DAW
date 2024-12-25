import java.util.Scanner;

public class TryCatch01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Indica un numero para dividir: ");
		int num1 = teclado.nextInt();
		
		System.out.print("Indica un numero para dividir al numero anterior: ");
		int num2 = teclado.nextInt();
		
		try {
			System.out.println(num1 + "/" + num2 + " = " + (num1/num2) );
		} catch(Exception e) {
			System.out.println("No se puede dividir entre 0");
		}
		System.out.println("FIN DE PROGRAMA");

		teclado.close();
	}
}