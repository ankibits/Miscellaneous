public class Main {
    public static void main(String[] args) {
        String lock1 = "lock1";
        String lock2 = "lock2";
        System.out.println("Main starting");

        Thread thread1 = new Thread(() ->{
            synchronized (lock1){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock2) {
                    System.out.println("lock 2 acquired by thread1");
                }
            }
        }, "thread1");

        Thread thread2 = new Thread(() ->{
            synchronized (lock2){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock1) {
                    System.out.println("lock 1 acquired by thread2");
                }
            }
        }, "thread2");

        thread1.start();
        thread2.start();
    }
}