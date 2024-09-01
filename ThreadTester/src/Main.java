public class Main {
    public static void main(String[] args) {

        System.out.println("main thread starting");
        Thread thread1 = new Thread1("thread1Name");
       // thread1.setDaemon(true);
        thread1.start();
        System.out.println("main thread exiting ");
    }
}