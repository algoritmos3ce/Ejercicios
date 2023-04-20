En este ejemplo se viola el principio DRY ya que los tres tipos de
impresora se comportan de manera muy similar.

En este caso, se podria utilizar el patrón Template Method para estandarizar el algoritmo de impresión en una clase abstracta.
Ninguna implemetnacion de esa clase abstracta podrá modificar la secuencia de pasos del algoritmo `imprimir()`, pero sí podrá sobreescribir los pasos dentro de ese proceso.

```java
public abstract class Impresora {
    public final void imprimir() {
        String error = chequeoInicial();
        if (error != null) {
            System.out.println(error);
            return;
        }
        leerDocumento();
        calentar();
        imprimir();
    }

    protected abstract String chequeoInicial();
    protected abstract void leerDocumento();
    protected abstract void calentar();
    protected abstract void imprimir();
}

public class ImpresoraLaser extends Impresora {
    @Override
    protected abstract String chequeoInicial() {
        return tonerVacio() ? "sin toner!" : null;
    }

    private bool tonerVacio() { ... }
    @Override protected void leerDocumento() { ... }
    @Override protected void calentar() { ... }
    @Override protected void imprimir() { ... }
}

public class ImpresoraInyeccion extends Impresora {
    @Override
    protected abstract String chequeoInicial() {
        return cartuchoVacio() ? "sin tinta!" : null;
    }

    private bool cartuchoVacio() { ... }
    @Override protected void leerDocumento() { ... }
    @Override protected void calentar() { ... }
    @Override protected void imprimir() { ... }
}

public class Impresora3D extends Impresora {
    @Override
    protected abstract String chequeoInicial() {
        return filamentoVacio() ? "sin filamento!" : null;
    }

    private bool filamentoVacio() { ... }
    @Override protected void leerDocumento() { ... }
    @Override protected void calentar() { ... }
    @Override protected void imprimir() { ... }
}
