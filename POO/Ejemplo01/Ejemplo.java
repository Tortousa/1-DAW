package Ejemplo01;

public class Ejemplo {
	public static void main(String args[]) {
		System.out.println("--- EJEMPLO 1 ---");
		
		Persona alumno = new Persona();
		
		System.out.println(alumno.nombre);
		
		alumno.nombre = "Juan";
		alumno.apellidos = "Garcia";
		
		System.out.println(alumno.nombre + " " + alumno.apellidos);
	}
}