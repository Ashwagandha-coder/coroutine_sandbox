package OldThread.Philosophy;

import java.util.concurrent.Semaphore;

/**
 Задача про обедающих философов
 */
public class Philosophy implements Runnable {

    private Semaphore semaphore;
    private boolean flag = false;

    public Philosophy(Semaphore semaphore) {
        this.semaphore = semaphore;
    }


    @Override
    public void run() {

        try {
            if (!flag) {

                semaphore.acquire();

                System.out.println("Сел есть");

                Thread.sleep(300);
                flag = true;

                System.out.println("Поел");
                semaphore.release();

                Thread.sleep(300);
            }
        }
        catch (InterruptedException exception) {
            exception.printStackTrace();
        }


    }
}
