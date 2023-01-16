package OldThread;

/**
 * Пример volatile в Java
 */
public class Volt {

    private volatile int a = 0;

    public void volt() {

        a = 2;
        a = 3;
        a = 4;

    }

}
