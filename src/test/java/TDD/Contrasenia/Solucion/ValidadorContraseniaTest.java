package TDD.Contrasenia.Solucion;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ValidadorContraseniaTest {

    private ValidadorContrasenia validador = new ValidadorContrasenia();

    @Test
    public void pruebaContraseniaValida() {
        ResultadoValidacion resultado = validador.validarContrasenia("Algun4Car@ct3r#");
        assertEquals(true, resultado.esValido());
        assertEquals("", resultado.getErrores());
    }

    @Test
    public void pruebaContraseniaCorta() {
        ResultadoValidacion resultado = validador.validarContrasenia("C0rt1n@");
        assertEquals(false, resultado.esValido());
        assertEquals("La contraseña debe tener al menos 8 caracteres\n", resultado.getErrores());
    }

    @Test
    public void pruebaContraseniaSinNumeros() {
        ResultadoValidacion resultado = validador.validarContrasenia("SinNumeros@");
        assertEquals(false, resultado.esValido());
        assertEquals("La contraseña debe contener al menos 2 números\n", resultado.getErrores());
    }

    @Test
    public void pruebaContraseniaSinMayusculas() {
       ResultadoValidacion resultado = validador.validarContrasenia("sinmayusculas123#");
        assertEquals(false, resultado.esValido());
        assertEquals("La contraseña debe contener al menos una letra mayúscula\n", resultado.getErrores());
    }

    @Test
    public void pruebaContraseniaSinCaracterEspecial() {
       ResultadoValidacion resultado = validador.validarContrasenia("S1ncaracterespec1al");
        assertEquals(false, resultado.esValido());
        assertEquals("La contraseña debe contener al menos un carácter especial\n", resultado.getErrores());
    }

    @Test
    public void pruebaContraseniaConUnSoloNumero() {
        ResultadoValidacion resultado = validador.validarContrasenia("Solo1Numero#");
        assertEquals(false, resultado.esValido());
        assertEquals("La contraseña debe contener al menos 2 números\n", resultado.getErrores());
    }

    @Test
    public void pruebaContraseniaConUnSoloCaracterEspecial() {
        ResultadoValidacion resultado = validador.validarContrasenia("Solo#CaracterEspecial11");
        assertEquals(true, resultado.esValido());
        assertEquals("", resultado.getErrores());
    }
}
