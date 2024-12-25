public class EjercicioBarras {
    public static void main(String[] args) {
        /*int[] array = {6, 5, -4, 3, -1, 3, -11, 12};
        String dibujo;
        int asteriscos;
        int espacios = 10;

        for (int i = 0; i < array.length; i++) {
            dibujo = "";

            if (array[i] < -10 || array[i] > 10) {
                System.out.println("Valor fuera de rango: " + array[i]);
                continue;
            }

            if (array[i] < 0) {
                asteriscos = Math.abs(array[i]);
                for (int j = 0; j < espacios - asteriscos; j++) {
                    dibujo += " ";
                }
                for (int j = 0; j < asteriscos; j++) {
                    dibujo += "*";
                }
                dibujo += "|";
            } else {
                for (int j = 0; j < espacios; j++) {
                    dibujo += " ";
                }
                dibujo += "|";
                asteriscos = array[i];
                for (int j = 0; j < asteriscos; j++) {
                    dibujo += "*";
                }
            }
            System.out.println(dibujo);
        }
        */
        
        final int LIMITE_SUPERIOR = 10;
        final int LIMITE_INFERIOR = -10;

        int margenIzquierdo = Math.abs(LIMITE_INFERIOR);


        final char CARACTER = '*';

        int[] datos = {-9, -2, 4, -6, 6, 11, 5, 2};

        for(int i = 0; i < datos.length; i++){
            int dato = datos[i];

            if(dato > LIMITE_SUPERIOR || dato < LIMITE_INFERIOR){
                System.out.println("Valor " + dato + ": fuera de rango.");
            } else{
                if(dato < 0){
                    for(int j = 0; j < margenIzquierdo + dato; j++){
                        System.out.print(" ");
                    }

                    for(int j = 0; j < Math.abs(dato); j++){
                        System.out.print(CARACTER);
                    }
                } else {
                    for(int j = 0; j < margenIzquierdo; j++){
                        System.out.print(" ");
                    }
                }

                System.out.print("|");

                if(dato > 0){
                    for(int j = 0; j < dato; j++){
                        System.out.print(CARACTER);
                    }

                    for(int j = 0; j < LIMITE_INFERIOR - dato; j++){
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }
        }
    }
}