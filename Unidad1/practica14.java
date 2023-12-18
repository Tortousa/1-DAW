//valor ternario

import java.util.Scanner;
public class practica14 {
    public static void main(String[] args){
     
    Scanner patata = new Scanner(System.in);
    
    System.out.print("Di una edad: ");
        int edad = patata.nextInt();
    
        String mayor = (edad>=18) ? "Si" : "No";
    

    System.out.println("Es mayor de edad? " + mayor);

    System.out.println("Fin del programa");
  }
}
