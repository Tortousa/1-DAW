package ejercicio12;

public class CuentaHipoteca extends Cuenta {

    public CuentaHipoteca(String nombre, TipoCliente tipoCliente, double saldo, double tipoInteresMensual) {
        super(nombre, tipoCliente, saldo, tipoInteresMensual);
    }

    @Override
    public double calcularInteres(int numeroMeses) {
        if (tipoCliente == TipoCliente.PARTICULAR && numeroMeses <= 6) {
            return numeroMeses * (tipoInteresMensual / 2);
        } else if (tipoCliente == TipoCliente.EMPRESA && numeroMeses <= 12) {
            return numeroMeses * (tipoInteresMensual / 2);
        }
        return numeroMeses * tipoInteresMensual;
    }
    
    @Override
    public String toString() {
        return "Cuenta de Hipoteca: " + nombre +
               ", Cliente: " + tipoCliente +
               ", Saldo: " + saldo +
               ", Interés mensual: " + tipoInteresMensual;
    }
}
