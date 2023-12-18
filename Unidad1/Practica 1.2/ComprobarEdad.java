import java.util.Scanner;
public class ComprobarEdad {
    public static void main(String[] args){
     
    Scanner patata = new Scanner(System.in);
    
    System.out.print("Introduce una edad:");
        int n1 = patata.nextInt();

    if (n1>=1 && n1<18) //uso el caracter & para definir el parametro entre esos dos puntos
    {
    System.out.println("Eres menor de edad");
    } 
    else if (n1>=18 && n1<65)
    {
    System.out.println("Estas en edad de trabajar");
    }
    else if (n1>=65 && n1<200)
    {
    System.out.println("Estas jubilado");
    }
    else if (n1>=200)
    {
    System.out.println("Estas muerto");
    }
        else //si no cumple ninguno de esos parametros definidos, se ejecutara lo siguiente:
    {
        System.out.println("Edad no valida");
    }
    System.out.println("Fin del programa");
  }
}
