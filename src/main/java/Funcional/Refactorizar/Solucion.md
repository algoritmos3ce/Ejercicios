a)

```java
public static int sumaCuadrados(int n) {
    return IntStream.rangeClosed(1, n)
                .map(i -> i * i)
                .sum();
}
```

---

b)

```java
public static List<String> top10(List<String> strings) {
    return strings.stream()
            .collect(Collectors.groupingBy(
                    str -> str,
                    Collectors.counting()
            ))
            .entrySet().stream()
            .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()))
            .limit(10)
            .map(Map.Entry::getKey)
            .collect(Collectors.toList());
}
```

---

c)

```java
public static Map<Character, List<String>> agruparPorInicial(List<String> strings) {
    return strings.stream()
            .filter(nombre -> nombre.length() > 0)
            .collect(Collectors.groupingBy(
                    nombre -> Character.toUpperCase(nombre.charAt(0)),
                    Collectors.toList()
            ));
}
```
