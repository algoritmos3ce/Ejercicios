Dado el siguiente código, identificar un problema de diseño y proponer una solución aplicando algún patrón de diseño.

```java
public interface Impresora {
    void imprimir() {
}

public class ImpresoraLaser implements Impresora {
    public void imprimir() {
        if (tonerVacio()) {
            System.out.println("Sin toner!");
            return;
        }
        leerDocumento();
        calentar();
        imprimir();
    }

    private bool tonerVacio() { ... }
    private void leerDocumento() { ... }
    private void calentar() { ... }
    private void imprimir() { ... }
}

public class ImpresoraInyeccion implements Impresora {
    public void imprimir() {
        if (cartuchoVacio()) {
            System.out.println("Sin tinta!");
            return;
        }
        leerDocumento();
        calentar();
        imprimir(d);
    }

    private bool cartuchoVacio() { ... }
    private void leerDocumento() { ... }
    private void calentar() { ... }
    private void imprimir() { ... }
}

public class Impresora3D implements Impresora {
    public void imprimir() {
        if (filamentoVacio()) {
            System.out.println("Sin filamento!");
            return;
        }
        leerDocumento();
        calentar();
        imprimir(d);
    }

    private bool filamentoVacio() { ... }
    private void leerDocumento() { ... }
    private void calentar() { ... }
    private void imprimir() { ... }
}
