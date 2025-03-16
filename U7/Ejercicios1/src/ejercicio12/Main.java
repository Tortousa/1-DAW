package ejercicio12;

public class Main {
    public static void main(String[] args) {
        CuentaDeposito deposito = new CuentaDeposito("Depósito Juan", TipoCliente.PARTICULAR, 1500, 0.01);
        CuentaCredito credito = new CuentaCredito("Crédito Empresa", TipoCliente.EMPRESA, 10000, 0.02);
        CuentaHipoteca hipoteca = new CuentaHipoteca("Hipoteca María", TipoCliente.PARTICULAR, 50000, 0.005);

        System.out.println(deposito);
        System.out.println(credito);
        System.out.println(hipoteca);

        System.out.println("Interés depósito: " + deposito.calcularInteres(12));
        System.out.println("Interés crédito: " + credito.calcularInteres(3));
        System.out.println("Interés hipoteca: " + hipoteca.calcularInteres(6));
    }
}
