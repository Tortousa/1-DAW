package ejercicio1y2;

public class CDDatos extends Disco {
    private int capacidadMB;
    private String formato;

    public CDDatos(String titulo, int anio, double precio, int capacidadMB, String formato) {
        super(titulo, "Desconocido", anio, precio);
        this.capacidadMB = capacidadMB;
        this.formato = formato;
    }

    public int getCapacidadMB() {
        return capacidadMB;
    }

    public void setCapacidadMB(int capacidadMB) {
        this.capacidadMB = capacidadMB;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacidad: " + capacidadMB + " MB, Formato: " + formato;
    }
}