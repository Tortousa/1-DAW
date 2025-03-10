package Ejercicio1;

public class AudioCD extends Disco {

    private int nCanciones;
    
    public AudioCD(String titulo, String artista, int anio) {
        super(titulo, artista, anio);
        this.nCanciones = nCanciones;
    }

    public int getnCanciones() {
        return nCanciones;
    }

    public void setnCanciones(int nCanciones) {
        this.nCanciones = nCanciones;
    }
    
    public int getNCanciones() {
        return nCanciones;
    }
    
    public void setNCanciones() {

    }

    @Override
    public String toString() {
        return "";
    }
}
