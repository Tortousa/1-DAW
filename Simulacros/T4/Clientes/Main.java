package Clientes;

/*
 * Nombre del archivo: Main.java
 * Descripcion: Programa que gestiona una lista de clientes.
 * Autor: Daniel Tortosa Burtseva
 * Fecha: 15/01/2025
 */
import java.util.Scanner;

/*
 * Clase principal que recoge clientes, los ordena y permite mostrar un cliente seleccionado en un menú interactivo.
 * Funcionalidades principales:
 * 1. Crear un array de clientes pidiéndolos por consola.
 * 2. Ordenar dicho array alfabéticamente por los apellidos.
 * 3. Mostrar un menú que permita al usuario seleccionar un cliente para ver sus datos.
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
     * pedirClientes():
     * Crea un array de objetos Cliente de longitud CANTIDAD.
     * Por cada posición, instancia un objeto Cliente y solicita los datos al usuario por consola.
     *
     * @param patata Objeto Scanner para la entrada de datos por consola.
     * @return Array de Cliente[] con los datos introducidos.
     */
	public static Cliente[] pedirClientes(Scanner patata) {
		Cliente[] clientes = new Cliente[CANTIDAD];

		for (int i = 0; i < CANTIDAD; i++) {
			System.out.println("\nCliente " + (i + 1));
			System.out.println("- - - - -");

			clientes[i] = new Cliente();
			System.out.print("Nombre: ");
			clientes[i].setNombre(patata.nextLine().trim());

			System.out.print("Apellidos: ");
			clientes[i].setApellidos(patata.nextLine().trim());

			System.out.print("Email: ");
			clientes[i].setEmail(patata.nextLine().trim());
		}
		return clientes;
	}

	/*
     * mostrarCliente():
     * Muestra los datos de un cliente en consola, dada su posición en el array.
     *
     * @param clientes Array de clientes.
     * @param indice Índice del cliente a mostrar.
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
     * menuClientes():
     * Muestra un menú interactivo con los apellidos de los clientes.
     *
     * @param clientes Array de clientes.
     * @param patata Objeto Scanner para la entrada de datos por consola.
     */
	public static void menuClientes(Cliente[] clientes, Scanner patata) {
		int opcion;

		do {
			System.out.println("---- Lista de clientes ----");

			for (int i = 0; i < CANTIDAD; i++) {
				System.out.println((i + 1) + ". " + clientes[i].getApellidos());
			}

			System.out.println("0. Salir");

			do {
				opcion = pedirInt("Opcion: ", patata);

				if (opcion < 0 || opcion > CANTIDAD) {
					System.out.println("Error: Opcion no valida.");
				}
			} while(opcion < 0 || opcion > CANTIDAD);
			
			if(opcion > 0) {
				mostrarCliente(clientes, opcion - 1);
			}
		} while (opcion != 0);
	}

	/*
     * pedirInt():
     * Solicita un número entero al usuario con control de excepciones.
     *
     * @param enunciado Mensaje a mostrar al usuario.
     * @param patata Objeto Scanner para la entrada de datos.
     * @return Número entero introducido por el usuario.
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
     * ordenarClientes():
     * Ordena los clientes alfabéticamente por apellidos usando el algoritmo de burbuja.
     *
     * @param clientes Array de clientes.
     * @return Array de clientes ordenado alfabéticamente.
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
