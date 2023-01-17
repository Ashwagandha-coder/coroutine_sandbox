package Executor;


import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;

/**
 Пример использования Executor
 */
public class ExecutorTest {

    private Executor executor = (runnable_main) -> { new Thread(runnable_main).start();};

    private Callable callable;

    private ExecutorService executorService;
    private ExecutorCompletionService executorCompletionService;
    private ExecutorCoroutineDispatcher executorCoroutineDispatcher;

    @NotNull
    @Contract(pure = true)
    private static Object call() {
        return "Hello World";
    }


    public void make() {

        Runnable runnable = () -> {
            System.out.println("Hello World");
        };

        executor.execute(runnable);

    }

    public void doMake() {

        callable = ExecutorTest::call;



    }


}



