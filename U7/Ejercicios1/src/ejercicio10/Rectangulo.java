package ejercicio10;

public class Rectangulo extends Figura {

    public Rectangulo(double anchura, double altura) {
        super(anchura, altura);
    }

    @Override
    public double calcularArea() {
        return anchura * altura;
    }
}
