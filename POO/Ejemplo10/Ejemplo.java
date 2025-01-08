package Ejemplo10;

import java.util.Scanner;

public class Ejemplo {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("--- EJEMPLO 10 ---");
		
		Persona[] gente = new Persona[5];
		
		for(int i = 0; i < gente.length; i++) {
			
			System.out.print("Nombre: ");
			String nombre = teclado.nextLine();
			System.out.print("Apellidos: ");
			String apellidos = teclado.nextLine();
			System.out.print("Edad: ");
			int edad = teclado.nextInt();
			teclado.nextLine(); // Corregir bug
			
			gente[i] = new Persona(nombre, apellidos, edad);
		}
		
		// ORDENACION
		gente = ordenarPersonas(gente);
		
		mostrarPersonas(gente);
	}
	
	public static Persona[] ordenarPersonas(Persona[] gente) {
		for(int i = 0; i < gente.length; i++) {
			for(int j = i+1; j < gente.length; j++) {
				if(gente[j].edad < gente[i].edad) {
					Persona aux = gente[j];
					gente[j] = gente[i];
					gente[i] = aux;
				}
			}
		}
		
		return gente;
	}
	
	public static void mostrarPersonas(Persona[] gente) {
		System.out.println("\nLista de personas");
		
		for(int i = 0; i < gente.length; i++) {
			System.out.println((i+1) + "- " + gente[i].nombreCompleto() + " " + gente[i].edad + " años");
		}
		
	}
}