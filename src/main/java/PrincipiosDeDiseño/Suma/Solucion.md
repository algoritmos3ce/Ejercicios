En el ejemplo se viola el principio de optimización de Knuth (KOP), ya que en
el método `sumar()` se aplican optimizaciones prematuras, sobre todo
considerando que la lista de números no va a tener más que un puñado de
elementos.

El método se podría simplificar:

```java
    private static int sumar(List<Integer> nums) {
        int suma = 0;
        for (var n : nums) {
            sum += nums.get(i).intValue();
        }
        return sum;
    }
```
