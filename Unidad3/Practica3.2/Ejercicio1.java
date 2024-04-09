/*
Escribe un programa para calcular los salarios semanales de empleados a los que se les paga 15 euros por hora hasta el limite de las 35 horas. Cada hora por encima de 35 se considerará extra y se paga a 22 €
El programa pide las horas del trabajador, realiza el calculo, muestra el resultado y vuelve a pedir otro si se quiere seguir. El salario que se le debe pagar se calcula utilizando un método especializado llamado calcularSalario()
El método calcularSalario() recibe las horas como parámetro y devuelve el sueldo que corresponde
Deben seguirse los principios y estilo del código limpio
*/
import java.util.Scanner;

public class Ejercicio1 {
	
	public static final Scanner patata = new Scanner(System.in);
	public static void main(String args[]){
		final int SALARIO = 15;
		final int HORAS_LIMITE = 35;
		final int EXTRA = 22;
		String seguir = "";

		do{
			int horasTrabajadas = pedirInt("Introduce las horas trabajadas: ");

			int resultado = calcularSalario(SALARIO, HORAS_LIMITE, EXTRA, horasTrabajadas);
			System.out.print("Cobrara " + resultado + "€ por haber trabajado " + horasTrabajadas + " horas.");

			System.out.print("\nDesea seguir introduciendo horas trabajadas? (S/n): ");
			seguir = patata.nextLine().trim();

		}while(seguir.equalsIgnoreCase("S"));

		System.out.print("\nFin");
	}
	public static int calcularSalario(int SALARIO, int HORA_LIMITE, int EXTRA, int horasTrabajadas){
		int salarioFinal = 0;

		if(horasTrabajadas <= 0){
			return 0;
		}
		if(horasTrabajadas > 0 && horasTrabajadas <= HORA_LIMITE){

			salarioFinal = horasTrabajadas * SALARIO;

		}else if(horasTrabajadas > HORA_LIMITE){

			int salarioExtra = (horasTrabajadas - HORA_LIMITE) * EXTRA;
			int salarioTope = SALARIO * HORA_LIMITE;

			salarioFinal = salarioExtra + salarioTope;
		}
		return salarioFinal;
	}
	public static int pedirInt(String enunciado){
		int num = 0;

		System.out.print(enunciado);

		try{

			num = Integer.parseInt(patata.nextLine().trim());

		}catch(Exception e){

			System.out.println("Error: no has insertado un numero entero");

		}
		return num;
	}
}

