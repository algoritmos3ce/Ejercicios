Indicar y justificar cuáles de las siguientes funciones son impuras.

```java
public boolean eliminarUltimo(List<Integer> pila) {
    if (pila.size() == 0) {
        return false;
    }
    pila.remove(pila.size() - 1);
    return true;
}
```

```java
public static int fibonacci(int n) {
    if (n <= 1) {
        return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}
```

```java
public void guardar(Serializable o, String ruta) throws IOException {
    try (FileOutputStream fileOut = new FileOutputStream(ruta);
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
        objectOut.writeObject(o);
    }
}
```

```java
public int tirarDado(int n) {
    Random random = new Random();
    return random.nextInt(n) + 1;
}
```

```java
public static int mcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
```

```java
public static List<String> aMayusculas(List<String> strings) {
    List<String> resultado = new ArrayList<>();
    for (String str : strings) {
        resultado.add(str.toUpperCase());
    }
    return resultado;
}
```

```java
public boolean esEnElFuturo(LocalDateTime t) {
    LocalDateTime now = LocalDateTime.now();
    return t.isAfter(now);
}
```
