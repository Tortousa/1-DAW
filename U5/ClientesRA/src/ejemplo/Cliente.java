package ejemplo;

public class Cliente {
	private String nombre, apellidos, nif, direccion, email, fechaAlta, tipoM;
	private int descuento;

	public Cliente(String nombre, String apellidos, String nif, String direccion, String email, String fechaAlta,
			String tipoM, int descuento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.direccion = direccion;
		this.email = email;
		this.fechaAlta = fechaAlta;
		this.tipoM = tipoM;
		this.descuento = descuento;
	}

	public Cliente() {

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

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getTipoM() {
		return tipoM;
	}

	public void setTipoM(String tipoM) {
		this.tipoM = tipoM;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "Nombre: " + this.getNombre() + " " + this.getApellidos() + "\n" +
				"NIF: " + this.getNif() + "\n" +
				"Dirección: " + this.getDireccion() + "\n" +
				"Email: " + this.getEmail() + "\n" +
				"Fecha de Alta: " + this.getFechaAlta() + "\n";
	}

}