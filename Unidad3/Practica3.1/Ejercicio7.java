public class Ejercicio7 {
    public static void main(String[] args) {
        int[] vector = {1, 11, 2, 2, 3, 4, 5, 2, 6, 7, 8, 2};
        int numero = 2;
        int frecuencia = frecuenciaNumero(vector, numero);
        
        System.out.print("Numeros del vector: ");
        
        for(int a : vector){
            System.out.print(a+", ");
        }
        
        System.out.print("\nNumero a comparar: "+ numero);

        System.out.println("\nEl numero " + numero + " aparece " + frecuencia + " veces");
    }

    public static int frecuenciaNumero(int[] vector, int numero) {
        int frecuencia = 0;
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numero) {
                frecuencia++;
            }
        }
        
        return frecuencia;
    }
}


