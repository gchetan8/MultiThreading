package concurrency_demo;

public class EvenThread extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i += 2) {  // Even numbers from 0 to 10
            System.out.println("Even: " + i);
            try {
                Thread.sleep(100);  // Simulate work and allow other thread to execute
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
