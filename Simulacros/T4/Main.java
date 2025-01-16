package com.clases.clase07;
/*
 * Nombre del archivo: Main.java
 * Descripcion:
 * Autor:
 * Fecha:
 */
import java.util.Scanner;
import java.util.Arrays;

/*
 * Clase principal que recoge clientes, los ordena y permite mostrar un cliente seleccionado en un menu por el usuario.
 * 1. Crea un array de clientes pidiendolos por consola
 * 2. Ordena dicho array alfabeticamente por los apellidos
 * 3. Muestra un listado de clientes para que el usuario seleccione
 * 4. 
 */

public class Main {
	
	public static final int CANTIDAD = 4;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Cliente[] listaClientes = pedirClientes();
		
		mostrarCliente(listaClientes);

	}
	
	/*
	 * pedirClientes();
	 * Crear un array de objetos CLiente de longitud CANTIDAD
	 * Por cada posicion, instancia un objeto Cliente y pide los datos por consola
	 * @return Array de Cliente[] conn los datos introducidos
	 */
	public static Cliente[] pedirClientes() {
		Scanner sc = new Scanner(System.in);
		Cliente[] clientes = new Cliente[CANTIDAD];
		
		for(int i = 0; i < CANTIDAD; i++) {
			System.out.println("\n" + (i + 1) + "ºCliente");
			System.out.println("--------");
			
			clientes[i] = new Cliente();
			System.out.print("Nombre: ");
			clientes[i].nombre = sc.nextLine().trim();
			
			System.out.print("Apellidos: ");
			clientes[i].apellidos = sc.nextLine().trim();
			
			System.out.print("Email: ");
			clientes[i].email = sc.nextLine().trim();
		}
		return clientes;
	}
	
	/*
	 * mostrarCliente();
	 * Muestra los datos de un cliente en consola,dada su posicion en el array
	 * @param clientes El array de clientes
	 * @param posicion La posicion del cliente a mostrar
	 */
	public static void mostrarCliente(Cliente[] clientes) {
		for(int i = 0; i < clientes.length; i++) {
			System.out.println(clientes[i].nombre);
			System.out.println(clientes[i].apellidos);
			System.out.println(clientes[i].email);
		}
	}
	
	/*
	 * ordenarClientes();
	 * Ordenar los datos alfabeticamente
	 * @param clientes El array de clientes
	 */
	public static Cliente[] ordenarClientes(Cliente[] clientes) {
		for(int i = 0; i < clientes.length - 1; i++) {
			for(int j = 0; j < clientes.length - 1 - i; j++) {
				if(clientes[j].apellidos.compareToIgnoreCase(clientes[j + 1].apellidos) > 0) {
					Cliente aux = clientes[j];
					clientes[j] = clientes[j + 1];
					clientes[j + 1] = aux;
				}
			}
		}
		return clientes;
	}
}
