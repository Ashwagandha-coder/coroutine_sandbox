package OldThread;

public class MyThread implements Runnable {


    @Override
    public void run() {

        System.out.println("Hello World!");
    }
}

class TestThread {

    public void launch() throws InterruptedException {

        MyThread myThread = new MyThread();

        Thread thread = new Thread(myThread);

        thread.start();

    }


}
