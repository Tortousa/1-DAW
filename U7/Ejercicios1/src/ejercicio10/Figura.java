package ejercicio10;

public abstract class Figura {
    protected double anchura;
    protected double altura;

    public Figura(double anchura, double altura) {
        this.anchura = anchura;
        this.altura = altura;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public abstract double calcularArea();
}