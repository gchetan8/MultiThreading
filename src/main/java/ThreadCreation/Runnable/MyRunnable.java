package ThreadCreation.Runnable;

public class MyRunnable implements Runnable {
    // Implement the run() method to define the task for the thread
    public void run() {
        System.out.println("Thread is running using Runnable: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        // Create a Runnable object
        MyRunnable task = new MyRunnable();

        // Pass the Runnable object to a new Thread object
        Thread t1 = new Thread(task);
        t1.start();  // Start the thread, which invokes the run() method.

        // Another thread
        Thread t2 = new Thread(task);
        t2.start();
    }
}
