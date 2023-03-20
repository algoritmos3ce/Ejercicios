package ObjetosSimples.Cuenta.Solucion;


public class Main {

    public static void main(String[] args){
        CajaDeAhorro c1 = new CajaDeAhorro(1000.0, 0.05);
        CajaDeAhorro c2 = new CajaDeAhorro(2000.0, 0.03);

        Banco sb = new Banco();
        sb.agregarCuenta(c1);
        sb.agregarCuenta(c2);

        sb.transferir(c1,c2,500);

        System.out.println("Saldo de la cuenta 1: " + c1.calcularSaldo(12));
        System.out.println("Saldo de la cuenta 2: " + c2.calcularSaldo(12));
    }
}