package ThreadPool;

public class Task implements Runnable {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("Executing " + taskName + " on " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); // Simulate work (1 second)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
