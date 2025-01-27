import java.util.Scanner;
import java.lang.Math;
public class Supuesto {
    public static void main(String[] args) {
    int fila = 0;
	int columna = 0;

	do{
		fila = pedirInt("Inserte el numero de filas: ");
		if(fila<=1){
			System.out.println("Inserta un numero mayor de 1");
		}
	}while(fila<=1);

	do{
		columna = pedirInt("Inserte el numero de columnas: ");
		if(columna<=1){
			System.out.println("Inserta un numero mayor de 1");
		}
	}while(columna<=1);

	System.out.println("\nMATRIZ ORIGINAL");

	int[][] matrizOriginal = matriz(fila, columna);

	for (int i=0; i < matrizOriginal.length; i++){
  		for (int j=0; j < matrizOriginal[i].length; j++){
			System.out.print(matrizOriginal[i][j]);
		}
		System.out.println();
	}
	

	}
    public static int pedirInt(String enunciado){
		Scanner patata = new Scanner(System.in);
		int numero = 0;
		boolean check = true;

		System.out.print(enunciado);

		try{
			numero = Integer.parseInt(patata.nextLine().trim());
			check = false;
		}catch(Exception e){
			System.out.println("Error: inserte un numero entero");
		}
		check = true;

	return numero;
    }
	public static int[][] matriz(int fila, int columna){
		int[][] matriz = new int[fila][columna];

		for (int i=0; i < matriz.length; i++){
  			for (int j=0; j < matriz[i].length; j++){
				matriz[i][j] = (int)(Math.random()*10);
			}
		}
		return matriz;
	}
}
