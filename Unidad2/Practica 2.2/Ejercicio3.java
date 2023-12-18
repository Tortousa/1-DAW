import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner patata = new Scanner(System.in);
    
        System.out.println("Inserte 8 numeros enteros.");
        
    
        int suma = 0; //suma empieza en 0

        for(int i = 1; i <=8; i++){ //empieza en 1 y termina en 8
            System.out.print("Numero "+i+": "); //va preguntando uno por uno hasta llegar a 8
            int numero = patata.nextInt();
            suma += numero; //va sumando cada valor
        }
    
        System.out.println("La suma total es "+suma);

    }
}
