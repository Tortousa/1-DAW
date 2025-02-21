import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex20 {
	static public void main(String[] args) {
		String texto = "abc dfdgfdg asdrabcty"; // Texto
		String regex = "[a-zA-Z]{5,10}"; // Comprueba si hay patrones formados por
										 // un minimo de 5 letras mayusculas o
										 // minusculas y un maximo de 10.

		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);

		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (TEXTO: " + concordancias.group() + ")");
		}
	}
}