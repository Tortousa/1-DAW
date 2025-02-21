import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex12 {
	static public void main(String[] args) {
		String texto = "pepe@gmail.com"; // Texto
		String regex = "([^@])+"; // Comprueba si la cadena contiene uno o varios
								  // grupos formados por caracteres que no sean @

		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);

		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (TEXTO: " + concordancias.group() + ")");
		}
	}
}