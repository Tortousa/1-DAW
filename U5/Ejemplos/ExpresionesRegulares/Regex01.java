import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex01 {
	static public void main(String[] args) {
		String texto = "012ab9c"; // Texto con numeros y letras
		String regex = "\\d"; // Cualquier numero del 0 al 9. Equivale a [0-9]

		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);

		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (valor: " + concordancias.group() + ")");
		}

	}
}