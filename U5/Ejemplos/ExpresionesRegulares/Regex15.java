import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex15 {
	static public void main(String[] args) {
		String texto = "01 a2a abc 223"; // Texto
		String regex = "\\d+"; // Comprueba si contiene al menos 
							   // un grupo de caracteres numericos

		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);

		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (TEXTO: " + concordancias.group() + ")");
		}
	}
}