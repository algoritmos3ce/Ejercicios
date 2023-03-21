# AreaTotal
Sea el siguiente código:
```java 
public class Main {
public static void main(String[] args) {
List<Figura> figuras = new ArrayList<>();
figuras.add(new Circulo(3));       // un circulo de radio 3
figuras.add(new Cuadrado(5));      // un cuadrado de lado 5
figuras.add(new Rectangulo(2, 4)); // un rectangulo de 2x4
System.out.println("El area total es: %f", (areaTotal(figuras)));
}

    private double areaTotal(List<Figura> figuras) {
        double total = 0;
        for (Figura f : figuras) {
            total += f.area();
        }
        return total;
    }
}
```
Pensar cuáles son las relaciones entre Figura, Circulo, Cuadrado y Rectangulo. ¿Figura debe ser una clase, una clase abstracta o una interfaz?
¿Dónde hay comportamiento polimórfico? ¿De qué tipo es?
Dibujar el diagrama de clases.
Implementar.