package ThreadPool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorExample {
    public static void main(String[] args) {
        // Create a ThreadPoolExecutor with 2 core threads, 4 maximum threads, and a LinkedBlockingQueue with capacity 2
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,  // corePoolSize
                4,  // maximumPoolSize
                1,  // keepAliveTime (1 second)
                TimeUnit.SECONDS, // Time unit for keepAliveTime
                new LinkedBlockingQueue<>(2),  // workQueue with capacity 2
                new ThreadPoolExecutor.AbortPolicy()  // RejectedExecutionHandler
        );

        // Submit tasks to the executor
        for (int i = 1; i <= 6; i++) {
            executor.submit(new Task("Task-" + i));
        }

        // Shut down the executor gracefully
        executor.shutdown();
    }
}
