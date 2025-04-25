package all_files.linked_list.code;

/*
 * Linked List build with methods (created, insert, traversal,...)
 */
public class SinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node insertSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insert Method SinglyLinkedList
    public void push(int nodeValue) {
        if (head == null) {
            insertSinglyLinkedList(nodeValue);
            return;
        } else {
            Node node = new Node();
            node.value = nodeValue;
            node.next = null;
            tail.next = node;
            tail = node;
            size++;
        }


    }

    public Node pop() {
        if (head == null) {
            System.out.println("The SLL does not exist");
            return null;
        }
        Node removeNode;
        Node currentNode;
        if (head == tail) {
            removeNode = head;
            head = tail = null;
        } else {
            currentNode = head;
            while (currentNode.next != tail) {
                currentNode = currentNode.next;
            }
            removeNode = currentNode.next;
            currentNode.next = null;
            tail = currentNode;
        }
        size--;

        return removeNode;

    }


    //Get
    public Node get(int index) {
        if (index < 0 || index >= size){
            return null;
        }
        Node current = this.head;
        for (int i = 0; i < index; i++){
            current = current.next;
        }
        return current;
    }


    //Insert
    public boolean insert(int data, int index) {
        Node newNode = new Node();
        newNode.value = data;
        if (index<0 || index >= size) {
            return false;
        }
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            if (index == 0) {
                newNode.next = head;
                head = newNode;
            } else if (index == 1) {
                newNode.next = head.next;
                head.next = newNode;
            } else if (index == size) {
                tail.next = newNode;
                newNode.next = null;
                tail = newNode;
            } else {
                Node tempNode = head;
                int inx = 0;
                while (inx < index-1) {
                    tempNode = tempNode.next;
                    inx += 1;
                }
                Node nextNode = tempNode.next;
                tempNode.next = newNode;
                newNode.next = nextNode;
            }
        }
        size +=1;
        return true;
    }

    public void insertInSingleLinkedList(int nodeValue, int location) {
        Node new_node = new Node();
        new_node.value = nodeValue;
        if (this.head == null) {
            this.head = new_node;
            this.tail = new_node;
        } else if (location == 0){
            new_node.next = head;
            head = new_node;
        } else if (location >= this.size){
            new_node.next = null;
            tail.next = new_node;
            tail = new_node;
        } else {
            Node current = this.head;
            int index = 0;
            while (index < location - 1) {
                current = current.next;
                index++;
            }
            Node next_node = current.next;
            current.next = new_node;
            new_node.next = next_node;
        }
        this.size += 1;
    }

    public void traverseSinglyLinkedList (){
        if (this.head == null) {
            System.out.println("Single Linked List does not exist!");
        } else {
            Node temp = this.head;
            for (int i = 0; i < this.size; i++){
                System.out.print(temp.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                temp = temp.next;
            }
        }
        System.out.println("\n ");
    }

    //Rotate

    public void rotate(int number) {
        if (number < 0 || number >= size) {
            return;
        }
        if (number == 0) {
            return;
        }
        Node current = this.head;
        for (int i = 0; i < number - 1; i++) {
            current = current.next;
        }
        Node firstNode = current.next;
        current.next = null;
        Node temp = firstNode;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = this.head;
        this.head = firstNode;
        this.tail = current;
    }

    // Set

    public boolean set(int index, int value) {
        if (index < 0 || index >= size) {
            return false;
        }
        if (head == null) {
            Node newNode = new Node();
            newNode.value = value;
            newNode.next = null;
            this.head = newNode;
            this.tail = newNode;
        }
        Node current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.value = value;
        return true;
    }

    //Remove
    public Node remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node current = this.head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        Node removeNode = current.next;
        current.next = removeNode.next;
        removeNode.next = null;
        this.size -=1;
        return removeNode;
    }
}
