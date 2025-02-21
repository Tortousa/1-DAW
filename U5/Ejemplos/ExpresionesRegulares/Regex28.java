public class Regex28 {
	static public void main(String[] args) {
		// Extrae el texto entre las etiquetas
		String regex = "(?i)(<titulo.*?>)(.+?)(</titulo>)";
		String actualizada = "<titulo>EJEMPLO_TEST</titulo>".replaceAll(regex, "$2");
		
		System.out.println("Nuevo texto: " + actualizada);
	}
}