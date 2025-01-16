/*
Crear un programa que dibuje un termometro. Donde representa los grados negativos y positivos con una #, en el grado 0 hay una barra que los separa.

Daniel Tortosa Burtseva 19-11-2024
*/

public class Supuesto2_2 {
    public static void main(String[] args) {

        int[] array = {6, 5, -4, 3, -1, 3, -21, 12};
		String dibujo;
        int barras;
		final int MARGEN_SUPERIOR = 20;
        final int MARGEN_INFERIOR = -20;

		for(int i = 0; i < array.length; i++){
			System.out.print("[" + array[i] + "]");
		}

		System.out.println();
      

        for (int i = 0; i < array.length; i++) {
            dibujo = "";

            if (array[i] < MARGEN_INFERIOR || array[i] > MARGEN_SUPERIOR) {
                System.out.println("Valor fuera de rango: " + array[i]);
                continue;
            }

            if (array[i] < 0) {
                barras = Math.abs(array[i]);
                for (int j = 0; j < MARGEN_SUPERIOR - barras; j++) {
                    dibujo += " ";
                }
                for (int j = 0; j < barras; j++) {
                    dibujo += "#";
                }
                dibujo += "|";
            } else {
                for (int j = 0; j < MARGEN_SUPERIOR; j++) {
                    dibujo += " ";
                }
                dibujo += "|";
                barras = array[i];
                for (int j = 0; j < barras; j++) {
                    dibujo += "#";
                }
            }
            System.out.println(dibujo);
        }
	}

}
