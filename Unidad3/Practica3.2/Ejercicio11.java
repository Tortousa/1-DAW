import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner patata = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Inserte 10 numeros y mostraremos cuantos numeros consecutivos se ha insertado.");

        for(int i=0; i<array.length;i++){
            System.out.print((i+1)+". Numero: ");
            array[i] = patata.nextInt();
        }

		int resultado = contarIntConsecutivos(array);
		System.out.println("Numeros consecutivos: "+resultado);

    }
    public static int contarIntConsecutivos(int array[]){
        int consecutivos = 1;
		int max = 0;

		if(array.length==0){
			return 0;
		}else{
		    for(int i=1;i<array.length; i++){
		       if(array[i]==array[i-1]+1){
					consecutivos++;
				}
		    }
		}
		return consecutivos;
    }
}
