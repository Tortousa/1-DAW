/*
 * Se debe pedir una cantidad de alumnos para crear, a continuación, un array del tamaño indicado en la cantidad.
 * Después, se debe solicitar en bucle los datos de cada uno de los alumnos hasta completarlos todos.
 * Finalmente, se deberá mostrar en lista, toda la información de cada uno de los alumnos.
 * Adicionalmente, se puede crear un menú con tantas opciones como alumnos haya, mostrando en cada número de opción, solamente el nombre, y mostrar la información completa si se selecciona esa opción del menú.
 */

import java.util.Scanner;

public class Main {
	public static Scanner patata = new Scanner(System.in);

	public static void main(String[] args) {
		int nAlumnos, opcion;

		nAlumnos = pedirInt("Inserta la cantidad de alumnos: ");

		Alumno[] array = new Alumno[nAlumnos];

		for (int i = 0; i < array.length; i++) {
			Alumno alumno = new Alumno();

			System.out.println("Alumno " + (i + 1));

			System.out.print("Nombre: ");
			alumno.setNombre(patata.nextLine().trim());

			System.out.print("Apellidos: ");
			alumno.setApellidos(patata.nextLine().trim());

			System.out.print("NRE: ");
			alumno.setNre(patata.nextLine().trim());

			System.out.print("Email: ");
			alumno.setEmail(patata.nextLine().trim());

			System.out.print("Direccion: ");
			alumno.setDireccion(patata.nextLine().trim());

			array[i] = alumno;
		}

		do {
			System.out.println("Menu de opciones");

			for (int i = 0; i < array.length; i++) {
				System.out.println((i + 1) + " - " + array[i].getNombre());
			}

			System.out.println((array.length + 1) + " - Salir");
			opcion = pedirInt("Opcion: ");

			if (opcion >= 1 && opcion <= array.length) {
				array[opcion - 1].mostrarInfo();
			} else {
				if(opcion == array.length + 1) {
					System.out.println("Fin del programa.");
				} else {
					System.out.println("Opcion no valida. Intenta de nuevo.");
				}
			}
		} while (opcion != array.length + 1);
	}

	public static int pedirInt(String enunciado) {
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
}