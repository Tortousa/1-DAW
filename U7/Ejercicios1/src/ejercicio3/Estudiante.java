package ejercicio3;

public class Estudiante extends Persona{
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
}