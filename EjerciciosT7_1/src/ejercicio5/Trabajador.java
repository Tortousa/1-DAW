package ejercicio5;

public class Trabajador extends Persona implements Comparable<Trabajador>{
	private double salario;
	private int horasTrabajadas;
	
	public Trabajador(String nombre, String apellidos, double salario, int horasTrabajadas) {
		super(nombre, apellidos);
		this.salario = salario;
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSueldo(double precioHora) {
    	if(horasTrabajadas < 0) {
    		return -1;
    	}
        return salario + (horasTrabajadas * precioHora);
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalario: " + salario + "€\nHoras trabajadas: " + horasTrabajadas;
    }

	@Override
	public int compareTo(Trabajador otroTrabajador) {
        return Double.compare(otroTrabajador.salario, this.salario);
	}
}
