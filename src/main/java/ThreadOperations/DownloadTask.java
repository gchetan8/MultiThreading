package ThreadOperations;

public class DownloadTask extends Thread {
    private String fileName;

    public DownloadTask(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try {
            int attempts = 0;
            while (attempts < 3) {
                try {
                    System.out.println(fileName + " started downloading.");
                    int downloadTime = (int) (Math.random() * 3000) + 2000;
                    Thread.sleep(downloadTime);  // Simulate downloading
                    System.out.println(fileName + " download completed successfully.");
                    return;  // Exit after successful download
                } catch (InterruptedException e) {
                    System.out.println(fileName + " was interrupted. Retrying...");
                    attempts++;
                }
            }
            System.out.println(fileName + " download failed after retries.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DownloadTask task1 = new DownloadTask("File1.txt");
        DownloadTask task2 = new DownloadTask("File2.jpg");
        DownloadTask task3 = new DownloadTask("File3.mp4");

        task1.start();
        task2.start();
        task3.start();

        try {
            Thread.sleep(3000);  // Main thread waits for 3 seconds before interrupting task2
            System.out.println("Main thread is checking download progress...");
            task2.interrupt();  // Interrupt task2 to simulate a cancellation

            task1.join();  // Wait for task1 to finish
            task2.join();  // Wait for task2 to finish (even if interrupted, it will finish)
            task3.join();  // Wait for task3 to finish

            System.out.println("All download tasks are finished. Main thread can proceed.");
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }
    }
}
