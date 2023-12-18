import java.util.Scanner;
public class Practica29 {
	public static void main(String[] args) {
		Scanner patata = new Scanner(System.in);

        System.out.print("Inserta el numero de filas: ");
            int lineas = patata.nextInt();

	    for(int i=1; i < lineas; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
	
    System.out.println("\nFin del programa");
		
	}

}
