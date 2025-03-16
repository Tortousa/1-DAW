package ejercicio1y2;

public class Billete extends Coleccion {
    private String estado;

    public Billete(String nombre, int anio, double valor, String estado) {
        super(nombre, anio, valor);
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString() + ", Estado: " + estado;
    }
}