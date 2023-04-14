Dado el siguiente código, identificar qué principios se violan y proponer un diseño alternativo.

```java
interface Vehiculo {
    void arrancarMotor();
    void pararMotor();
    void acelerar();
    void frenar();
    void cambiarMarcha();
    void encenderFaros();
    void apagarFaros();
    void encenderRadio();
    void apagarRadio();
}

class Coche implements Vehiculo {
    public void arrancarMotor() {
        // código para arrancar el motor
    }

    public void pararMotor() {
        // código para parar el motor
    }

    public void acelerar() {
        // código para acelerar el coche
    }

    public void frenar() {
        // código para aplicar los frenos
    }

    public void cambiarMarcha() {
        // código para cambiar las marchas
    }

    public void encenderFaros() {
        // código para encender los faros
    }

    public void apagarFaros() {
        // código para apagar los faros
    }

    public void encenderRadio() {
        // código para encender la radio
    }

    public void apagarRadio() {
        // código para apagar la radio
    }
}

class Bicicleta implements Vehiculo {
    public void arrancarMotor() {
        // lanzar una excepción, ya que las bicicletas no tienen motor
    }

    public void pararMotor() {
        // lanzar una excepción, ya que las bicicletas no tienen motor
    }

    public void acelerar() {
        // código para acelerar la bicicleta
    }

    public void frenar() {
        // código para aplicar los frenos
    }

    public void cambiarMarcha() {
        // código para cambiar las marchas
    }

    public void encenderFaros() {
        // código para encender los faros
    }

    public void apagarFaros() {
        // código para apagar los faros
    }

    public void encenderRadio() {
        // lanzar una excepción, ya que las bicicletas no tienen radio
    }

    public void apagarRadio() {
        // lanzar una excepción, ya que las bicicletas no tienen radio
    }
}
```
