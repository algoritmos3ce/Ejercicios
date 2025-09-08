En el ejemplo se viola el Principio de Responsabilidad Única (SRP), ya que el
objeto tiene dos responsabilidades: *almacenar* la información de un empleado, y
*mostrarla* en la consola.

Una solución es simplemente mover el método `mostrarInfo()` a otra clase.
