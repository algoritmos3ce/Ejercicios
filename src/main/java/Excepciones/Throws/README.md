El siguiente programa produce un error de compilación. Indicar cuál es la razón
y dos alternativas para arreglar el problema.

```java
class Main {
    public static void main (String[] args) {
        List<Double> numeros = pedirNumeros();
        double p = promedio(numeros); // <-------------- el error está aquí
        System.out.printf("El promedio es: %f\n", p);

    }

    private List<Double> pedirNumeros() {
        List<Double> numeros = new ArrayList<>();
        // [...] pide numeros al usuario y los agrega a la lista
        return numeros;
    }

    private static double promedio(List<Double> numeros) throws ListaVaciaException {
        if (numeros.isEmpty()) {
            throw new ListaVaciaException();
        }

        double suma = 0;
        for (Double n : numeros) {
            suma += n;
        }
        return suma / numeros.size();
    }
}

class ListaVaciaException extends Exception {}
```
