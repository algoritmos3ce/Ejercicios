Dado el siguiente codigo, identificar un problema de diseño y proponer una solución aplicando algún patrón de diseño.
```java
public class Maquina {
    public final void imprimir() {
        leer();
        calentar();
        imprimir();
    }

    private void leer() {
        System.out.println("Leyendo documento...");
    }

    private void calentar() {
        System.out.println("Calentando máquina...");
    }

    private void imprimir() {
        System.out.println("Imprimiendo documento...");
    }
}

public class MaquinaLaser {
    public final void imprimir() {
        leer();
        calentar();
        imprimir();
    }
    
    
    private void leer() {
        System.out.println("Leyendo documento...");
    }
    
    private void calentar() {
        System.out.println("Calentando láser...");
    }
    
    private void imprimir() {
        System.out.println("Imprimiendo en laser...");
    }
}

public class MaquinaLectoraEn3D {
    public final void imprimir() {
        leer();
        calentar();
        imprimir();
    }
    
    
    private void leer() {
        System.out.println("Leyendo en 3D...");
    }
    
    private void calentar() {
        System.out.println("Calentando lector...");
    }
    
    private void imprimir() {
        System.out.println("Imprimiendo en 3D...");
    }
}
```