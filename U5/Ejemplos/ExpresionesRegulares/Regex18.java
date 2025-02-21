import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex18 {
	static public void main(String[] args) {
		String texto = "abc del mar"; // Texto
		String regex = "^abc.*"; // Comprueba si empieza por "abc",
								 // opcionalmente seguido de ninguno
								 // o varios caracteres

		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);

		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (TEXTO: " + concordancias.group() + ")");
		}
	}
}