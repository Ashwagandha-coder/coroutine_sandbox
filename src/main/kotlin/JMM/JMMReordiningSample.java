package JMM;

/**
 Пример программы в которой будет всегда разная инициализации при использовании jcstrestest
 */

public class JMMReordiningSample {

    private int x;
    private int y;

    public void action1() {

        x = 1;
        int r2 = y;

    }

    public void action2() {

        y = 1;
        int r1 = x;

    }

}
