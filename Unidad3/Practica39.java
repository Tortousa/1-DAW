
import java.util.Scanner;
public class Practica39 {
    public static void main(String args[]) {     
        Scanner patata = new Scanner(System.in);

        System.out.print("Lado A: ");
        double a = patata.nextDouble();
        System.out.print("Lado B: ");
        double b = patata.nextDouble();
        System.out.print("Lado C: ");
        double c = patata.nextDouble();

        boolean valido = validarTriangulo(a,b,c);
        if(valido){
            String tipo = tipoTriangulo(a,b,c);
            System.out.println("Tipo de triangulo: "+tipo);
        } else {
			System.out.println("Triangulo NO VALIDO");
		}

    }
    public static boolean validarTriangulo(double a, double b, double c){ 
            
        if(a<=0 || b<=0 || c<=0){
            return false; //no valido
        }
        if(a+b<=c || a+c <=b || b+c <= a){
            return true; //es valido ya que supera las condiciones
        }
		return true;
    }
    public static String tipoTriangulo(double a, double b, double c){ 
            
        if(a==b && b==c){ //EQUILATERO
            return "EQUILATERO";
        } else if(a != b && a != c && b != c){
            return "ESCALENO";
        }
		return "ISOSCELES";
    }
}

