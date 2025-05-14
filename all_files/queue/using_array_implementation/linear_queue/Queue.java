package all_files.queue.using_array_implementation.linear_queue;

public class Queue {
    public int beginningOfQueue;
    public int topOfQueue;
    public int[] arr;

    public void createQueue(int size){
        arr = new int[size];
        beginningOfQueue = - 1;
        topOfQueue = -1;
    }

    // enqueue
    public void enQueue(int value){
        if (isFull()){
            System.out.println("Queue is full");
            return;
        } else if (isEmpty()){
            beginningOfQueue = 0;
            arr[beginningOfQueue] = value;
            topOfQueue++;
        } else {
            arr[++topOfQueue] = value;
        }
        System.out.println("Successfully insert value in queue");
    }

    //deQueue
    public int deQueue(){
        if (isEmpty()){
            System.out.println("The Queue is empty");
            return -1;
        } else {
            int temp = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            }
            return temp;
        }
    }

    // peek
    public int peek(){
        if (beginningOfQueue == -1){
            System.out.println("The Queue is empty");
            return -1;
        } else {
            return arr[beginningOfQueue];
        }
    }

    // isEmpty
    public boolean isEmpty(){
        return beginningOfQueue == -1 || beginningOfQueue == arr.length;
    }

    // isFull
    public boolean isFull(){
        return topOfQueue == arr.length - 1;
    }

    // delete
    public void delete(){
        arr = null;
        System.out.println("Queue is deleted");
    }
}
