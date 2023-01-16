package OldThread;

/**
 Данный класс нужен для демонстрации работы с Daemon в многопоточности
 */

public class DaemonTest {

    private Thread thread = new Thread(new Impl());


    public void doSome() {

        thread.setDaemon(true);
        boolean flag = thread.isDaemon();

    }



}

class Impl implements Runnable {

    @Override
    public void run() {

    }
}
