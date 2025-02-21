import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex14 {
	static public void main(String[] args) {
		String texto = "bab"; // Texto
		String regex = "[b?]"; // Comprueba dónde aparece "b"

		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);

		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (TEXTO: " + concordancias.group() + ")");
		}
	}
}