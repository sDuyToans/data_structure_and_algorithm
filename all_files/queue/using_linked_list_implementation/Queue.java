package all_files.queue.using_linked_list_implementation;

public class Queue {
   LinkedList linkedList;
    // create
    public Queue(int value) {
        linkedList = new LinkedList(value);
        System.out.println("Successfully created queue");
    }

    // isEmpty
    public boolean isEmpty(){
        return this.linkedList.head == null;
    }

    // enqueue
    public void enqueue(int value){
        linkedList.insert(value, linkedList.size);
        System.out.println("Successfully inserts element to queue!");
    }

    // dequeue
    public int dequeue(){
        if(this.isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        } else {
            return linkedList.dequeue();
        }
    }

    // peek
    public int peek(){
        if(this.isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        } else {
            return this.linkedList.head.value;
        }
    }

    // delete
    public void delete(){
        linkedList.delete();
        System.out.println("Successfully deleted queue!");
    }
}
