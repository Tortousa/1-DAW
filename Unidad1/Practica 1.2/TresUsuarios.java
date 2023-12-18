import java.util.Scanner;
public class TresUsuarios {
    public static void main(String[] args){
     
    Scanner patata = new Scanner(System.in);
    
    System.out.println("Introduce los datos de la primera persona");//solicito que rellene lo siguiente:
    
    System.out.print("Nombre:");
        String nombre1 = patata.nextLine();//variable para la primera persona marcada con numero 1
    
    System.out.print("Apellidos:");
        String apellidos1 = patata.nextLine();//variable para la primera persona marcada con numero 1
    
    System.out.print("NIF:");
        String nif1 = patata.nextLine();//variable para la primera persona marcada con numero 1

    System.out.print("Direccion postal:");
        String dpostal1 = patata.nextLine();//variable para la primera persona marcada con numero 1

    
        System.out.println("Introduce los datos de la segunda persona");
    
        System.out.print("Nombre:");
            String nombre2 = patata.nextLine();//variable para la primera persona marcada con numero 2
    
        System.out.print("Apellidos:");
            String apellidos2 = patata.nextLine();//variable para la primera persona marcada con numero 2
    
        System.out.print("NIF:");
            String nif2 = patata.nextLine();//variable para la primera persona marcada con numero 2

        System.out.print("Direccion postal:");
            String dpostal2 = patata.nextLine();//variable para la primera persona marcada con numero 2
            
            System.out.println("Introduce los datos de la tercera persona");
    
            System.out.print("Nombre:");
                String nombre3 = patata.nextLine();//variable para la primera persona marcada con numero 3
    
            System.out.print("Apellidos:");
                String apellidos3 = patata.nextLine();//variable para la primera persona marcada con numero 3
    
            System.out.print("NIF:");
                String nif3 = patata.nextLine();//variable para la primera persona marcada con numero 3

            System.out.print("Direccion postal:");
                String dpostal3 = patata.nextLine();//variable para la primera persona marcada con numero 3
    
    System.out.println();//uso este comando para crear un espacio entre los datos pedidos y la resolucion final
    System.out.println("Persona 3: " + "\nNombre: " + nombre3 + "\nApellidos: " + apellidos3 + "\nNIF "+ nif3 + "\nDireccion Postal: " + dpostal3 );//pido que  me imprima la resolucion con saltos de espacio marcados con \n.
    System.out.println("\nPersona 2: " + "\nNombre: " + nombre2 + "\nApellidos: " + apellidos2 + "\nNIF "+ nif2 + "\nDireccion Postal: " + dpostal2 );
    System.out.println("\nPersona 1: " + "\nNombre: " + nombre1 + "\nApellidos: " + apellidos1 + "\nNIF "+ nif1 + "\nDireccion Postal: " + dpostal1 );

    System.out.println("\nFin del programa");
   
  }
}
