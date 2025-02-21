public class Regex27 {
	static public void main(String[] args) {
		// Elimina los espacios en blanco entre una letra
		// seguida de un punto o una coma 
		String regex = "(\\w)(\\s+)([\\.,])";
		System.out.println("Hola  , Esto está regular .".replaceAll(regex, "$1$3"));
	}
}