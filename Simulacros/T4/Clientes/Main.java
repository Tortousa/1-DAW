package Clientes;

/*
 * Nombre del archivo: Main.java
 * Descripcion:
 * Autor: Daniel Tortosa Burtseva
 * Fecha: 15/01/2025
 */
import java.util.Scanner;
import java.util.Arrays;

/*
 * Clase principal que recoge clientes, los ordena y permite mostrar un cliente seleccionado en un menu por el usuario.
 * 1. Crea un array de clientes pidiendolos por consola.
 * 2. Ordena dicho array alfabeticamente por los apellidos.
 * 3. Muestra un listado de clientes para que el usuario seleccione uno de ellos.
 * 4. 
 */
public class Main {

	public static final int CANTIDAD = 3;

	public static void main(String[] args) {
		Scanner patata = new Scanner(System.in);

		Cliente[] listaClientes = pedirClientes(patata);

		Cliente[] listaOrdenada = ordenarClientes(listaClientes);

		menuClientes(listaOrdenada, patata);
	}

	/*
	 * pedirClientes();
	 * Crear un array de objetos CLiente de longitud CANTIDAD
	 * Por cada posicion, instancia un objeto Cliente y pide los datos por consola
	 * 
	 * @return Array de Cliente[] conn los datos introducidos
	 */
	public static Cliente[] pedirClientes(Scanner patata) {
		Cliente[] clientes = new Cliente[CANTIDAD];

		for (int i = 0; i < CANTIDAD; i++) {
			System.out.println("\nCliente " + (i + 1));
			System.out.println("- - - - -");

			clientes[i] = new Cliente();
			System.out.print("Nombre: ");
			clientes[i].nombre = patata.nextLine().trim();

			System.out.print("Apellidos: ");
			clientes[i].apellidos = patata.nextLine().trim();

			System.out.print("Email: ");
			clientes[i].email = patata.nextLine().trim();
		}
		return clientes;
	}

	/*
	 * mostrarCliente();
	 * Muestra los datos de un cliente en consola,dada su posicion en el array
	 * 
	 * @param clientes El array de clientes
	 * 
	 * @param posicion La posicion del cliente a mostrar
	 */
	public static void mostrarCliente(Cliente[] clientes, int indice) {
		Cliente cliente = clientes[indice];

		System.out.println("\n--Datos del cliente" + (indice + 1) + "--");
		System.out.println("Nombre: " + cliente.getNombre());
		System.out.println("Apellidos: " + cliente.getApellidos());
		System.out.println("Email: " + cliente.getEmail());
		System.out.println();
	}

	/*
	 * menuClientes();
	 * Muestra un menu con los apellidos de los clientes
	 * 
	 * @param clientes El array de clientes
	 * 
	 * @param patata
	 */
	public static void menuClientes(Cliente[] clientes, Scanner patata) {
		int opcion;

		do {
			System.out.println("---- Lista de clientes ----");

			for (int i = 0; i < CANTIDAD; i++) {
				System.out.println((i + 1) + ". " + clientes[i].getApellidos());
			}

			System.out.println("0. Salir");

			opcion = pedirInt("Opcion: ", patata);

			if (opcion > 0 && opcion <= CANTIDAD) {
				mostrarCliente(clientes, opcion - 1);
			} else if (opcion < 0 || opcion > CANTIDAD) {
				System.out.println("Error, no has introducido un numero.");
			}
		} while (opcion != 0);
	}

	/*
	 * pedirInt();
	 * Pedir un numero entero con control de excepciones
	 * 
	 * @param enunciado String para especificar la accion del metodo
	 * 
	 * @param patata
	 */
	public static int pedirInt(String enunciado, Scanner patata) {
		int n = 0;
		boolean check = false;

		do {
			System.out.print(enunciado);

			try {
				n = Integer.parseInt(patata.nextLine().trim());
				check = true;
			} catch (Exception e) {
				System.out.println("Error, no has introducido un numero.");
			}
		} while (!check);
		return n;
	}

	/*
	 * ordenarClientes();
	 * Ordenar los datos alfabeticamente
	 * 
	 * @param clientes El array de clientes
	 */
	public static Cliente[] ordenarClientes(Cliente[] clientes) {
		for (int i = 0; i < clientes.length - 1; i++) {
			for (int j = 0; j < clientes.length - 1 - i; j++) {
				if ((clientes[j].getApellidos()).compareToIgnoreCase(clientes[j + 1].getApellidos()) > 0) {
					Cliente aux = clientes[j];
					clientes[j] = clientes[j + 1];
					clientes[j + 1] = aux;
				}
			}
		}
		return clientes;
	}
}
