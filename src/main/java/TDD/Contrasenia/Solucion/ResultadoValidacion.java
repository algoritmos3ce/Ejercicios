package TDD.Contrasenia.Solucion;

public class ResultadoValidacion {
    private boolean esValido;
    private String errores;

    public ResultadoValidacion(boolean esValido, String errores) {
        this.esValido = esValido;
        this.errores = errores;
    }

    public boolean esValido() {
        return esValido;
    }

    public String getErrores() {
        return errores;
    }
}