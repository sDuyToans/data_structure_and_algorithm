package all_files.queue.using_array_implementation.linear_queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.createQueue(3);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        System.out.println(queue.peek());
        System.out.println(queue.deQueue());;
        System.out.println(queue.peek());
    }
}
