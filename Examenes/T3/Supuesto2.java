/*
Daniel Tortosa Burtseva 3-12-24
Programa donde busco el indice de la secuencia dentro del vector principal usando metodos.

*/
public class Supuesto2 {
	public static void main(String[] args) {
		int[] vector = {3, 5, 1, 4, 6, 7, 9};
		int[] secuencia = {4, 6, 7};

		int resultado = buscarSecuenciaInt(vector, secuencia);

		if(resultado == -1) {
			System.out.println("Algun array esta vacio o nulo.");
		} else {
			System.out.print("Vector: ");
			mostrarArray(vector);

			System.out.print("Secuencia: ");
			mostrarArray(secuencia);

			System.out.println("La secuencia empieza en el indice " + resultado);
		}
	}

	/*
	Metodo busca el indice donde empieza la secuencia dentro del vector principal

	@param vector: paso por parametro el vector principal
	@param secuencia: paso por parametro la secuencia que estara dentro del vector principal
	@return array: devuelve el indice de la posicion si es true, o -1 si es false o algun array nulo o vacio.
	*/

	public static int buscarSecuenciaInt(int[] vector, int[] secuencia) {
		boolean check;

		if(vector == null || vector.length == 0 || secuencia == null || secuencia.length == 0) {
			return -1;
		}

		for(int i = 0; i < vector.length; i++) {
			check = true;

			for(int j = 0; j < secuencia.length - 1; j++) {
				if(vector[i + j] != secuencia[j]) {
					check = false;
					break;
				}
			}
			if(check) {
				return i;
			}
		}
		return -1;
	}

	/*
	Metodo que muestra el array

	@param array: paso por parametro el array que esta en el main
	*/

	public static void mostrarArray(int[] array) {
		for(int i : array) {
			System.out.print("[" + i + "]");
		}
		System.out.println();
	}
}
