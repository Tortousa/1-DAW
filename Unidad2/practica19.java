import java.util.Scanner;
public class practica19 {
	public static void main(String argumentos[]) {
        Scanner patata = new Scanner(System.in);  
        
        System.out.println("Introduce el numero de vueltas del bucle: ");
        int n = patata.nextInt();
       

        for(int i = 1; i<= n; i++){
			if(i%2 == 1){
                continue;
            }

            System.out.println("Vuelta " + i);
        } 
            
        System.out.println("Fin del programa\n");
    }
}

