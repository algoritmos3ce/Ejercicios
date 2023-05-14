El error se debe a que la función `promedio` está marcada con `throws ListaVaciaException`, siendo ésta una excepción chequeada.
Al invocar a `promedio`, hay que manejar la excepción. Básicamente hay dos
soluciones:

1. Atrapar la excepción en un bloque `try-catch`.
2. Ignorar la excepción, marcando la función `main` con `throws
   ListaVaciaException`.

Otra opción sería cambiar la excepción `ListaVaciaException` para que no sea
chequeada. La forma más fácil es heredando de `RuntimeException` en lugar de
`Exception`.
