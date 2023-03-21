# Ajedrez
Diseñar el modelo de objetos e implementar un sistema que permita representar un tablero de ajedrez y efectuar movimientos básicos.
El tablero es de 8x8 casilleros (que pueden ser numerados a1 ... h8). En cada casillero puede haber (o no) una ficha, que puede ser blanca o negra, y una de:

peón (P)

torre (R)

caballo (N)

alfil (B)

dama (Q)

rey (K)

El sistema debe permitir mostrar el tablero en formato de texto, usando los símbolos indicados para cada pieza (letras mayúsculas para las blancas y minúsculas para las negras), y el símbolo . para los casilleros vacíos oscuros y   (espacio en blanco) para los casilleros vacíos claros.

Dada una pieza en el tablero y un casillero de destino, el sistema además debe permitir averiguar si el movimiento es válido o no, y en caso de ser válido, efectuarlo.

ℹ️
Nota: solo es necesario implementar las reglas de movimiento básicas de las piezas. Implementar las reglas del ajedrez en su totalidad es bastante complejo y no es la idea de este ejercicio.