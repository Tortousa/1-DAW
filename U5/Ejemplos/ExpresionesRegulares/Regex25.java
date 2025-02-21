public class Regex25 {
	static public void main(String[] args) {
		String email = "pepe.al@gmail.com"; // Texto
		String regex = "^[\\w-\\+]+(\\.[\\w-\\+]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		// Comprueba si un correo electronico es valido

		if(email.matches(regex)) {
			System.out.println("Formato de email valido");
		} else {
			System.out.println("Formato de email no valido");
		}
	}
}