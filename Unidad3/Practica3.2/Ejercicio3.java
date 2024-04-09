import java.util.Scanner;
public class Ejercicio3 {
    
	public static final Scanner patata = new Scanner(System.in);

    public static void main(String[] args) {
			
		System.out.print("Introduce un numero para mostrar su factorial: ");
        int numero = patata.nextInt();

        long resultado = factorial(numero);
        System.out.println("Factorial de " + numero + " es " + resultado);
        
	}
	public static long factorial(int numero){
	long factorial = 1;	
        for(int i = 1;i <= numero; i++){
            factorial *= i;
        }
    return factorial;
	}
}
