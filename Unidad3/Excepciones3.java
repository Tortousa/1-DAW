import java.util.Scanner;
public class Excepciones3 {
	
    public static Scanner patata = new Scanner(System.in);

    public static void main(String[] args){

		int numero = pedirInt("Introduce un numero: ");

		System.out.println("El numero introducido es "+numero);
		
	}
    public static int pedirInt(String enunciado){
        int numero;

        System.out.print(enunciado);
        try{
            numero = patata.nextInt();
        }catch(Exception e){
            System.out.println("Error, no has introducido un numero!");
            numero = -1;
        }
        return numero;
    }
}
