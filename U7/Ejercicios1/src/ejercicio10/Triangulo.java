package ejercicio10;

public class Triangulo extends Figura {

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return (anchura * altura) / 2;
    }
}
