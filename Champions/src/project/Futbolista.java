package project;

public class Futbolista {
    private String nombre, apellidos, id, direccion, email, fechaAlta, tipo;
    private int goles;

    public Futbolista() {

    }

    public Futbolista(String nombre, String apellidos, String id, String direccion, String email,
            String fechaAlta, String tipo, int goles) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
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
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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

    public String toString() {
        return getNombre() + " " + getApellidos() + " | " + getTipo();
    }

    public String toStringGoles() {
        return getNombre() + " " + getApellidos() + " | " + getGoles() + " goles";
    }
}
