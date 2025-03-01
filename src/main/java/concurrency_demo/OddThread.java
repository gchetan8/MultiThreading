package concurrency_demo;

public class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i += 2) {  // Odd numbers from 1 to 9
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(100);  // Simulate work and allow other thread to execute
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}