En el ejemplo se viola el principio de mínimo asombro (POLA), ya que uno
esperaría que el método `mover()` mueva el auto, y sin embargo lo que hace es
cambiar el estado entre "moviendo" y "detenido".

Un mejor nombre para el método sería `intercambiarEstadoMovimiento()` o bien
que haya dos métodos `mover()` y `detener()`.
