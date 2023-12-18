import java.util.Scanner;
public class MayorDeDos {
    public static void main(String[] args){
     
    Scanner patata = new Scanner(System.in);
    
    System.out.print("Introduce un numero:");
        int n1 = patata.nextInt();
    
    System.out.print("Introduce otro numero:");
        int n2 = patata.nextInt();
    if (n1 > n2) 
    {
    System.out.println(n1 + " es el mayor");
    } 
        else if (n2 > n1)
    {
        System.out.println(n2 + " es el mayor");
            }
    else 
    {
        System.out.println("Ambos numeros son iguales");
    }
  }
}
