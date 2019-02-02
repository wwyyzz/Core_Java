package v1.ch14.ThreadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;

            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("task" + index);
                }
            });
        }

        executorService.shutdown();
    }
}
