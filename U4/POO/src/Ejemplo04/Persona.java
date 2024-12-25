package Ejemplo04;

public class Persona {
	//PROPIEDADES
	public String nombre;
	public String apellidos;
	
	// CONSTRUCTOR
	public Persona() {
		System.out.println("PERSONA CREADA!");
	}
	
	public Persona(String name, String lastname) {
		nombre = name;
		apellidos = lastname;
	}
	
	// METODOS
	public String nombreCompleto() {
		return nombre + " " + apellidos;
	}
	
	public String nombreCompletoInverso() {
		return apellidos + ", " + nombre;
	}
}