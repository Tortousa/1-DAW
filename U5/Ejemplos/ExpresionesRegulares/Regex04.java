import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex04 {
	static public void main(String[] args) {
		String texto = "aa.ssdd.asddd.asd"; // Texto
		String regex = "sd$"; // Comprueba si termina exactamente con el patron "sd$"

		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);

		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (TEXTO: " + concordancias.group() + ")");
		}
	}
}