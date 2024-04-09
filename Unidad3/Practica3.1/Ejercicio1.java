import java.util.Scanner;
	public class Ejercicio1 	{
		public static void main(String argumentos[]) {

			mostrarMultiplicacion1();
			
		}
        public static void mostrarMultiplicacion1(){
            Scanner teclado = new Scanner(System.in);
			final int TOPE = 16  ; 				
			int mult  ;							
			int cont  ;							

			
			mult = 0 ;
			cont = 0 ;

			System.out.println("\t Múltiplos de 2\n");
			while (mult < TOPE)					
			{
				mult = cont * 2;
				System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
				++cont;
			}
        }
	}
