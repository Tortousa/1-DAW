package ejercicio6;

public abstract class FiguraGeometrica {
    protected double alto;
    protected double ancho;

    public FiguraGeometrica(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public abstract double calcularArea();
}