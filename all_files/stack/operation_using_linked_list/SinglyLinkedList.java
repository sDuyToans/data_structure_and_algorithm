package all_files.stack.operation_using_linked_list;

public class SinglyLinkedList {
    public Node head;
    public int size;

    // push
    public void insert(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        if (head == null) {
            this.head = newNode;
            this.size = 1;
        } else {
            newNode.next = this.head;
            this.head = newNode;
            this.size ++;
        }
    }

    // pop
    public int pop() {
        if (this.size == 0) {
            return -1;
        } else {
            int temp = this.head.value;
            if (this.size == 1) {
                this.head = null;
                this.size = 0;
            } else {
                this.head = this.head.next;
                this.size --;
            }
            return temp;
        }
    }
}
