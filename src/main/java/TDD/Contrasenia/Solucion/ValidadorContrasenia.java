package TDD.Contrasenia.Solucion;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ValidadorContrasenia {
    public ResultadoValidacion ResultadoValidacion = new ResultadoValidacion(false, "");
    public ResultadoValidacion validarContrasenia(String contrasenia) {
        StringBuilder errores = new StringBuilder();
        boolean esValido = true;

        // Validar que la contraseña tenga al menos 8 caracteres
        if (contrasenia.length() < 8) {
            esValido = false;
            errores.append("La contraseña debe tener al menos 8 caracteres\n");
        }

        // Validar que la contraseña tenga al menos 2 números
        Pattern digitosPattern = Pattern.compile("[0-9]");
        Matcher digitosMatcher = digitosPattern.matcher(contrasenia);
        int cantidadDigitos = 0;
        while (digitosMatcher.find()) {
            cantidadDigitos++;
        }
        if (cantidadDigitos < 2) {
            esValido = false;
            errores.append("La contraseña debe contener al menos 2 números\n");
        }

        // Validar que la contraseña tenga al menos una letra mayúscula
        Pattern mayusculaPattern = Pattern.compile("[A-Z]");
        Matcher mayusculaMatcher = mayusculaPattern.matcher(contrasenia);
        if (!mayusculaMatcher.find()) {
            esValido = false;
            errores.append("La contraseña debe contener al menos una letra mayúscula\n");
        }

        // Validar que la contraseña tenga al menos un carácter especial
        Pattern especialPattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher especialMatcher = especialPattern.matcher(contrasenia);
        if (!especialMatcher.find()) {
            esValido = false;
            errores.append("La contraseña debe contener al menos un carácter especial\n");
        }

        return new ResultadoValidacion(esValido, errores.toString());
    }
}
