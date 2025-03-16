package ejercicio6;

public class Rectangulo extends FiguraGeometrica {

    public Rectangulo(double ancho, double alto) {
        super(alto, ancho);
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}