public class Main {
    public static void main(String[] args) {

        System.out.println("main thread starting");

        // implement thread using Thread class
        Thread thread1 = new Thread1("thread1Name");
       // thread1.setDaemon(true);
        thread1.start();

        // implement thread using runnable interface.
        // we use the default constructor of THread
        Thread thread2 = new Thread(new Thread2(), "thread2");
        thread2.start();

        System.out.println("main thread exiting ");
    }
}