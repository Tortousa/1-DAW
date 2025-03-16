package ejercicio1y2;

public class CDROM extends Disco {
    private String software;
    private String version;

    public CDROM(String titulo, int anio, double precio, String software, String version) {
        super(titulo, "Desconocido", anio, precio);
        this.software = software;
        this.version = version;
    }

    public String getNombreSoftware() {
        return software;
    }

    public void setNombreSoftware(String nombreSoftware) {
        this.software = nombreSoftware;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return super.toString() + ", Software: " + software + ", Versión: " + version;
    }
}