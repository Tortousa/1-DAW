package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Maria", "Gomez Lopez", "Sobresaliente");
        Trabajador trabajador = new Trabajador("Pedro", "Rodriguez Tortosa", 1500.0, 40);

        System.out.println("Estudiante\n---------------\n" + estudiante.toString());
        System.out.println();
        System.out.println("Trabajador\n---------------\n" + trabajador.toString());

        double precioHora = 12.5;
        double sueldo = trabajador.calcularSueldo(precioHora);
        System.out.println("Sueldo de " + trabajador.getNombre() + ": " + sueldo + "€");
    }
}