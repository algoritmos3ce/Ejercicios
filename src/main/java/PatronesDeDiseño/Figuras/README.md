Dado el siguiente codigo, identificar que patrones se violan y proponer un diseño alternativo.

```java

abstract class Forma {
    // ...
}

class Circulo extends Forma {
    // ...

    public double calcularArea() {
        // Implementación del cálculo del área para un círculo
    }
}

class Rectangulo extends Forma {
    // ...

    public double calcularArea() {
        // Implementación del cálculo del área para un rectángulo
    }
}

class Cliente {
    public void main() {
        Forma forma = new Circulo();
        double area = forma.calcularArea(); // Violación del patrón Visitor
    }
}
```