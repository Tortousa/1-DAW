import java.util.Scanner;
public class OrdenacionMergeSort {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
        
        int[] numeros = {2,5,6,4,3,1,14,9};

        mergeSort(numeros, 0, numeros.length-1);
        
        mostrar(numeros);

        System.out.println();

	}

	public static void mergeSort(int[] numeros, int inicio, int fin){
		if(inicio < fin){
            int centro = (inicio + fin)/2;
            mergeSort(numeros, inicio, centro);
            mergeSort(numeros, centro+1, fin);
            merge(numeros, inicio, centro, fin);
        }
	}
    public static void merge(int[] numeros, int inicio, int centro, int fin){
        int i, j, k;
        int[] auxArray = new int [numeros.length];
        for(i = 0; i<auxArray.length; i++){
            auxArray[i] = numeros[i];
        }
        i = inicio;
        j = centro +1;
        k = inicio;

        while(i <= centro && j <= fin){
            if(auxArray[i]<= auxArray[j]){
                numeros[k++] = auxArray[i++];
            }else{
                numeros[k++] = auxArray[j++];
            }
        }
        while(i<=centro){
            numeros[k++]= auxArray[i++];
        }
    }
    public static void mostrar(int[] numeros){
        for(int i = 0; i< numeros.length; i++){
            System.out.print(numeros[i]+" ");
        }
    }
}
