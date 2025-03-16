package ejercicio6;

public class Circulo extends FiguraGeometrica {

    public Circulo(double radio) {
        super(radio, radio); // Alto y ancho son el radio.
    }

    @Override
    public double calcularArea() {
        return Math.PI * alto * alto; // Math.PI * radio * radio
    }
}