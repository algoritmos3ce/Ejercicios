La interfaz `Vehiculo` viola el principio ISP (Interface Segregation), ya que
expone métodos que no son relevantes para todas las imlementaciones.

Una solución posible es separar la interfaz:

```java
interface Vehiculo {
    void acelerar();
    void frenar();
}

interface VehiculoConCambios {
    void cambiarMarcha();
}

interface VehiculoConFaros {
    void encenderFaros();
    void apagarFaros();
}

interface VehiculoMotorizado {
    void arrancarMotor();
    void pararMotor();
}

interface VehiculoConRadio {
    void encenderRadio();
    void apagarRadio();
}

class Coche implements Vehiculo, VehiculoConCambios, VehiculoConFaros, VehiculoMotorizado, VehiculoConRadio {
    // ...
}

class Bicicleta implements Vehiculo, VehiculoConCambios, VehiculoConFaros {
    // ...
}
```
