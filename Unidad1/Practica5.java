import java.util.Scanner; //libreria para que funcione Scanner
public class Practica5 {
    public static void main(String[] args){
     
    Scanner sc = new Scanner(System.in); //para escribir
    
    System.out.print("Introduce un numero al azar:");//pregunta que hace donde tendras que escribir
        int a = sc.nextInt(); //la variable va debajo de System.out.print()
    System.out.print("Introduce otro numero al azar: ");
        int b = sc.nextInt(); //si la variable es int,entonces =sc.nextInt | si la variable es String, entonces =sc.nextLine()
 
        int resultado = a*b;
    System.out.println("La multiplicacion da " + resultado); //finalmente la respuesta
    }
}
