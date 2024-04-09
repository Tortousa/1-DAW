import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);

        System.out.print("Inserte un numero: ");
        int n = patata.nextInt();

        if(n<0){
            System.out.println("NUMERO NO VALIDO");
        }else if(n==0){
			System.out.print("Serie de Fibonacci hasta "+n+": "+0);

			System.out.println();
        }else if(n==1){
			System.out.print("Serie de Fibonacci hasta "+n+": "+1);

			System.out.println();
		}else{
            System.out.print("Serie de Fibonacci hasta "+n+": ");

            fibonacci(n);
        
            System.out.println();
        }   
    }
    public static void fibonacci(int n){
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + ", ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
