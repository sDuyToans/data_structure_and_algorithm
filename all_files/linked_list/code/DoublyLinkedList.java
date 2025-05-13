package all_files.linked_list.code;

public class DoublyLinkedList {
    public DoubleNode head;
    public DoubleNode tail;
    public int size = 0;

    // create a new Doubly Linked List with value
    public DoubleNode createDoublyLinkedList(int nodeValue) {
        DoubleNode newNode = new DoubleNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        this.head = newNode;
        this.tail = newNode;
        this.size++;
        return head;
    }

    // Insert new Node to Doubly Linked List
    public void insertDLL(int nodeValue, int location) {
        DoubleNode newNode = new DoubleNode();
        newNode.value = nodeValue;
        if (this.head == null){
            createDoublyLinkedList(nodeValue);
            return;
        }
        if (location == 0){ // At the beginning
            newNode.next = this.head;
            newNode.prev = null;
            this.head.prev = newNode;
            this.head = newNode;
        } else if (location >= this.size){ // At the end
            newNode.next = null;
            newNode.prev = this.tail;
            this.tail.next = newNode;
            this.tail = newNode;
        } else {
            DoubleNode current = this.head;
            int index = 0;
            while (index < location - 1){
                current = current.next;
                index++;
            }
            newNode.prev = current;
            newNode.next = current.next;
            current.next = newNode;
            newNode.next.prev = newNode;
        }
        this.size++;
    }

    // Traversal
    public void printDLL() {
        if (this.head != null){
            DoubleNode current = this.head;
            while (current != null){
                System.out.print(current.value);
                if (current.next != null){
                    System.out.print(" -> ");
                }
                current = current.next;
            }
            System.out.println();
        } else {
            System.out.println("DLL is empty");
        }
    }

    // Reverse Traversal
    public void reversePrintDLL(){
        if (this.head != null){
            DoubleNode current = this.tail;
            while (current != null){
                System.out.print(current.value);
                if (current.prev != null){
                    System.out.print(" <- ");
                }
                current = current.prev;
            }
            System.out.println();
        } else {
            System.out.println("DLL is empty");
        }
    }

    // Searching DLL
    public boolean search(int nodeValue){
        if (this.head != null){
            DoubleNode current = this.head;
            for (int i = 0; i < this.size; i++){
                if (current.value == nodeValue){
                    System.out.println("The Node found as location " +  i);
                    return true;
                }
                current = current.next;
            }
            System.out.println("Node not found");
        }
        return false;
    }

    // Delete a Node
    public void deleteNode(int location){
        if (this.head != null){
            if (location == 0){
                if (this.size == 1){
                    this.head = null;
                    this.tail = null;
                    this.size = 0;
                    return;
                } else {
                    this.head = this.head.next;
                    this.head.prev = null;
                    this.size --;
                    return;
                }
            } else if (location >= this.size){
                if (this.size == 1){
                    this.head = null;
                    this.tail = null;
                    this.size = 0;
                    return;
                } else {
                    this.tail = this.tail.prev;
                    this.tail.next = null;
                    this.size --;
                    return;
                }
            } else {
                DoubleNode current = this.head;
                for (int i = 0; i < location - 1; i++){
                    current = current.next;
                }
                current.next = current.next.next;
                current.next.prev = current;
                this.size --;
                return;
            }
        } else {
            System.out.println("DLL is empty");
        }
    }

    // Delete Entire DLL
    public void deleteAll(){
        DoubleNode current = this.head;
        while (current != null){
            current.prev = null;
            current = current.next;
        }
        this.head = null;
        this.tail = null;
        this.size = 0;
        System.out.println("The DLL has been deleted");
    }
}
