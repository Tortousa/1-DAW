/*
 * Escribe un método que se llame buscarSecuenciaInt() que recibe dos vectores de enteros, el segundo es una secuencia de valores a buscar en el primer vector.
 * Devuelve el índice donde empieza la primera ocurrencia de la secuencia buscada
 * Por ejemplo: {4, 3, 1, 4, 2, 5, 8} y {4, 2, 5} devolvería 3.
 * Hay que recorrer el vector secuencialmente comprobando coincidencia con el primer elemento de la secuencia buscada.
 * Después hay que comprobar la completamente con otro bucle.
 * Si hay coincidencia completa termina sin llegar al final del recorrido.
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int[] vector = { 4, 3, 1, 5, 4, 2, 5, 8 };
        int[] secuencia = { 4, 2, 5 };

        System.out.print("Vector: ");
        mostrarArray(vector);

        System.out.print("Secuencia: ");
        mostrarArray(secuencia);

        int resultado = buscarSecuenciaInt(vector, secuencia);

        System.out.println("Secuencia inicia en el indice: " + resultado);
    }

    public static int buscarSecuenciaInt(int[] vector, int[] secuencia) {
        boolean check;

        for (int i = 0; i <= vector.length - secuencia.length; i++) {
            check = true;

            for (int j = 0; j < secuencia.length; j++) {
                if (vector[i + j] != secuencia[j]) {
                    check = false;
                    break;
                }
            }

            if (check) {
                return i;
            }
        }
        return -1;
    }

    public static void mostrarArray(int[] array) {
        for (int i : array) {
            System.out.print("[" + i + "]");
        }
        System.out.println();
    }
}
