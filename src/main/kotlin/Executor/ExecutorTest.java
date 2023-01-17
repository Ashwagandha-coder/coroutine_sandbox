package Executor;


import kotlinx.coroutines.ExecutorCoroutineDispatcher;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;

/**
 Пример использования Executor
 */
public class ExecutorTest {

    private Executor executor = (runnable_main) -> { new Thread(runnable_main).start();};

    private ExecutorService executorService;
    private ExecutorCompletionService executorCompletionService;
    private ExecutorCoroutineDispatcher executorCoroutineDispatcher;


    public void make() {

        Runnable runnable = () -> {
            System.out.println("Hello World");
        };

        executor.execute(runnable);

    }

    public void doMake() {




    }


}



