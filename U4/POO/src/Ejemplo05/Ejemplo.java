package Ejemplo05;

public class Ejemplo {
	public static void main(String args[]) {
		System.out.println("--- EJEMPLO 5 ---");
		
		Persona alumno = new Persona();
		Persona profesor = new Persona("David", "Munuera");
		
		System.out.println(alumno.nombreCompleto());
		
		alumno.nombre = "Juan";
		alumno.apellidos = "Garcia";
		
		System.out.println(alumno.nombreCompletoInverso());
		System.out.println(profesor.nombreCompleto());
	}
}