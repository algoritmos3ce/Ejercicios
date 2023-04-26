En este ejemplo, la clase `Cuadrado` hereda de la clase `Rectangulo` y sobreescribe los métodos `setAncho()` y `getAncho()`.
El problema es que esto viola el Principio de Sustitución de Liskov (LSP) porque el `Cuadrado` ya no se comporta como un `Rectangulo`.

Por ejemplo, una parte del programa que manipula un `Rectangulo` podría recibir un `Cuadrado`. Al invocar el método `setAlto()` se estaría alterando inadvertidamente el ancho.

Una posible solución es crear una clase `Figura` abstracta y dos subclases `Rectangulo` y `Cuadrado` que implementen la operación `calcularArea()`. De esta manera, se evita la dependencia entre `Cuadrado` y `Rectangulo` y se pueden mantener las propiedades únicas de cada figura.
