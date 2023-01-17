package OldThread.State;

/**
 Пример жизненного цикла потоков
 */

public class StateTest {

    private Thread.State state = Thread.State.BLOCKED;
    private Thread.State state2 = Thread.State.RUNNABLE;
    private Thread.State state3 = Thread.State.NEW;
    private Thread.State state4 = Thread.State.WAITING;
    private Thread.State state5 = Thread.State.TIMED_WAITING;
    private Thread.State state6 = Thread.State.TERMINATED;

}



