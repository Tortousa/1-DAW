import java.util.Scanner;
    public class practica24 {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inicio del programa\n");
        
        System.out.print("Indica el tamaño del array: ");
        int tamanyo = teclado.nextInt();

		int[] arrayxdd = new int[tamanyo]; //array tamaño indicado por el usuario

        for(int i = 0; i < arrayxdd.length; i++) {
            System.out.println("Introduce el " + (i+1) + "º numero");
			arrayxdd[i] = teclado.nextInt();
        }
        for(int i = 0; i < arrayxdd.length; i++) {
            System.out.print(arrayxdd[i] + " "); //que escriba en la consola los numeros que se ha indicado anteriormente
        }
        System.out.println("Fin del programa");
    }
}
