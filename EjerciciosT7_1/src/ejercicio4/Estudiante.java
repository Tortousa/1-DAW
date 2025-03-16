package ejercicio4;

public class Estudiante extends Persona implements Comparable<Estudiante>{
	private String evaluacion;
	
	public Estudiante(String nombre, String apellidos, String evaluacion) {
		super(nombre, apellidos);
		this.evaluacion = evaluacion;
	}

	public String getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(String evaluacion) {
        this.evaluacion = evaluacion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEvaluación: " + evaluacion;
    }

	@Override
	public int compareTo(Estudiante otroEstudiante) {
		if (this.evaluacion.equals(otroEstudiante.evaluacion)) {
            return 0;
        } else if (this.evaluacion.equals("Suspenso")) {
            return -1;
        } else if (this.evaluacion.equals("Aprobado") && !otroEstudiante.evaluacion.equals("Suspenso")) {
            return -1;
        } else if (this.evaluacion.equals("Notable") && !otroEstudiante.evaluacion.equals("Suspenso") && !otroEstudiante.evaluacion.equals("Aprobado")) {
            return -1;
        } else {
            return 1;
        }
	}
}