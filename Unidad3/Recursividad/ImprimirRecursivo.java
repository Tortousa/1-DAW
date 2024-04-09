import java.util.Scanner;
public class ImprimirRecursivo {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce un numero para poner todos los numeros anteriores: ");
		int numero = Integer.parseInt(teclado.nextLine().trim());

		Recursivo(numero);

	}

	public static void Recursivo(int num){
		if(num>0){
            Recursivo(num-1);
			System.out.println(num + " ");
        }
	}
}
