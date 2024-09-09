public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource(3);
        Thread producerThread = new Thread(() ->{
            try {
                for (int i = 1; i <= 6; i++) {

                    sharedResource.produce(i);
                }
            }catch (Exception e) {
                    throw new RuntimeException(e);
                }
        });

        Thread consumcerThread = new Thread(() ->{
            try {
                for (int i = 1; i <= 6; i++) {

                    sharedResource.consume();
                }
            }catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        producerThread.start();
        consumcerThread.start();

    }
}