//Muestra el numero de vueltas que esta dando y que pregunte al usuario si quiere seguir mostrando vuletas, pilsando la "s". Cuando salga del bucle debe mostrar la cantidad de vueltas que ha dado.
import java.util.Scanner;

public class Practica31 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        
        int i = 0;
        String continuar = "s";

        while(continuar.equalsIgnoreCase("S")) {
            i++;
            System.out.println("Vuelta " + i);
            System.out.print("Desea dar otra vuelta? (S/N) ");
            continuar = teclado.nextLine();
        }
         System.out.println("Has dado " + i + " vueltas");
		
	}

}
