package all_files.queue.using_array_implementation.ciruclar_queue;

public class Main {
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(4);
        circularQueue.enQueue(1);
        circularQueue.enQueue(2);
        circularQueue.enQueue(3);
        circularQueue.enQueue(4);
        System.out.println(circularQueue.deQueue());;
        System.out.println(circularQueue.deQueue());;
        System.out.println(circularQueue.deQueue());;
        System.out.println(circularQueue.deQueue());;
    }
}
