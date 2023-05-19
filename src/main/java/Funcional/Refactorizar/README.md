Refactorizar las siguientes funciónes en estilo de programación funcional:

---

a)

```java
// Devuelve la suma de los primeros n cuadrados (1*1 + 2*2 + ... + n*n)
public static int sumaCuadrados(int n) {
    int suma = 0;
    for (int i = 1; i <= n; i++) {
        suma += i * i;
    }
    return suma;
}
```

---

b)

```java
// Devuelve la lista de las 10 cadenas más frecuentes de la lista, ordenadas de
// mayor a menor por frecuencia.
public static List<String> top10(List<String> strings) {
    Map<String, Integer> mapaDeFrecuencias = new HashMap<>();
    for (String str : strings) {
        mapaDeFrecuencias.put(str, mapaDeFrecuencias.getOrDefault(str, 0) + 1);
    }

    List<Map.Entry<String, Integer>> items = new
    ArrayList<>(mapaDeFrecuencias.entrySet());
    items.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

    List<String> top10 = new ArrayList<>();
    for (int i = 0; i < Math.min(10, items.size()); i++) {
        top10.add(items.get(i).getKey());
    }

    return top10;
}
```

---

c)

```java
// Devuelve un mapa de <inicial> => <lista de nombres que tienen esa inicial>
public static Map<String, List<String>> agruparPorInicial(List<String> strings) {
    Map<String, List<String>> resultado = new Map<>();
    for (String nombre : nombres) {
        if (nombre.length() > 0) {
            char inicial = Character.toUpperCase(nombre.charAt(0));
            List<String> nombresInicial = results.get(inicial);
            if (nombresInicial == null) {
                nombresInicial = new ArrayList<>();
                resultado.set(inicial, nombresInicial);
            }
            nombresInicial.add(nombre);
        }
    }
    return resultado;
}
```
