package all_files.queue.queue_via_stack;

public class Main {
    public static void main(String[] args) {
        QueueViaStack queueViaStack = new QueueViaStack();
        queueViaStack.enqueue(1);
        queueViaStack.enqueue(2);
        queueViaStack.enqueue(3);
        System.out.println(queueViaStack.peek());
        queueViaStack.enqueue(4);
        System.out.println(queueViaStack.dequeue());
    }
}
