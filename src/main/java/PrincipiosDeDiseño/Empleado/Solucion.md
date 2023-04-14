En el ejemplo se viola el Principio de Mínimo Compromiso (POLC), ya que el
método `getNombreCompleto()` no es parte de la interfaz mínima necesaria
para operar con un `Empleado`, ya que los métodos `getNombre()`
`getApellido()` proporcionan toda la información necesaria para formar el
nombre completo.

Una solución es simplemente eliminar el método `getNombreCompleto()` y mover
esa lógica a otra clase.
