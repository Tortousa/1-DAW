import java.util.Scanner;
public class practica17 {
	public static void main(String argumentos[]) {
        Scanner patata = new Scanner(System.in);  
        
        System.out.println("Introduce el numero de inicio del bucle: ");
        int inicio = patata.nextInt();
        
        System.out.println("Introduce el numero de finalizacion del bucle: ");
        int fin = patata.nextInt();

        if(fin >= 0)
        {
            for(int i = inicio; i<= fin; i++)
			{
			System.out.println("Vuelta " + i);
			}
         }
		else
            {  
            System.out.println("Numero no valido");
            }    
            System.out.println("Fin del programa\n");
	}
}

