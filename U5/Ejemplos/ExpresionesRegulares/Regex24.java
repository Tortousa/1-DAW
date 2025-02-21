import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex24 {
	static public void main(String[] args) {
		String texto = "abc 2dfdg13fdg asdrabcty"; // Texto
		String regex = ".*1[^2].*"; // Comprueba si contiene un 1 y ese 1
									// no está seguido por un 2, opcionalmente
									//va precedido o seguido de ninguno
									// o varios caracteres

		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);

		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (TEXTO: " + concordancias.group() + ")");
		}
	}
}