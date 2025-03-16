package ejercicio10;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(5, 8);
        Rectangulo rectangulo = new Rectangulo(4, 6);
        Circulo circulo = new Circulo(3);

        System.out.println("Area del triangulo: " + triangulo.calcularArea());
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
        System.out.println("Area del circulo: " + circulo.calcularArea());
    }
}
