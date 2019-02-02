package v1.ch14.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample4 {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);

        executorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("hi" + System.currentTimeMillis());
            }
        },3,TimeUnit.SECONDS);


        executorService.shutdown();
    }
}
