package all_files.queue.using_array_implementation.ciruclar_queue;

public class CircularQueue {
    public int[] arr;
    public int beginningOfQueue;
    public int topOfQueue;
    public int size;

    // create circular queue
    public CircularQueue(int size) {
        arr = new int[size];
        this.size = size;
        beginningOfQueue = topOfQueue = -1;
        System.out.println("Queue is successfully created with the size of " + size);
    }

    // isEmpty
    public boolean isEmpty() {
        return topOfQueue == -1;
    }

    // isFull
    public boolean isFull(){
        return topOfQueue + 1 == beginningOfQueue || (beginningOfQueue == 0 && topOfQueue == size);
    }

    // enQueue
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        } else if (isEmpty()){
            arr[++beginningOfQueue] = value;
            topOfQueue++;
        } else {
            if (topOfQueue == this.size - 1){
                topOfQueue = 0;
            } else {
                topOfQueue++;
            }
            arr[topOfQueue] = value;
        }
        System.out.println("Successfully insert value into the queue");
    }

    // dequeue
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int temp = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if (beginningOfQueue == topOfQueue) {
                beginningOfQueue = topOfQueue = - 1;
            } else if (beginningOfQueue == this.size){
                beginningOfQueue = 0;
            } else {
                beginningOfQueue++;
            }
            return temp;
        }
    }

    // peek
    public int peek(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return arr[beginningOfQueue];
        }
    }

    // delete
    public void delete(){
        arr = null;
        System.out.println("Successfully deleted");
    }
}
