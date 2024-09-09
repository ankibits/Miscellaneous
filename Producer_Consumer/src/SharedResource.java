import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource(int bufferSize) {
        this.sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int item) throws Exception {
        while(sharedBuffer.size()==bufferSize) {
            System.out.println("shared resource is full");
            wait();
        }

        sharedBuffer.add(item);
        System.out.println("PRODUCED: " + item);
        notify();
    }

    public synchronized int consume() throws Exception {
        while(sharedBuffer.isEmpty()) {
            System.out.println("shared resource is empty");
            wait();
        }

        int item= sharedBuffer.poll();
        System.out.println("CONSUMED: " + item);
        notify();
        return item;
    }
}
