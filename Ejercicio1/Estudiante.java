public class Estudiante{
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int curso;
    private String grado;
    private String universidad;
    private String correo_electronico;
    private int numero_telefono;
    public static int totalEstudiantes = 0;

    public Estudiante(String nombre, String apellido1, String apellido2, int curso, String grado, String universidad, String correo_electronico, int numero_telefono) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.curso = curso;
        this.grado = grado;
        this.universidad = universidad;
        this.correo_electronico = correo_electronico;
        this.numero_telefono = numero_telefono;

        totalEstudiantes++;
    }

    public Estudiante() {
        totalEstudiantes++;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + "\nApellidos: " + apellido1 + " " + apellido2 + "\nCurso: " + curso + grado + "\nUniversidad: " + universidad + "\nCorreo Electronico: " + correo_electronico + "\nNumero telefono: " + numero_telefono + "\n");
    }

    public static int mostrarContador() {
        return totalEstudiantes;
    }
}