import java.util.Scanner;
	public class Practica35 	{
		public static void main(String argumentos[]) {
        Scanner patata = new Scanner(System.in);

        System.out.print("Introduce la medida de un lado: ");
        int lado = patata.nextInt();
            
        cuadrado(lado);

        System.out.print("Introduce la medida de un lado: ");
        lado = patata.nextInt();

        cuadrado(lado);
            
	}
        public static void cuadrado(int patata){
            int lado = patata;
            if(lado > 0){
                for(int i = 1; i <= lado; i++){
                    for(int j = 1; j <= lado; j++){
                        if(i==1 || i==lado || j == 1 || j==lado){
                           System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
            } else {
                System.out.print("  ");
            }

        }
}
