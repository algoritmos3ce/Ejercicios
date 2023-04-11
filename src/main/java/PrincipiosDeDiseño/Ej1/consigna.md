# Consigna
Dado este código
``` java
interface Worker {
    public void work();
    public void eat();
    public void sleep();
}

class Engineer implements Worker {
    public void work() {
        System.out.println("Engineering");
    }
    public void eat() {
        System.out.println("Eating");
    }
    public void sleep() {
        System.out.println("Sleeping");
    }
}

class Robot implements Worker {
    public void work() {
        System.out.println("Working");
    }
    public void eat() {
        throw new UnsupportedOperationException();
    }
    public void sleep() {
        throw new UnsupportedOperationException();
    }
}
```
identificar qué principios se violan y refactorizar.