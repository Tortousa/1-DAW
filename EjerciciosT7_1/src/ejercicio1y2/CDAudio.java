package ejercicio1y2;

public class CDAudio extends Disco {
    private int nCanciones;
    
    public CDAudio(String titulo, String artista, int anio, double precio, int nCanciones) {
        super(titulo, artista, anio, precio);
        this.nCanciones = nCanciones;
    }

    public int getNCanciones() {
        return nCanciones;
    }

    public void setNCanciones(int nCanciones) {
        this.nCanciones = nCanciones;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de Canciones: " + nCanciones;
    }
}
