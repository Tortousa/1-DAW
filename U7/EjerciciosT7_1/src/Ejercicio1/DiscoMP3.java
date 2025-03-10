package Ejercicio1;

public class DiscoMP3 extends Disco {

    private int capacidadMB;

    public DiscoMP3(String titulo, String artista, int anio) {
        super(titulo, artista, anio);
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
        return "";
    }
    
}
