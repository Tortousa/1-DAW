//*Escribe un método que se llame buscarInt() que recibe un vector de enteros y un valor a buscar dentro del vector. Devuelve el índice de la primera ocurrencia dentro del vector proporcionado.
//*Por ejemplo: {3, 2, 3, 4, 7, 2, 4} si se busca 4 devolvería 3.
//*Hay que recorrer el vector secuencialmente y si se encuentra hay que terminar sin llegar al final del recorrido.

public class Ejercicio10 {
    public static void main(String args[]){
		int[] vector = {3,2,3,4,7,2,4};
		int valor = 4;

		int resultado =  buscarInt(vector, valor);
		System.out.print("Valor " + valor + " se encuentra en la posicion " + resultado);

    }
	public static int buscarInt(int[] vector, int valor){
		for(int i = 0; i < vector.length; i++){
			if(vector[i] == valor){
				return i;
			}
		}
		return -1;
	}
}