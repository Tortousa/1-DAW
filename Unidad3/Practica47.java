
import java.util.Scanner;
public class Practica47 {
    
	public static final Scanner patata = new Scanner(System.in);
    
	public static final String NOMBRE = "Dani Tortosa";
	public static final String EMAIL = "danielltortosa@gmail.com";
    public static final int HORA_NORMAL = 15;
	public static final int HORA_EXTRA = 22;
	public static final int LIMITE = 35;
	

	public static void main(String args[]) {     

		System.out.print("Inserte las horas trabajadas: ");
		int horas = patata.nextInt();
        
		int salario = calcularSalario(horas);
		System.out.println(salario);

    }
	// crear un metodo calcularSalario() que reciba un entero como parametro correspondiente a las horas trabajadas, y devuelva el sueldo correspondiente, teniendo en cuenta que, cada hora se paga a 15 euros hasta el limite de 35 horas; las siguientes horas se pagan a 22 euros.
	public static int calcularSalario(int horas){
		int salario = 0;
		
		if(horas<=0){
			System.out.println("No has trabajado, vago");
		} else if (horas>=0 && horas<=LIMITE){
			salario = horas*HORA_NORMAL;
		} else if (horas>LIMITE){
			salario = LIMITE*HORA_NORMAL;
			salario += (horas - LIMITE)*HORA_EXTRA;
		}
		return salario;
	}
}
