package ObjetosSimples.Fecha.Solucion;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    public Fecha(String mesString, int dia, int anio) {
        this.mes = convertirMes(mesString);
        this.dia = dia;
        this.anio = anio;
    }

    public Fecha(int diasEnAnio, int anio) {
        this.anio = anio;

        // Calcular el mes y el día a partir del número de días en el año
        int[] diasPorMes = {0, 31, 59, 90, 120, 151, 181, 212, 243,
                273, 304, 334};

        for (int i = 1; i <= 12; i++) {
            if (diasEnAnio <= diasPorMes[i]) {
                this.mes = i;
                this.dia = diasEnAnio - diasPorMes[i - 1];
                break;
            }
        }
    }

    public void imprimirFecha() {
        System.out.println(mes + "/" + dia + "/" + anio);

        String[] mesesString =
                {"", "Enero", "Febrero", "Marzo", "Abril",
                        "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        System.out.println(mesesString[mes] + " " + dia + ", " + anio);
    }

    private int convertirMes(String mesString) {
        String[] mesesString =
                {"", "Enero", "Febrero", "Marzo", "Abril",
                        "Mayo", "Junio", "Julio", "Agosto",
                        "Septiembre", "Octubre", "Noviembre",
                        "Diciembre"};

        for (int i=1; i<=12; i++) {
            if (mesString.equals(mesesString[i])) {
                return i;
            }
        }

        return 0;
    }
}