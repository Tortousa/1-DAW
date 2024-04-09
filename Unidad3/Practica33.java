import java.util.Scanner;

public class Practica33 {
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
            if(edad<0){
                System.out.println(nombre + " "+ apellido +" (edad no validad)");
            } else {
                System.out.println(nombre + " "+ apellido +", "+edad+" años");
            }
            
        }
}
