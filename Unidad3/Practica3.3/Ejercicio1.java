/*
Escribe un método llamado fibonacci() utilizando programación por contrato que reciba un entero y devuelva el valor que le corresponde en la sucesión de Fibonacci.
El método fibonacci() calcula su valor de la siguiente manera:
Si el número recibido es un 1, la sucesión vale 1; si es un 2, la sucesión vale 2.
Para los sucesivos términos, se obtienen sumando los dos términos anteriores.
Por ejemplo, para el término 5 el valor es la suma del término para n=4 más el término para n=3.
Prueba el método pedido desde main(). Hay que tener en cuenta que en la programación por responsabilidades main() es la responsable de llamar a fibonacci() con valores válidos.
Deben seguirse los principios y estilo del código limpio.
*/

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
	
		int digito;

		do{

			digito = pedirInt("Inserte un numero entero positivo: ");

			if(digito <= 0){

				System.out.println("\nIncorrecto. Vuelve a probar\n");

			}

		}while(digito <= 0);

		int resultado = fibonacci(digito);
		System.out.println(resultado+" ");


	}

	public static int pedirInt(String enunciado){
		Scanner patata = new Scanner(System.in);

		int numero = 0;
		
		System.out.print(enunciado);

		try{

			numero = Integer.parseInt(patata.nextLine().trim());

		}catch(Exception e){

			System.out.println("\nError: inserte un numero.");

		}

		return numero;

	}
	
	public static int fibonacci(int digito) {
        
		if (digito <= 1) {
		
            return digito;

        } else {

            return fibonacci(digito - 1) + fibonacci(digito - 2);

        }

    }

}



