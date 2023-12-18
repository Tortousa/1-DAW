//Pedir un numero entrero y guardarlo en una variable
//Crear un bucle for que empiece en 1 y de tantas vueltas como valor tenga la variable
import java.util.Scanner;
public class practica16 {
	public static void main(String argumentos[]) {
        Scanner patata = new Scanner(System.in);  
        
        System.out.println("Introduce el numero de veces que quieres que se repita el bucle: ");
        int numero = patata.nextInt();
  
        if(numero >= 0)
        {
            for(int i = 1; i<= numero; i++)
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

