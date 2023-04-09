Dado este código 

```java

public interface Trabajador {
   void trabajar();
   void tomarDescanso();
   void asistirReuniones();
   void reportarProgreso();
}

public class Desarrollador implements Trabajador {
   @Override
   public void trabajar() {
       // Lógica para desarrollar software
   }

   @Override
   public void tomarDescanso() {
       // Lógica para tomar un descanso
   }

   @Override
   public void asistirReuniones() {
       // Lógica para asistir a reuniones
   }

   @Override
   public void reportarProgreso() {
       // Lógica para reportar progreso
   }
}


```

identificar qué principios se violan y refactorizar.