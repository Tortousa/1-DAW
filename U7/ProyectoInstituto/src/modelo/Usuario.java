package modelo;

public class Usuario {	
	private String nombre;
	private String apellidos;
	private String dni;
	private String contraseña;
	private String email;
	private String direccion;
	private String telefono;
	//no incluyo el id ya que en la base de datos es autoincremental
	
	public Usuario(String nombre, String apellidos, String dni, String email, String direccion, String telefono) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public Usuario(String nombre, String contraseña, String email) {
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.email = email;
	}
	
	public Usuario() {
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
}