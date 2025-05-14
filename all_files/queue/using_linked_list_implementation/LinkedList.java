package all_files.queue.using_linked_list_implementation;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public LinkedList(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        this.head = newNode;
        this.tail = newNode;
        this.size = 1;
    }

    // insert
    public void insert(int nodeValue, int location) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            this.size++;
        } else if (location == size){
            newNode.next = null;
            this.tail.next = newNode;
            this.tail = newNode;
            this.size++;
        }
    }

    // delelte
    public void delete() {
        this.head = this.tail = null;
    }

    public int dequeue() {
        int temp = this.head.value;
        this.head = this.head.next;
        return temp;
    }
}
