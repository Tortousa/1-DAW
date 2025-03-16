package ejercicio1y2;

public class CDMP3 extends Disco {
    private int capacidadMB;

    public CDMP3(String titulo, String artista, int anio, double precio, int capacidadMB) {
        super(titulo, artista, anio, precio);
        this.capacidadMB = capacidadMB;
    }

    public int getCapacidadMB() {
        return capacidadMB;
    }

    public void setCapacidadMB(int capacidadMB) {
        this.capacidadMB = capacidadMB;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacidad: " + capacidadMB + " MB";
    }    
}