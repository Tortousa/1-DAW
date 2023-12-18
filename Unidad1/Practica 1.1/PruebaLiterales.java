/**
 * HolaMundo.java
 * Programa simple que muestra un mensaje la consola del sistema.
 * ajp - 2018.09.19
 */

public class PruebaLiterales {
	public static void main(String[] args) {	
		
        double algo =-11.1; //valido
        double algo1 = +521.6; //valido
        int algo2 = 0b101010; //valido
        char algo3 = 'a'; //valido
        String algo4 = "true"; //valido
        double algo5 = -88.28; //valido
        int algo6 = 8377; //valido
        double algo7 = 1.26; //valido
        float algo8 = 1.26f; //valido
        int algo9 = 1234; //valido
        String algo10 = "a"; //valido
        String algo11 = "abc'"; //valido
        double algo12 = .3e27; //valido
        int algo13 = 9999; //valido
        double algo14 = 5E-002; //valido
        char algo15 = '\n'; //valido
        double algo16 = .567; //valido
        int algo17 = 0xFE; //valido
        int algo18 = 0xFFFE; //valido
        double algo19 = 02.45; //valido
        char algo20 = '\\'; //valido
        String algo21 = "cañón"; //valido
        String algo22 = \xFE; //no valido por el caracter \
        String algo23 = XGA; //no es valido ya que no se encuentra entre comillas
        String algo24 = ab''c; //no valido porque tiene comillas sin cerrar
        String algo25 = "abc;" //no valido ya que el ; se encuentra dentro de las comillas
        int algo26 = xF2E; //no valido ya que empieza por x
        String algo27 = ''abc; //no valido ya que tiene comillas abiertas
        String algo28 = True; //valido
        String algo29 = "abc'; "//no es valido ya que no cierra las comillas
        String algo30 = "abc""; " //no es valido por las comillas abiertas
        


        System.out.println(algo28);  //Muestra mensaje 
	}
}