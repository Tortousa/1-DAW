package Ejemplo02;

public class Ejemplo {
	public static void main(String args[]) {
		System.out.println("--- EJEMPLO 2 ---");
		
		Persona alumno = new Persona();
		Persona profesor = new Persona();
		
		alumno.nombre = "Juan";
		alumno.apellidos = "Garcia";
		
		System.out.println(alumno.nombre + " " + alumno.apellidos);
		System.out.println(profesor.nombre + " " + profesor.apellidos);
	}
}