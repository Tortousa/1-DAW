/*
 * Escribe un programa para calcular los salarios semanales de empleados a los que se les paga 15 euros por hora hasta el limite de las 35 horas.
 * Cada hora por encima de 35 se considerará extra y se paga a 22 €.
 * El programa pide las horas del trabajador, realiza el calculo, muestra el resultado y vuelve a pedir otro si se quiere seguir.
 * El salario que se le debe pagar se calcula utilizando un método especializado llamado calcularSalario().
 * El método calcularSalario() recibe las horas como parámetro y devuelve el sueldo que corresponde.
 */
import java.util.Scanner;

public class Ejercicio1 {
	public static Scanner patata = new Scanner(System.in);
	public static final int HORAS_LIMITE = 35;
	public static final int EXTRA = 22;
	public static final int PAGA = 15;

	public static void main(String[] args) {
		int horas, salario = 0;
		String seguir = "";

		do {
			do {
				horas = pedirInt("Introduce las horas trabajadas: ");

				if (horas <= 0) {
					System.out.println("No has trabajado.");
				}
			}while(horas <= 0);
		
			salario = calcularSalario(horas);
			System.out.println("Tu salario por " + horas + "h trabajadas es de " + salario + "€");

			seguir = pedirString("Deseas seguir introduciendo horas?(S/n): ");
		} while (seguir.equalsIgnoreCase("S"));

		System.out.println("Fin del programa.");
	}

	public static int calcularSalario(int horas) {
		int horasExtra;

		if (horas <= HORAS_LIMITE) {
			return PAGA * horas;
		} else {
			horasExtra = horas - HORAS_LIMITE;
			return (horasExtra * EXTRA) + (HORAS_LIMITE * PAGA);
		}
	}

	public static int pedirInt(String enunciado) {
		int n = 0;
		boolean check = false;

		do {
			System.out.print(enunciado);

			try {
				n = Integer.parseInt(patata.nextLine().trim());
				check = true;

			} catch (Exception e) {
				System.out.println("Error: inserte un numero entero.");

			}
		} while (!check);
		return n;
	}

	public static String pedirString(String enunciado) {
		System.out.print(enunciado);
		return patata.nextLine().trim();
	}
}