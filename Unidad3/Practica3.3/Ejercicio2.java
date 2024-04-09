import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        String frase = " Hola soy   tamesis";

        String lista = palabrasCuatroLetras(frase);

		System.out.println(lista);
        
    }
    public static String palabrasCuatroLetras(String frase){

        String lista = "";

        String[] palabras = frase.split("[ \n\t]");

        for(int i = 0; i < palabras.length; i++){
            if(palabras[i].length() >= 4){
                lista += palabras[i] + "\n";
            }
        }
        return lista;
    }
}
