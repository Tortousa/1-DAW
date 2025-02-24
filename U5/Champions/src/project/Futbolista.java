package project;

public class Futbolista {
    private String nombre, apellidos, identificador, direccion, email, fechaAlta, tipo;
    private int goles;

    public Futbolista() {

    }

    public Futbolista(String nombre, String apellidos, String identificador, String direccion, String email,
            String fechaAlta, String tipo, int goles) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificador = identificador;
        this.direccion = direccion;
        this.email = email;
        this.fechaAlta = fechaAlta;
        this.tipo = tipo;
        this.goles = goles;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getIdentificador() {
        return identificador;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFechaAlta() {
        return fechaAlta;
    }
    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getGoles() {
        return goles;
    }
    public void setGoles(int goles) {
        this.goles = goles;
    }
}
