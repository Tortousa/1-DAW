import java.util.Scanner;
public class Factorial {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un numero para calcular el factorial: ");
		int numero = Integer.parseInt(teclado.nextLine().trim());

		int resultado = factorialR(numero);

		System.out.println("El factorial de "+ numero + " es " + resultado);
	}
	// Factorial SIN RECURSIVIDAD
	public static int factorial(int num){
		int acumulado = 1;

		for(int i=1; i<=num; i++){
			acumulado = acumulado * i;
		}
		return acumulado;
	}
	// Factorial CON RECURSIVIDAD
	public static int factorialR(int num){
		if(num>0){
			return num * factorialR(num-1);
		}
		return 1;
	}
}
