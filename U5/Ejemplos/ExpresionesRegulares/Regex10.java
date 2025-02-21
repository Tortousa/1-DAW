import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex10 {
	static public void main(String[] args) {
		String texto = "JavaWorld"; // Texto
		String regex = "[0-9a-f]"; // Comprueba si contiene numeros del 0 al 9
								   // o caracteres en minusculas de la 'a' a la 'f'

		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);

		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (TEXTO: " + concordancias.group() + ")");
		}
	}
}