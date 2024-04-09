import java.util.Scanner;
public class RepasoArray4 {
    public static void main(String args[]) {     
        Scanner patata = new Scanner(System.in);
        int[] array = new int[11];
        int mayor;
        int menor;
		
        for(int i = 1; i < array.length; i++){
            System.out.print("Inserte el "+i+ "º numero entero: ");
            array[i] = patata.nextInt();
        }
		
		mayor=menor=array[0];

		for(int j=1; j<array.length; j++){
			if(array[j]>mayor){
				mayor=array[j];
			} else if (array[j]<menor){
				menor=array[j];
			}

		}
        System.out.println("Mayor "+mayor);
        System.out.println("Menor "+menor);
    }
}
