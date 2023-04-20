Dado el siguiente codigo, identificar un problema de diseño y proponer una solución aplicando algún patrón de diseño.

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