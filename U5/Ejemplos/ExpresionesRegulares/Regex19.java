import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex19 {
	static public void main(String[] args) {
		String texto = "abc dfdgfdg asdrabcty"; // Texto
		String regex = "^[aA]bc.*"; // Comprueba si empieza por "abc" o "Abc",
									// opcionalmente seguido de ninguno
									// o varios caracteres.

		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);

		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (TEXTO: " + concordancias.group() + ")");
		}
	}
}