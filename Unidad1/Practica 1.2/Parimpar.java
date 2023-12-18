//Par es cuando la division de dos numeros da resto 0
//Impar es cuando la division de dos numeros da resto 1
//int result= 5%2, se usa el porcentaje


import java.util.Scanner;
public class Parimpar {
    public static void main(String[] args){
     
    Scanner patata = new Scanner(System.in);
    
    System.out.print("Introduce un numero:");
        int n1 = patata.nextInt();

    //uso el comando if y else. Pongo una condicion en if. Si esta condicion no se cumple, con el comando else, haria lo contrario de este.
    if (n1%2==0) //el numero que hayamos elegido entre 2 tiene que dar resto 0 ya que esa es la condicion de un numero par.
    {
    System.out.println(n1 + " es par"); // si se cumple, la consola mostraria este mensaje.
    } 
        else //el numero que hayamos elegido entre 2 tiene que dar resto distinto de 0 ya que esa es la condicion de un numero impar.
    {
        System.out.println(n1 + " es impar"); //si no se cumple, la consola mostraria este comando.
            }
    System.out.println("Fin del programa"); //Indicamos la finalizacion del programa.
  }
}
