//Escribe un programa que determine si un año ingresado por el usuario es bisiesto o no. Un año
//es bisiesto si es divisible por 4, pero no es divisible por 100, a menos que también sea divisible por 400.

import java.util.Scanner;
public class AñoBisiesto {
    public static void main(String[] args){
     
    Scanner patata = new Scanner(System.in);
    
    System.out.print("Introduce un año del calendario:");
        int n1 = patata.nextInt();

    
    if (n1%4==0 && (n1%100 !=0 || n1%400==0) ) // ! significa "distinto de"
    {
    System.out.println(n1 + " Es bisiesto");
    } 
        else
    {
        System.out.print(n1 + " No es bisiesto");
            }
  }
}
