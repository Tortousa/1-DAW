/*
Escribe un programa que pida números continuamente y guarde el mayor y el menor para mostrarlos al finalizar el programa.
Tambien hay que mostrar la cantidad de números introducidos por el usuario.
El programa termina al pulsar 0 y confirmar con la letra T.

Daniel Tortosa Burtseva 19-11-2024
*/

import java.util.Scanner;

public class Supuesto2_1 {
    
    public static Scanner patata = new Scanner(System.in);
    
    public static void main(String[] args) {

        boolean check = false;
		String seguir = "";
        int mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, n, cont = 0; //Integer.MAX_VALUE y MIN_VALUE hacen que se compare posteriermente con estos valores.

        do{
            n = pedirInt("Introduce un numero: ");

			if(n > 0 || n < 0){
				cont++;

				if(cont < 2){
					System.out.println("Tienes que introducir minimo 2 numeros.");
					continue;
				}else{
					if(n > mayor){
                		mayor = n;
            		}
            		if(n < menor){
						menor = n;
           			}
				}
			}
		
			if(n == 0){
				System.out.print("Puelsa T confirmar la accion de salir: ");
				seguir = patata.nextLine().trim();

				if(seguir.equalsIgnoreCase("T")){
					System.out.println("Has cerrado el programa");
					check = true; //el programa dermina cuando cambio a true
				}else{
					continue;
				}
			}
        }while(!check);

        System.out.println("Numero mayor: " + mayor);
		System.out.println("Numero menor: " + menor);
		System.out.println("Numeros insertados: " + cont);


    }
    public static int pedirInt(String enunciado){ //Sorpresa de nuevo
        boolean check = false;
        int n = 0;

        do{
            System.out.print(enunciado);

            try{
                n = Integer.parseInt(patata.nextLine().trim());
                check = true;
            }catch(Exception e){
                 System.out.println("Error,introduceun numero.");
            }
        }while(!check);

        return n;
        
    }
}
