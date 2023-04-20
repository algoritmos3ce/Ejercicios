En este ejemplo, las interfaz `Forma` tiene métodos con responsabilidades muy
diferentes, violando los principios SoC y abierto-cerrado.

Para corregir esto, podemos utilizar el patrón Visitor para separar cada una de las operaciones en clases diferentes.

```java
interface Visitante {
    void visitarCirculo(Circulo circulo);
    void visitarRectangulo(Rectangulo rectangulo);
}

abstract class Forma {
    public abstract void aceptar(Visitante visitante);
}

class Circulo extends Forma {
    public void aceptar(Visitante visitante) {
        visitante.visitarCirculo(this);
    }
}

class Rectangulo extends Forma {
    public void aceptar(Visitante visitante) {
        visitante.visitarRectangulo(this);
    }
}

class CalculadorDeArea implements Visitante {
    private double areaTotal = 0;

    public void visitarCirculo(Circulo circulo) {
        areaTotal += Math.PI * Math.pow(circulo.getRadio(), 2);
    }

    public void visitarRectangulo(Rectangulo rectangulo) {
        areaTotal += rectangulo.getBase() * rectangulo.getAltura();
    }

    public double getAreaTotal() {
        return areaTotal;
    }
}

class Dibujador implements Visitante {
    Pantalla p;

    public Dibujador(Pantalla p) { this.p = p; }

    public void visitarCirculo(Circulo circulo) {
        // dibujar el círculo en la pantalla
    }

    public void visitarRectangulo(Rectangulo rectangulo) {
        // dibujar el rectángulo en la pantalla
    }
}

class Persistencia implements Visitante {
    public Persistencia(String ruta) {
        // abrir el archivo
    }

    public void visitarCirculo(Circulo circulo) {
        // guardar el círculo en el archivo
    }

    public void visitarRectangulo(Rectangulo rectangulo) {
        // guardar el rectángulo en el archivo
    }
}

class Main {
    public void main() {
        Forma forma = new Circulo();
        var visitante = new CalculadorDeArea();
        forma.aceptar(visitante);
        double areaTotal = visitante.getAreaTotal();
    }
}
```

