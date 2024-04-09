import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
	
		int lados;

		do{

			lados = pedirInt("Inserte cuanto medira la matriz cuadrada: ");

			if(lados <= 1){

				System.out.println("\nLas matrices tienen que ser como minimo 2x2\n");

			}

		}while(lados <= 1);

		int[][] matriz = generarMatriz(lados);
		
		System.out.println(matriz);

	}

	public static int pedirInt(String enunciado){
		Scanner patata = new Scanner(System.in);

		int numero = 0;
		
		System.out.print(enunciado);

		try{

			numero = Integer.parseInt(patata.nextLine().trim());

		}catch(Exception e){

			System.out.println("Error: inserte un numero.");

		}

		return numero;

	}
	
	public static int[][] generarMatriz(int lados){

		int[][] matriz = new int[lados][lados];

		for(int i = 0; i < lados; i++){

			for(int j = 0; j < lados; j++){

				System.out.print(matriz[i][j]+ " ");

			}

			System.out.println();

		}
	
		return matriz;	

	}

}
