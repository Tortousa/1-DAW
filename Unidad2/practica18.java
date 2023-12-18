import java.util.Scanner;
public class practica18 {
	public static void main(String argumentos[]) {
        Scanner patata = new Scanner(System.in);  
        
        System.out.println("Introduce el numero de inicio del bucle: ");
        int inicio = patata.nextInt();
        
        System.out.println("Introduce el numero de finalizacion del bucle: ");
        int fin = patata.nextInt();
        
        int contador = 0;

        for(int i = inicio; i<= fin; i++)
	    {
			System.out.println("Vuelta " + i);
            contador++;

            if(contador >=20)//termina en el numero 20
            {
            break;
            }
                System.out.println("Vueltas totales " + contador);
		} 
            
                System.out.println("Fin del programa\n");
    }
}

