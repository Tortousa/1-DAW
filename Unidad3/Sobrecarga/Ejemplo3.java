//Crear dos metodos llamados pedirInt()
//El primero No recibe parametros, pide un entero por teclado y lo devuelve
//El segundo recibe un String a modo de enunciado, pide un entero por teclado y lo devuelve


import java.util.Scanner;


public class Ejemplo3 {

public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Introduce el primer numero: ");
        int numero1 = pedirInt();

        int numero2 = pedirInt("Introduce el segundo numero: ");

        System.out.print("1. Numero: "+ numero1);
        System.out.print("2. Numero: "+ numero2);

    }
    public static int pedirInt(){
        int numero = teclado.nextInt();
        return numero;


    }
    public static int pedirInt(String enunciado){
        System.out.println(enunciado);
        int numero = teclado.nextInt();
        return numero;



    }     
}
