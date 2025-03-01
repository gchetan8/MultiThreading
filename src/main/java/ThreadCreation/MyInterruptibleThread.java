package ThreadCreation;

public class MyInterruptibleThread extends Thread {
    public void run() {
        while (!isInterrupted()) {
            System.out.println("Thread is running");
        }
        System.out.println("Thread has been interrupted");
    }

    public static void main(String[] args) {
        MyInterruptibleThread t = new MyInterruptibleThread();
        t.start();

        try {
            Thread.sleep(1000);  // Let the thread run for a second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.interrupt();  // Interrupt the thread
    }
}
