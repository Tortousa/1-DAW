public class OrdenamientoBurbujaEstrella {
    public static void main(String args[]) {     
        
        int [] numeros = {0,4,2,3,4,5,6,7,8,9};
        //obtener mayor
        int mayor = numeros[0];
        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] > mayor) {
            mayor = numeros[i];
            }
        }
        //mostrar numeros
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
        for(int i = 0; i < numeros.length; i++){
            for(int j = 1; j <= numeros[i]; j++) {
                System.out.print("* ");
            }
            System.out.println();
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
        //estrellas invertidas en funcion del numero mas grande
        for(int i = 0; i < numeros.length; i++){
            for(int j = 1; j <= mayor-numeros[i]; j++) {
                System.out.print("* ");
            }
            System.out.println("  ");
        }
    }
}

