//! No estoy conforme con el resultado, ya que no abarca todos los casos y en mi nivel actual no se puede hacer de otra forma.
/*
//* Escribe un método que se llame compararVectoresChar() que recibe dos vectores de caracteres. Devuelve 0 si son iguales, 1 si el primero es mayor y -1 si el primero es menor.
//* El orden alfabético de vectores de caracteres requiere la comparación uno a uno de sus caracteres, comenzando desde el extremo izquierdo.
//* El orden alfabético corresponde al orden numérico creciente del código del carácter.
*/
public class Ejercicio9 {
    public static void main(String[] args){
		char[] vector1 = {'H','a','l','a','b'};
		char[] vector2 = {'H','o','l','a'};

		int resultado = compararVectoresChar(vector1, vector2);
		System.out.println(resultado);

    }
	public static int compararVectoresChar(char[] vector1, char[] vector2){
		int resultado = 0;

		int length1 = vector1.length;
		int length2 = vector2.length;
		int minLength = Math.min(length1, length2);

		for(int i = 0; i < minLength; i++){
			if(vector1[i] > vector2[i]){
				resultado = 1;
			}
			if(vector1[i] < vector2[i]){
				resultado = -1;
			}
		}

		if(resultado == 0){
			if(length1 == length2){
				return 0;
			}
			return length1 > length2 ? 1 : -1;
		}
		return resultado;

	}
}



