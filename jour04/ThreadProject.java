public class ThreadProject {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
        try {
            Thread.sleep(1000); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread has finished running");
    }
}