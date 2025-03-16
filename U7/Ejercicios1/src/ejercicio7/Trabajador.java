package ejercicio7;

public class Trabajador extends Humano {
    private double sueldo;
    private int horasTrabajadas;

    public Trabajador(String nombre, String apellidos, double sueldo, int horasTrabajadas) {
        super(nombre, apellidos);
        this.sueldo = sueldo;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalarioPorHora() {
        if (horasTrabajadas == 0) {
            return 0;
        }
        return sueldo / horasTrabajadas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sueldo: " + sueldo + ", Horas trabajadas: " + horasTrabajadas;
    }
}
