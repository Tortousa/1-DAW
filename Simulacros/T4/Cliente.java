package com.clases.clase07;
/*
 * Nombre del archivo: Main.java
 * Descripcion:Clase que define las propiedades de un cliente (nombre, apellidos, email) y su constructor
 * Autor: Daniel Tortosa Burtseva
 * Fecha:
 */

// Clase Cliente que representa los datos basicos de un cliente.
public class Cliente {
	public String nombre;
	public String apellidos;
	public String email;
	
	/*
	 * Constructor vacio de la clase cliente
	 * Permite asignar un objeto y proporcionarle valores despues.
	 */
	public Cliente() {
		
	}
	
	/*
	 * Cocnstructor con parametros(sobrecargado)
	 * Lo utilizamos si queremos asignar directamente nombre, apellidos y email.
	 */
	public Cliente(String nombre, String apellidos, String email) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
