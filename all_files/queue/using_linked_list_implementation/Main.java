package all_files.queue.using_linked_list_implementation;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(8);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
