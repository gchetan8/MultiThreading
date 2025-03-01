package concurrency_demo;

public class ConcurrencyDemo {
    public static void main(String[] args) {
        // Create thread objects for even and odd number printing
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        // Start both threads
        evenThread.start();
        oddThread.start();

//        EvenThread evenThread1 = new EvenThread();
//        OddThread oddThread1 = new OddThread();
//        EvenThread evenThread2 = new EvenThread();
//        OddThread oddThread2 = new OddThread();
//
//        evenThread1.start();
//        oddThread1.start();
//        evenThread2.start();
//        oddThread2.start();
    }
}

//Concurrency: The two threads (EvenThread and OddThread) are running concurrently. While one is paused (due to Thread.sleep()), the other is allowed to execute.
//
//Interleaving: The Thread.sleep(100) method is used to simulate some work and gives the operating system a chance to switch between the threads, making them execute in an interleaved manner.
//
//Thread Scheduling: The operating system's thread scheduler decides when each thread should run. Depending on the available CPU resources, it may give one thread more time than the other, resulting in a different interleaving order. However, they will share time on the CPU.