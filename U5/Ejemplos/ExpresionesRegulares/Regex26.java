public class Regex26 {
	static public void main(String[] args) {
		String contrasena = "Prueba9x$"; // Password
		String regex = "(?=.*[A-ZÑ])(?=.*[a-zñ])(?=.*\\d)(?=.+[$*-+&!?%]).{8,16}";
		// Comprueba si la contrasena tiene al menos 8 caracteres,
		// una mayusculas, una minuscula, un numero
		// y un caracter especial de los siguientes: $*-+&!?%

		if(contrasena.matches(regex)) {
			System.out.println("Formato de contrasena valido");
		} else {
			System.out.println("Formato de contrasena valido");
		}
	}
}