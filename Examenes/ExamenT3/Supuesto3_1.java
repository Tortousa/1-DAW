/*
Escribe un programa en Java llamado Supuesto3_1 que muestre un menú el cual se repetirá continuamente hasta que el usuario seleccione la opción 0, para finalizar el programa. Las opciones que mostrará serán las siguientes:

1 - Solicitar datos
2 - Mostrar datos
3 - Ordenar ascendentemente
4 - Ordenar descendentemente
0 - Salir

Al pulsar la opción "1", el programa llamará a un método que pedirá al usuario una cantidad de textos a introducir, entre 5 y 15. En el caso de que la cantidad no fuera válida, deberá insistir hasta que el usuario indique una cantidad válida. Cuando indique la cantidad de textos que quiere, el programa deberá solicitar tantas cadenas de caracteres como cantidad haya indicado y devolver dicha colección de cadenas de caracteres al programa principal.

Al pulsar la opción "2", el programa deberá asegurarse de que se han introducido textos previamente y avisar al usuario en caso contrario. Si hay textos previamente introducidos, el programa llamará a un método que reciba dicha colección de cadenas de caracteres, y las mostrará separadas por el carácter coma y un espacio en blanco ", " a excepción del último elemento que no tendrá esta separación por su derecha.

Al pulsar la opción "3", el programa deberá asegurarse de que se han introducido textos previamente y avisar al usuario en caso contrario. Si hay textos previamente introducidos, el programa llamará a un método que reciba dicha colección de cadenas de caracteres, los ordenará de forma ascendente (alfabéticamente, de menor a mayor) y devolverá esa colección ordenada al programa principal.

Al pulsar la opción "4", el programa deberá asegurarse de que se han introducido textos previamente y avisar al usuario en caso contrario. Si hay textos previamente introducidos, el programa llamará a un método que reciba dicha colección de cadenas de caracteres, los ordenará de forma descendente (de mayor a menor, ordena alfabético inverso) y devolverá esa colección ordenada al programa principal.

Importante: La ordenación de las cadenas de caracteres debe hacerse mediante un método que implemente la lógica de ordenación de los elementos de un array. No se puede emplear el método de ordenación que proporciona los array ni tampoco el método que invierte automáticamente los elementos.

Se debe tener en cuenta que, el programa solo debe finalizar cuando se pulse la opción "0"; si finaliza por cualquier otro motivo, como un error durante la ejecución, penalizará en la calificación. Se deben controlar las excepciones cuando haya entrada por teclado.
*/
import java.util.Scanner;

public class Supuesto3_1 {

    public static String MENU = "\n1 - Solicitar datos\n2 - Mostrar datos\n3 - Ordenar ascendentemente\n4 - Ordenar descendentemente\n0 - Salir";

    public static Scanner patata = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        int cant = 0;
        String[] array = null;

        do {
            System.out.println(MENU);

            do {

                opcion = pedirInt("Inserta la opcion: ");

                if(opcion < 0 || opcion > 4){

                    System.out.println("Vuelve a intentarlo.");

                }

            }while(opcion < 0 || opcion > 4);
        
        
            if(opcion == 1) {

                do {

                cant = pedirInt("Inserta la cantidad de caracteres(5-15): ");

                if(cant < 5 || cant > 15){

                    System.out.println("Vuelve a intentarlo.");

                }

                }while(cant < 5 || cant > 15);

                array = new String[cant];
                System.out.println("Inserta " + cant + " palabras: ");
                insertar(array);
                

            }
            if(opcion == 2) {

                if(array == null) {
                    System.out.println("No hay datos. Intentalo de nuevo.");
                    continue;
                }
                
                System.out.println();

                mostrar(array);

            }
            if(opcion == 3) {

                if(array == null) {
                    System.out.println("No hay datos. Intentalo de nuevo.");
                    continue;
                }

                System.out.println("\nOrdenado ascendentemente");
                ascendente(array);

            }
            if(opcion == 4) {

                if(array == null) {
                    System.out.println("No hay datos. Intentalo de nuevo.");
                    continue;
                }

                System.out.println("\nOrdenado descendentemente");
                descendente(array);

            }
            if(opcion == 0) {

                System.out.println("\nFin del programa");
                break;

            }
        }while(opcion != 0);

    }
    public static int pedirInt(String enunciado) {
        boolean check = false;
        int num = 0;

        do {

            System.out.print(enunciado);

            try {

                num = Integer.parseInt(patata.nextLine().trim());
                check = true;

            } catch(Exception e) {

                System.out.println("Error, inserta un numero.");

            }
        }while(!check);
        return num;

    }
    public static String[] insertar(String[] array) {
        for(int i = 0; i < array.length; i++) {

            System.out.print((i + 1) + ". ");
            array[i] = patata.nextLine().trim();

        }
        return array;

    }
    public static void mostrar(String[] array) {
        for(String resultado : array) {

            System.out.print(resultado + ",");

        }

        System.out.println();

    }
    public static String ascendente(String[] array) {
        String aux = "";

        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - 1; j++) {
                if(array[j].compareTo(array[j + 1]) > 0) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j +1] = aux;
                }
            }
        }
        return aux;
    }
    public static String descendente(String[] array) {
        String aux = "";

        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - 1; j++) {
                if(array[j].compareTo(array[j + 1]) < 0) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j +1] = aux;
                }
            }
        }
        return aux;
    }
}
