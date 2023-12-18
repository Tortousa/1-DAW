import java.util.Scanner;
public class Practica12 {
    public static void main(String[] args){
     
    Scanner patata = new Scanner(System.in);
    
    System.out.print("Introduce un numero:");
        int n1 = patata.nextInt();
    
    System.out.print("Introduce otro numero:");
        int n2 = patata.nextInt();
    if (n1 > n2) 
    {
    System.out.println(n1 + " es mayor que " + n2);
    } 
        else if (n2 > n1)
    {
        System.out.print(n2 + " es mayor que " + n1);
            }
    else 
    {
        System.out.print("Ambos numeros son iguales");
    }
  }
}
