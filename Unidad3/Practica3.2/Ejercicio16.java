public class Ejercicio16 {
    public static void main(String[] args) {
        int[][] matriz = {
                {0, 2, 4, 0, 9, 5},
                {7, 1, 3, 3, 2, 1},
                {1, 3, 9, 8, 5, 6},
                {4, 6, 7, 9, 1, 0}
        };

        int[][] submatrizMaxima = maxima3(matriz);

        System.out.println("La submatriz máxima es:");
        for (int i = 0; i < submatrizMaxima.length; i++) {
            for (int j = 0; j < submatrizMaxima[0].length; j++) {
                System.out.print(submatrizMaxima[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] maxima3(int[][] matriz) {
        int maxSuma = Integer.MIN_VALUE;
        int mejorFila = 0;
        int mejorColum = 0;

        for (int fila = 0; fila < matriz.length - 2; fila++) {
            for (int colum = 0; colum < matriz[0].length - 2; colum++) {
                int suma = matriz[fila][colum] +
                        matriz[fila][colum + 1] +
                        matriz[fila][colum + 2] +
                        matriz[fila + 1][colum] +
                        matriz[fila + 1][colum + 1] +
                        matriz[fila + 1][colum + 2] +
                        matriz[fila + 2][colum] +
                        matriz[fila + 2][colum + 1] +
                        matriz[fila + 2][colum + 2];

                if (suma > maxSuma) {
                    maxSuma = suma;
                    mejorFila = fila;
                    mejorColum = colum;
                }
            }
        }

        int[][] submatrizMaxima = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                submatrizMaxima[i][j] = matriz[mejorFila + i][mejorColum + j];
            }
        }
        return submatrizMaxima;
    }
}


