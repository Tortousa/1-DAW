//Crea un programa que solicite al usuario una calificación numérica (de 0 a 100) y luego muestre su calificación en letras según la siguiente escala:
//A: 9-10 B: 7-(<9) C: 6-(<7) D: 5-(<6) F: 0-(<5)

import java.util.Scanner;
public class NotaALetra {
    public static void main(String[] args){
     
    Scanner patata = new Scanner(System.in);
    
    System.out.print("Introduce una nota:");
        double n1 = patata.nextDouble();

    if (n1>=0 && n1<5)
    {
    System.out.println("F");
    } 
    else if (n1>=5 && n1<6)
    {
    System.out.println("D");
    }
    else if (n1>=6 && n1<7)
    {
    System.out.println("C");
    }
    else if (n1>=7 && n1<9)
    {
    System.out.println("B");
    }
    else if (n1>=9 && n1<=10)
    {
    System.out.println("A");
    }
        else 
    {
        System.out.println("Condicion no valida");
    }
    System.out.println("Fin del programa");
  }
}
