import java.util.Scanner;
public class MayorDeTres {
    public static void main(String[] args){
     
    Scanner patata = new Scanner(System.in);
    
    System.out.print("Introduce el primer numero:");//pido que me escriba el primer numero
        int n1 = patata.nextInt();
    
    System.out.print("Introduce el segundo numero:");//pido que me escriba el segundo numero
        int n2 = patata.nextInt();
    
    System.out.print("Introduce el tercer numero:");//pido que me escriba el tercer numero
        int n3 = patata.nextInt();

    if (n1 >= n2 && n1 >= n3) //Para que el primer numero sea el mayor:el primer numero tiene que ser mayor que el segundo y a su vez (&&) mayor que el tercero
    {
    System.out.println("El primer numero: " + n1 + " es el mayor");
    } 
    else if (n2 >= n1 && n2 >= n3)//Para que el segundo numero sea el mayor:el segundo numero tiene que ser mayor que el primero y a su vez (&&) mayor que el tercero
    {
        System.out.println("El segundo numero: " + n2 + " es el mayor");
    }
    else if (n3 >= n1 && n3 >= n2)//Para que el tercer numero sea el mayor:el tercer numero tiene que ser mayor que el primero y a su vez (&&) mayor que el segundo
    {
        System.out.println("El tercer numero: " + n3 + " es el mayor");
    }
    else 
    {
        System.out.println("Son iguales los tres");//si es otro caso que no he especificado arriba,escribirá esto en la consola.
    }

    System.out.println("\nFin del programa");
  }
}
