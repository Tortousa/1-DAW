
import java.util.Scanner;
public class Practica32 {
    public static void main(String args[]) {     
        Scanner patata = new Scanner(System.in);
        
        System.out.print("Introduce el numero de la tabla de multiplicar que quieras: ");
        int num = patata.nextInt();
        
        //llamada al metodo tabla()
        tabla(num);

        System.out.print("Introduce otro numero de la tabla de multiplicar que quieras: ");
        num = patata.nextInt();
        
        tabla(num);
    }
    
    //OTRA FORMA DE REPETIR EL CODIGO ES CREAR UN METODO, SIEMPRE ENTRE LA CLASE Y EL MAIN()
    public static void tabla (int patata){
        System.out.println("Tabla del "+ patata);

        for(int i = 1; i<=10; i++){
        System.out.println(i+" x "+patata+" = "+(i*patata));
        }
    }
        

}

