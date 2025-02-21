import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex11 {
	static public void main(String[] args) {
		String texto = "JavaWorld"; // Texto
		String regex = "a[Ww]"; // Comprueba si la cadena contiene
								// el grupo 'a' seguida de una w o W

		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);

		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (TEXTO: " + concordancias.group() + ")");
		}
	}
}