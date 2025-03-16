package ejercicio12;

public class CuentaDeposito extends Cuenta {

    public CuentaDeposito(String nombre, TipoCliente tipoCliente, double saldo, double tipoInteresMensual) {
        super(nombre, tipoCliente, saldo, tipoInteresMensual);
    }

    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public double calcularInteres(int numeroMeses) {
        if (saldo < 1000) {
            return 0;
        }
        return numeroMeses * tipoInteresMensual;
    }
    
    @Override
    public String toString() {
        return "Cuenta de Depósito: " + nombre +
               ", Cliente: " + tipoCliente +
               ", Saldo: " + saldo +
               ", Interés mensual: " + tipoInteresMensual;
    }
}