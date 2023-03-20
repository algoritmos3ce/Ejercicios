package ObjetosSimples.Fecha.Solucion;

public class Main {
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(6, 14, 1992);
        fecha1.imprimirFecha();

        Fecha fecha2 = new Fecha("Junio", 14, 1992);
        fecha2.imprimirFecha();

        Fecha fecha3 = new Fecha(165, 1992);
        fecha3.imprimirFecha();
    }
}
