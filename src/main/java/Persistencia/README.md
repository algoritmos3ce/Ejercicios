Agregar la capacidad de **persistir el estado** a los modelos implementados en las guías de **Objetos Simples** y **Herencia y Polimorfismo**.

---

Nota: Para probar la persistencia se puede escribir tests unitarios de la
siguiente manera:

```java
public class MiClase {
    public void serializar(OutputStream os) {
        // [...]
    }

    public static MiClase deserializar(InputStream is) {
        // [...]
    }
}

public class MiClaseTest {
    @Test public void testPersistencia() {
        MiClase objeto = new MiClase();
        // [...] inicializar el estado del objeto

        // serializar el objeto
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        objeto.serializar(bytes);

        // deserializar
        MiClase objetoDeserializado = MiClase.deserializar(new ByteArrayInputStream(bytes.toByteArray()));

        assertNotNull(objetoDeserializado);
        // [...] verificar que `objeto` y `objetoDeserializado` son iguales
    }
}
```

Si `MiClase` además implementa `Serializable`, las funciones de `serializar` y
`deserializar` se pueden implementar de la siguiente manera:

```java
public class MiClase implements Serializable {
    public void serializar(OutputStream os) {
        ObjectOutputStream objectOutStream = new ObjectOutputStream(os);
        objectOutStream.writeObject(this);
        objectOutStream.flush();
    }

    public static MiClase deserializar(InputStream is) {
        ObjectInputStream objectInStream = new ObjectInputStream(inStream);
        return (MiClase) objectInStream.readObject();
    }
}
```
