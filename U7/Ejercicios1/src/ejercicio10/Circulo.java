package ejercicio10;

public class Circulo extends Figura {

    public Circulo(double radio) {
        super(radio, radio);
    }

    @Override
    public double calcularArea() {
        return Math.PI * anchura * anchura;
    }
}
