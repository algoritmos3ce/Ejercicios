package ObjetosSimples.Cuenta.Solucion;

public class CajaDeAhorro {
    private double saldo;
    private double interes;

    public CajaDeAhorro(double saldoInicial, double interes) {
        this.saldo = saldoInicial;
        this.interes = interes;
    }

    public double calcularSaldo(int meses) {
        return saldo * Math.pow(1 + interes, meses);
    }

    public void depositar(double monto) {
        this.saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= this.saldo) {
            this.saldo -= monto;
        } else {
            System.out.println("No hay suficiente dinero en la cuenta.");
        }
    }
}
