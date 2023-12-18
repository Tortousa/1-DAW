import java.util.Scanner;
    public class practica22 {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inicio del programa");

        int arrayxd[] = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Cantidad de numeros: " + arrayxd.length);//.length se pone para saber la longitud

        for(int i = 0; i < arrayxd.length; i++) {
            System.out.println(arrayxd[i]);
        }

        System.out.println("Fin del programa");
    }
}
