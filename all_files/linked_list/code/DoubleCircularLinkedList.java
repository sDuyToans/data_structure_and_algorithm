package all_files.linked_list.code;

public class DoubleCircularLinkedList {
    public DoubleNode head;
    public DoubleNode tail;
    public int size;

    // create Double Circular Linked List
    public DoubleNode createDCLL(int nodeValue) {
        DoubleNode newNode = new DoubleNode();
        newNode.value = nodeValue;
        this.head = newNode;
        this.tail = newNode;
        newNode.prev = newNode;
        newNode.next = newNode;
        this.size = 1;
        return this.head;
    }

    // insertion
    public void insertDCLL(int nodeValue, int location) {
        if (this.head == null){
            createDCLL(nodeValue);
        } else {
            DoubleNode newNode = new DoubleNode();
            newNode.value = nodeValue;
            if (location == 0){
                this.tail.next = newNode;
                newNode.prev = this.tail;
                this.head.prev = newNode;
                newNode.next = this.head;
                this.head = newNode;
            } else if (location >= this.size) {
                newNode.next = this.head;
                this.head.prev = newNode;
                newNode.prev = this.tail;
                this.tail.next = newNode;
                this.tail = newNode;
            } else {
                DoubleNode current = this.head;
                for (int i = 0; i < location - 1; i++) {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
                newNode.prev = current;
                newNode.next.prev = newNode;
            }
            this.size++;
        }
    }

    // Traversal
    public void traversal(){
        if (this.head != null){
            DoubleNode current = this.head;
            for (int i = 0; i < size; i++){
                System.out.print(current.value);
                if (i < size - 1){
                    System.out.print(" -> ");
                }
                current = current.next;
            }
            System.out.println();
        } else {
            System.out.println("The DCLL is empty!");
        }
    }

    // Reverse Traversal
    public void reverseTraversal(){
        if (this.head != null){
            DoubleNode current = this.tail;
            for (int i = 0; i < size; i++){
                System.out.print(current.value);
                if (i < size - 1){
                    System.out.print(" <- ");
                }
                current = current.prev;
            }
            System.out.println();
        } else {
            System.out.println("The DCLL is empty!");
        }
    }

    // Search
    public boolean searchDCLL(int nodeValue){
        if (this.head != null){
            DoubleNode current = this.head;
            for (int i = 0; i < size; i++){
                if (current.value == nodeValue){
                    System.out.println("Node found at location " + i);
                    return true;
                }
                current = current.next;
            }
        }
        System.out.println("Node not found!");
        return false;
    }

    // Deletion
    public void deleteNode(int location){
        if (this.head != null){
            if (location == 0){
                if (this.size == 1){
                    this.head.next = null;
                    this.head.prev = null;
                    this.head = null;
                    this.tail = null;
                    this.size = 0;
                    return;
                } else {
                    this.head = this.head.next;
                    this.tail.next = this.head;
                    this.head.prev = this.tail;
                    this.size--;
                    return;
                }
            } else if (location >= this.size){
                if (this.size == 1){
                    this.head.next = null;
                    this.head.prev = null;
                    this.head = null;
                    this.tail = null;
                    this.size = 0;
                    return;
                } else {
                    this.tail = this.tail.prev;
                    this.tail.next = this.head;
                    this.head.prev = this.tail;
                    this.size --;
                    return;
                }
            } else {
                DoubleNode current = this.head;
                for (int i = 0; i < location - 1; i++) {
                    current = current.next;
                }
                current.next = current.next.next;
                current.next.prev = current;
                this.size --;
                return;
            }
        } else {
            System.out.println("The DCLL is empty!");
        }
    }

    // Delete Entire DCLL
    public void deleteAll(){
        if (this.head != null){
            DoubleNode current = this.head;
            for (int i = 0; i < size; i++){
                current.prev = null;
                current = current.next;
            }
            this.head = null;
            this.tail = null;
            this.size = 0;
            System.out.println("DCLL has been deleted!");
        } else {
            System.out.println("The DCLL is empty!");
        }
    }
}
