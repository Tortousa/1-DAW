import java.lang.Math;
import java.util.Scanner;

public class Ejercicio9 {
	
	public static double d;
	
	public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);
		double a, b, c;

		System.out.println("Dada la formula de segundo grado ax²+bx+c=0");
		System.out.print("Inserte el numero a: ");
			a = patata.nextDouble();
		System.out.print("Inserte el numero b: ");
			b = patata.nextDouble();
		System.out.print("Inserte el numero c: ");
			c = patata.nextDouble();

		evaluarDiscriminante(a, b, c);
        
    }
    public static void evaluarDiscriminante(double a, double b, double c){
        double x1, x2, real, imaginario;
		
		d = b*b - 4*a*c;

		if(d>0){
			x1 = (-b +Math.sqrt(d)) / (2*a);
			x2 = (-b -Math.sqrt(d)) / (2*a);
            System.out.println("El resultado de la ecuacion es: "+x1+", "+x2);
		}else if(d==0){
            x1 = -b/(2*a);
            System.out.println("El resultado de la ecuacion es "+x1+" dos veces");
        
        }else if(d<0){
			real = -b / (2 * a);
            imaginario = Math.sqrt(Math.abs(d)) / (2 * a);
            System.out.println("La ecuación tiene soluciones complejas: "+real+" +"+imaginario+"i y "+real+" -"+imaginario+"i");
        }
    }
}


