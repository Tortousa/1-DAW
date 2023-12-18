public class OrdenamientoBurbujaEstrella {
    public static void main(String args[]) {     
        
        int [] numeros = {0,4,2,3,4,5,6,7,8,9};
        
        //mostrar numeros
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
        //ordenamiento burbuja
        for(int i = 1; i < numeros.length; i++){
            for(int j = 0; j < numeros.length-i; j++){
                if(numeros[j] > numeros[j+1]){
                    int aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;

                }

            }

        } 
        //mostrar los numeros ya ordenados
        System.out.println("\n\n");
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i]+ " ");   
        }
        System.out.println("\nGRAFICO DE BARRAS");
        //poner tantas estrellas como numeros en el array
        for(int i = 0; i < numeros.length; i++){
            for(int j = 1; j <= numeros[i]; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

