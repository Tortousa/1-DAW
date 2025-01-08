package Ejemplo10;

public class Persona {
	//PROPIEDADES
	public String nombre;
	public String apellidos;
	public int edad;
	
	// CONSTRUCTOR
	public Persona() {
		System.out.println("PERSONA CREADA!");
	}
	
	public Persona(String nombre, String apellidos, int edad) {
		// Con el "this" hacemos referencia a propiedades y metodos
		// de la propia clase
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	// METODOS
	public String nombreCompleto() {
		return this.nombre + " " + this.apellidos;
	}
	
	public String nombreCompletoInverso() {
		return this.apellidos + ", " + this.nombre;
	}
}