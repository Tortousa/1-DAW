package ejercicio6;

public class Triangulo extends FiguraGeometrica {

    public Triangulo(double base, double altura) {
        super(altura, base);
    }

    @Override
    public double calcularArea() {
        return (ancho * alto) / 2;
    }
}
