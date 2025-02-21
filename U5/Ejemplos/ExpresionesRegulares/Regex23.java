import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex23 {
	static public void main(String[] args) {
		String texto = "abc dfdgbfdg asdrabcty"; // Texto
		String regex = "(a|b)+"; // Comprueba si contiene los caracteres "a" o "b"

		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);

		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (TEXTO: " + concordancias.group() + ")");
		}
	}
}