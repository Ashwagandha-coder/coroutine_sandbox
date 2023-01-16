package OldThread;

/**
 Для синхронизации используется ключевое слово synchronized
 При работе внутри synchronized блока кода захватывается мьютекс переданного обьекта

 */

public class Sync {

    private final int a = 0;
    private Object object;


    public void doSome() {

        synchronized (object) {}

    }

    public synchronized void doSome2() {}

}
