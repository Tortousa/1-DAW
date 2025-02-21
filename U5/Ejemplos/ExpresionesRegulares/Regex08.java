import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex08 {
	static public void main(String[] args) {
		String texto = " 0123*aadd_ + /d1?f"; // Texto
		String regex = "\\W"; // tiene caracteres no alfabeticos "\W"
							  // Incluye todos los caracteres especiales

		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);

		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (TEXTO: " + concordancias.group() + ")");
		}
	}
}