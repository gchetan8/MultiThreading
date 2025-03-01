package ThreadCreation;

public class MyThread extends Thread {
    // Override the run() method to define the task to be performed by the thread
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }


    public static void main(String[] args) {
        // Create a new thread object
        MyThread t1 = new MyThread();
        t1.start();  // Start the thread. This will invoke the run() method.

        MyThread t2 = new MyThread();
        t2.start();
    }
}

