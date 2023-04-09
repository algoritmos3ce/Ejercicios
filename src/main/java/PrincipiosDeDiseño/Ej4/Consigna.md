Dado este código 

```java
public class Rectangulo {
   private int ancho;
   private int alto;

   public Rectangulo(int ancho, int alto) {
       this.ancho = ancho;
       this.alto = alto;
   }

   public int getAncho() {
       return ancho;
   }

   public int getAlto() {
       return alto;
   }

   public void setAncho(int ancho) {
       this.ancho = ancho;
   }

   public void setAlto(int alto) {
       this.alto = alto;
   }
    
    public int calcularArea() {
        return ancho * alto;
    }
}

public class Cuadrado extends Rectangulo {
private int lado;

    public Cuadrado(int lado) {
        super(lado, lado);
        this.lado = lado;
    }
    
    public int getLado() {
        return lado;
    }
    
    public void setLado(int lado) {
        this.lado = lado;
        setAncho(lado);
        setAlto(lado);
    }
}
```

identificar qué principios se violan y refactorizar