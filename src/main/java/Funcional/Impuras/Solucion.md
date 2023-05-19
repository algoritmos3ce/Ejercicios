Las funciones que son impuras son:

* `eliminarUltimo`, porque produce un efecto colateral al mutar la lista
  recibida.

* `guardar`, ya que el hecho de leer o escribir en el sistema de archivos es un
  efecto colateral.

* `tirarDado`, ya que dos invocaciones pueden producir resultados diferentes.

* `esEnElFuturo`, ya que dos invocaciones pueden producir resultados
  diferentes.
