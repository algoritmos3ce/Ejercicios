
En este ejemplo, la clase `Cuadrado` hereda de la clase `Rectangulo` y sobrescribe los métodos `setLado()` y `getLado()`. Esto viola el Principio de Sustitución de Liskov (LSP) porque el comportamiento de `Cuadrado` no es el mismo que el de `Rectangulo`. Por ejemplo, si se llama al método `setAlto()` en un objeto `Cuadrado`, se cambia tanto el alto como el ancho, lo cual no es coherente con la naturaleza de un cuadrado.

Solución: Crear una clase `Figura` abstracta y dos subclases `Rectangulo` y `Cuadrado` que implementen la operación `calcularArea()`. De esta manera, se evita la herencia de `Cuadrado` de `Rectangulo` y se pueden mantener las propiedades únicas de cada figura.
