//que solo cuenten los pares usando la variacion de i++ y sin if
import java.util.Scanner;
public class practica20 {
	public static void main(String argumentos[]) {
        Scanner patata = new Scanner(System.in);  
        
        System.out.println("Introduce el numero de vueltas del bucle: ");
        int n = patata.nextInt();
       

        for(int i = 0; i<= n; i+= 2){//i+=2 hace funcion de incrementar en 2 la i

            System.out.println("Vuelta " + i);
        } 
            
        System.out.println("Fin del programa\n");
    }
}

