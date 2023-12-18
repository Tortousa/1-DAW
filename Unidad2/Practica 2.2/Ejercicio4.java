import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner patata = new Scanner(System.in);
    
        String seguir = "S"; // declaro la letra para seguir escribiendo
        int mayor = Integer.MIN_VALUE; //variable que pone un numero minimo posible
            

        while(seguir.equalsIgnoreCase("S")){ //mientras que se pulse la tecla S (sin importar las mayusculas,minusculas y espacios), permitira continuar
            System.out.print("Inserte un numero entero: ");
                int num = patata.nextInt();

            if(num > mayor){
                mayor = num; //actualiza el numero al mayor
            }
            System.out.print("Desea seguir insertando numeros? (S/N): ");
                seguir = patata.next();
        }
        System.out.println("El mayor de los numeros insertados es " + mayor);
    }
}
