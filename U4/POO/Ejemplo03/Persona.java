package Ejemplo03;

public class Persona {
	public String nombre;
	public String apellidos;
	
	public String nombreCompleto() {
		return nombre + " " + apellidos;
	}
	
	public String nombreCompletoInverso() {
		return apellidos + ", " + nombre;
	}
}