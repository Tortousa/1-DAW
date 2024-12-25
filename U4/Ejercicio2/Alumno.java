/* 
 * Definir una clase llamada "Alumno" con lo siguientes atributos, los cuales deberian ser privados:
 * Nombre
 * Apellidos
 * NRE
 * Email
 * Dirección
 * Dado que los atributos ser�n privados y no se tendra acceso directo a ellos cuando se instancie un objeto de la clase alumno, se debe crear los metodos "set" y "get" para cada uno de los atributos.
 * En los m�todos "set" se deber� establecer el control que se considere adecuado a la hora de actualizar el contenido del atributo correspondiente.
 * Se debe crear un metodo llamado "info" que devuelva toda la información completa del usuario presentada de la forma que mejor se considere.
 * Tambien se deben crear dos constructores, el primero estar� vaci�o y no recibir� ningun par�metro; el segundo recibir� como par�metros cada uno de los valores que deber� asignar a cada uno de los atributos.
 */

public class Alumno {
	private String nombre, apellidos, nre, email, direccion;
	
	public Alumno() {
		
	}
	
	public Alumno(String nombre, String apellidos, String nre, String email, String direccion) {
		this.getNombre();
		this.getApellidos();
		this.getNre();
		this.getEmail();
		this.getDireccion();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		if(nombre.length() > 2) {
			this.nombre = nombre;
		} else {
			System.out.println("Nombre demasiado corto.");
		}
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getNre() {
		return nre;
	}
	
	public void setNre(String nre) {
		this.nre = nre;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + 
							"\nApellidos: " + apellidos +
                        	"\nNre: " + nre +
                        	"\nEmaiil: " + email +
                        	"\nDireccion: " + direccion + "\n");
    }
}
