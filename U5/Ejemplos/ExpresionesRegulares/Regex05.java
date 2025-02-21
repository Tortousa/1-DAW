import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex05 {
	static public void main(String[] args) {
		String texto = "aa.ssdd.asddd.asd"; // Texto
		String regex = "\\."; // Comprueba si contiene puntos con el patron "\."
		// El patron tiene doble contra barra ya que la contra barra es un caracter especial

		Pattern patron = Pattern.compile(regex);
		Matcher concordancias = patron.matcher(texto);

		System.out.println("\nConcordancias: ");
		while (concordancias.find()) {
			System.out.println("Indice: " + concordancias.start() + " (TEXTO: " + concordancias.group() + ")");
		}
	}
}