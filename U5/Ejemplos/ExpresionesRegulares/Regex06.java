import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex06 {
	static public void main(String[] args) {
		String texto = "abc del mareo"; // Texto
		String regex = "mar."; // Comprueba si contiene los tres caracteres indicados
							  // con el patron "mar", seguido de un caracter cualquiera.

		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);

		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (TEXTO: " + concordancias.group() + ")");
		}
	}
}