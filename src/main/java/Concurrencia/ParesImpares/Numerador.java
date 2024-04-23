import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Numerador {
    boolean turnoDeLosPares = true;
    final Lock lock = new ReentrantLock();
    final Condition turnoDeLosParesCond = lock.newCondition();
    final Condition turnoDeLosImparesCond = lock.newCondition();

    public static void main(String[] args) throws InterruptedException {
        var n = new Numerador();
        n.imprimirTodos();
    }

    public void imprimirTodos() throws InterruptedException {
        var hiloPares = new Thread(this::imprimirPares, "pares");
        var hiloImpares = new Thread(this::imprimirImpares, "impares");

        hiloPares.start();
        hiloImpares.start();

        hiloPares.join();
        hiloImpares.join();
    }

    void imprimirPares() {
        int n = 0;

        while (n < 100) {
            lock.lock();
            while (!turnoDeLosPares) {
                try {
                    turnoDeLosParesCond.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(Thread.currentThread().getName() + ": " + n);
            n += 2;
            turnoDeLosPares = false;
            turnoDeLosImparesCond.signal();
            lock.unlock();
        }
    }

    void imprimirImpares() {
        int n = 1;
        while (n < 100) {
            lock.lock();
            while (turnoDeLosPares) {
                try {
                    turnoDeLosImparesCond.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(Thread.currentThread().getName() + ": " + n);
            n += 2;
            turnoDeLosPares = true;
            turnoDeLosParesCond.signal();
            lock.unlock();
        }
    }
}
