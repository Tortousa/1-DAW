package Clientes;

public class Main {
	public static void main(String[] args) {
		String texto = "Pepe,,Lopez Perez,,12345678a,,C/Luna, 27, 30132, Murcia,,pepelopez@gmail.com,,12/11/2019,,normal,,0;Maria,,Alvarez Martinez,,87654321b,,C/ Falsa, 123, 30009, Murcia,,mariaalvarez@gmail.com,,12/10/2020,,premium,,25;Alberto,,Espinosa Carrillo,,X2654874E,,C/ Arce, 10, Murcia, 30005,,aespinosa@gmail.com,,02/9/2019,,normal,,0;Miguel,,Caballero Pinto,,1122344C,,C/ Olmo, 13, Murcia, 30015,,michaelknight@gmail.com,,45/03/2016,,normal,,5";

		Cliente[] clientes = importarClientes(texto);

		mostrarClientes(clientes);

	}

	public static Cliente[] importarClientes(String datos) {
		String[] lineasUsuario = datos.split(";");

		Cliente[] clientes = new Cliente[lineasUsuario.length + 8];

		for (int i = 0; i < lineasUsuario.length; i++) {
			String[] campos = lineasUsuario[i].split(",,");

			if (campos.length > 0) {
				clientes[i] = new Cliente();
				clientes[i].nombre = campos[0];
				clientes[i].apellidos = campos[1];
				clientes[i].nif = campos[2];
				clientes[i].direccion = campos[3];
				clientes[i].email = campos[4];
				clientes[i].fechaAlta = campos[5];
				clientes[i].tipo = campos[6];
				clientes[i].descuento = Integer.parseInt(campos[7]);
			}
		}

		return clientes;
	}

	public static void mostrarClientes(Cliente[] clientes) {
		System.out.println("------ Clientes ------");

		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null) {
				System.out.println("Nombre: " + clientes[i].nombre);
				System.out.println("Apellidos: " + clientes[i].apellidos);
				System.out.println("NIF: " + clientes[i].nif + " Formato: "
						+ (validarFormatoNIF(clientes[i].nif) ? "Valido" : "No Valido"));
				System.out.println("Direccion: " + clientes[i].direccion);
				System.out.println("Email: " + clientes[i].email);
				System.out.println("Fecha de alta: " + clientes[i].fechaAlta + " Formato: "
						+ (validarFormatoFecha(clientes[i].fechaAlta) ? "Valido" : "No Valido"));
				System.out.println("Tipo: " + clientes[i].tipo);
				System.out.println("Descuento: " + clientes[i].descuento);
				System.out.println();
			} else {
				System.out.println(clientes[i]);
			}
		}

	}

	public static boolean validarFormatoNIF(String nif) {
		String regexDNI = "[0-9]{8}[A-Za-z]";
		String regexNIE = "[XYZxyz][0-9]{7}[A-Za-z]";

		return nif.matches(regexDNI) || nif.matches(regexNIE);
	}

	public static boolean validarFormatoFecha(String fecha) {
		String regexFecha = "^(0?[1-9]|[12][0-9]|3[01])/((0?[1-9])|(1[0-2]))/\\\\d{4}$";

		return fecha.matches(regexFecha);
	}
}