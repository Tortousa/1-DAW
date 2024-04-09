import java.util.Scanner;
	public class Ejercicio2 	{
		public static void main(String argumentos[]) {
            
        final int TOPE = 16  ; 
			
        mostrarMultiplicacion2(TOPE);
			
		}
        public static void mostrarMultiplicacion2(int TOPE){
            Scanner teclado = new Scanner(System.in);
							
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
