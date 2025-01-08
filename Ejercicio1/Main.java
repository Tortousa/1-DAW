public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Pedro", "Topuria", "Moreno", 5, "A", "UMU", "pedro@gmail.com", 66543243);
        Estudiante estudiante2 = new Estudiante();

        estudiante1.mostrarInfo();
        estudiante2.mostrarInfo();

        System.out.println("Total estudiantes creados: " + Estudiante.totalEstudiantes);

    }
}
