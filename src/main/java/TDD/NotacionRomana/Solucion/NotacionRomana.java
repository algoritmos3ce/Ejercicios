package TDD.NotacionRomana.Solucion;

public class NotacionRomana {
    public static String convertir(int n) {

        if (n >= 10) {
            return "X" + convertir(n - 10);
        }
        if (n == 9) {
            return "IX";
        }
        if (n >= 5) {
            return "V" + "I".repeat(n - 5);
        }
        if (n == 4) {
            return "IV";
        }
        return "I".repeat(n);
    }
}