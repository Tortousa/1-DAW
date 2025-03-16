package ejercicio1y2;

public class Moneda extends Coleccion {
    private String material;

    public Moneda(String nombre, int anio, double valor, String material) {
        super(nombre, anio, valor);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + ", Material: " + material;
    }
}