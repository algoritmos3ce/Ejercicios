Dado el siguiente codigo, identificar un problema de diseño y proponer una solución aplicando algún patrón de diseño.

```java

public class Ordenamiento {

    public void ordenar(int[] arr, String metodo) {
        if (metodo.equals("burbujeo")) {
            burbujeo(arr);
        } else if (metodo.equals("insercion")) {
            insercion(arr);
        } else if (metodo.equals("seleccion")) {
            seleccion(arr);
        } else {
            System.out.println("Método no válido.");
        }
    }

    private void burbujeo(int[] arr) {
        // Implementación del algoritmo de burbuja
    }

    private void insercion(int[] arr) {
        // Implementación del algoritmo de inserción
    }

    private void seleccion(int[] arr) {
        // Implementación del algoritmo de selección
    }
}
```