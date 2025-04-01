package modelo;

public class Modulo {
	private int id;
	private String nombreMod;
	private int curso;
	private int hora;
	private String profesor;
	
	public Modulo(int id, String nombreMod, int curso, int hora, String profesor) {
		this(nombreMod, curso, hora, profesor);
		this.id = id;
	}
	
	public Modulo(String nombreMod, int curso, int hora, String profesor) {
		this.nombreMod = nombreMod;
		this.curso = curso;
		this.hora = hora;
		this.profesor = profesor;
	}

	public Modulo() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreMod() {
		return nombreMod;
	}

	public void setNombreMod(String nombreMod) {
		this.nombreMod = nombreMod;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
}