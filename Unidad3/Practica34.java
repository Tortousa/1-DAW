import java.util.Scanner;

public class Practica34 {
    public static void main(String args[]) {     
        Scanner patata = new Scanner(System.in);
        
        System.out.print("Introduce un nombre: ");
        String nombre = patata.nextLine();

        System.out.print("Introduce un apellido: ");
        String apellido = patata.nextLine();

        System.out.print("Introduce una edad: ");
        int edad = patata.nextInt();

        mostrarInfo(nombre,apellido,edad);
    }
        public static void mostrarInfo(String nombre, String apellido, int edad){

                System.out.print(nombre + " "+ apellido);
                comprobar(edad);            
            
        }
        //crear un metodo que compruebe si la edad no es valida
        public static void comprobar(int edad){
            if(edad<0){
                System.out.println(" (edad no valida)");
            } else {
                System.out.println(" ("+ edad+ " años)");
            }
        }
}
