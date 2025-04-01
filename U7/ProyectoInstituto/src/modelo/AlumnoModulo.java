package modelo;

public class AlumnoModulo {
	private int idAlumno;
	private int idModulo;
	
	public AlumnoModulo(int idAlumno, int idModulo) {
		this.idAlumno = idAlumno;
		this.idModulo = idModulo;
	}
	
	public AlumnoModulo() {
		
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public int getIdModulo() {
		return idModulo;
	}

	public void setIdModulo(int idModulo) {
		this.idModulo = idModulo;
	}
}