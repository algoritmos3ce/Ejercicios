package ObjetosSimples.Cuenta.Solucion;

import java.util.ArrayList;

public class Banco {

    private ArrayList<CajaDeAhorro> cuentas;

    public Banco() {
        cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CajaDeAhorro cuenta) {
        cuentas.add(cuenta);
    }

    public void transferir(CajaDeAhorro cuentaOrigen, CajaDeAhorro cuentaDestino, double monto) {
        if (cuentas.contains(cuentaOrigen) && cuentas.contains(cuentaDestino)) {
            cuentaOrigen.retirar(monto);
            cuentaDestino.depositar(monto);
        } else {
            System.out.println("Una o ambas cuentas no existen en el sistema.");
        }
    }

}
