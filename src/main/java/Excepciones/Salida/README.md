Indicar *exactamente* cuál es la salida producida al ejecutar cada uno de los sigientes programas:

---

```java
class Uno {
    public static void main (String[] args) {
        int[] arr = new int[4];
        try {
            int i = arr[4];
            System.out.println("Dentro del bloque try");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Excepción atrapada en el bloque catch");
        }
        System.out.println("Fin.");
    }
}
```

---

```java
class Dos {
    public static void main (String[] args) {
        int[] arr = new int[4];
        try {
            int i = arr[4];
            System.out.println("Dentro del bloque try");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Excepción atrapada en el bloque catch");
        } finally {
            System.out.println("Dentro del bloque finally");
        }
        System.out.println("Fin.");
    }
}
```

---

```java
class Tres {
    public static void main (String[] args) {
        int[] arr = new int[4];
        try {
            int i = arr[4];
            System.out.println("Dentro del bloque try");
        } catch (NullPointerException ex) {
            System.out.println("Exception has been caught");
        }
        System.out.println("Fin.");
    }
}
```

---

```java
class Cuatro {
    public static void main (String[] args) {
        int[] arr = new int[4];
        try {
            int i = arr[4];
            System.out.println("Dentro del bloque try");
        } catch (NullPointerException ex) {
            System.out.println("Exception has been caught");
        } finally {
            System.out.println("Dentro del bloque finally");
        }
        System.out.println("Fin.");
    }
}
```

---

```java
class Cinco {
    public static void main (String[] args) {
        try {
            String str = "123";
            int num = Integer.parseInt(str);
            System.out.println("Dentro del bloque try");
        } catch (NumberFormatException ex) {
            System.out.println("catch block executed...");
        }
        System.out.println("Fin.");
    }
}
```

---

```java
class Seis {
    public static void main (String[] args) {
        try {
            String str = "123";
            int num = Integer.parseInt(str);
            System.out.println("try block fully executed");
        } catch (NumberFormatException ex) {
            System.out.println("catch block executed...");
        } finally {
            System.out.println("Dentro del bloque finally");
        }
        System.out.println("Fin.");
    }
}
```

---

```java
class Siete {
    public static void main (String[] args) {
        int[] arr = new int[4];
        try {
            int i = arr[4];
            System.out.println("Dentro del bloque try");
        } finally {
            System.out.println("Dentro del bloque finally");
        }
        System.out.println("Fin.");
    }
}
```

---

```java
class Ocho {
    public static void main (String[] args) {
        try {
            String str = "123";
            int num = Integer.parseInt(str);
            System.out.println("Dentro del bloque try");
        } finally {
            System.out.println("Dentro del bloque finally");
        }
        System.out.println("Fin.");
    }
}
```
