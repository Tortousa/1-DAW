import java.util.Scanner;
	public class Ejercicio8 {
		public static void main(String[] args){
			Scanner teclado = new Scanner(System.in);

            System.out.println("Introduce un numero entero positivo: "); //pido que me escriba un numero
			int n = teclado.nextInt(); //declaro la variable para que sea posible escribir

			if (n >= 0) { //si el numero escrito es positivo,se muestra en pantalla lo siguiente:
				for(int i=0; i<=10; i++) { //iniciamos desde el 0 hasta el 10 ya que esa suele ser la tabla de multiplicar. En cada ciclo se le suma una unidad a la i.
                    System.out.println(n + " x " + i + " = " + n*i);//muestra el resultado
                }
			}
			else { //si el numero es menor de 0 (no declarado), se muestra este mensaje:
				System.out.println("Numero ingresado no valido");
			}
			System.out.println("Fin del programa");
	}
}
