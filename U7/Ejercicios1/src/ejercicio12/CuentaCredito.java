package ejercicio12;

public class CuentaCredito extends Cuenta {

    public CuentaCredito(String nombre, TipoCliente tipoCliente, double saldo, double tipoInteresMensual) {
        super(nombre, tipoCliente, saldo, tipoInteresMensual);
    }

    @Override
    public double calcularInteres(int numeroMeses) {
        if (tipoCliente == TipoCliente.PARTICULAR && numeroMeses <= 3) {
            return 0;
        } else if (tipoCliente == TipoCliente.EMPRESA && numeroMeses <= 2) {
            return 0;
        }
        return numeroMeses * tipoInteresMensual;
    }
    
    @Override
    public String toString() {
        return "Cuenta de Crédito: " + nombre +
               ", Cliente: " + tipoCliente +
               ", Saldo: " + saldo +
               ", Interés mensual: " + tipoInteresMensual;
    }
}
