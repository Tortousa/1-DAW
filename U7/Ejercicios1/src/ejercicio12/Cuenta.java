package ejercicio12;

public abstract class Cuenta {
    protected String nombre;
    protected TipoCliente tipoCliente;
    protected double saldo;
    protected double tipoInteresMensual;

    public Cuenta(String nombre, TipoCliente tipoCliente, double saldo, double tipoInteresMensual) {
        this.nombre = nombre;
        this.tipoCliente = tipoCliente;
        this.saldo = saldo;
        this.tipoInteresMensual = tipoInteresMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTipoInteresMensual() {
        return tipoInteresMensual;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public abstract double calcularInteres(int numeroMeses);
}
