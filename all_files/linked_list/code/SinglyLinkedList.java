package all_files.linked_list.code;

/*
 * Linked List build with methods (created, insert, traversal,...)
 */
public class SinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLinkedList(int value) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = value;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInSingleLinkedList(int nodeValue, int location) {
        Node new_node = new Node();
        new_node.value = nodeValue;
        if (this.head == null) {
            this.head = new_node;
            this.tail = new_node;
        } else if (location == 0) {
            new_node.next = head;
            head = new_node;
        } else if (location >= this.size) {
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

    public void traverseSinglyLinkedList() {
        if (this.head == null) {
            System.out.println("Single Linked List does not exist!");
        } else {
            Node temp = this.head;
            for (int i = 0; i < this.size; i++) {
                System.out.print(temp.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                temp = temp.next;
            }
        }
        System.out.println("\n ");
    }

    public boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = this.head;
            for (int i = 0; i < this.size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Found the node at location: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Not found!");
        return false;
    }

    public void deletionOfNode(int location) {
        if (head == null) {
            System.out.println("Single linkedlist does not exist!");
            return;
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                this.tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < this.size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                this.tail = this.head = null;
                size--;
                return;
            }
            tempNode.next = null;
            this.tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    // Delete entire the LinkedList
    public void deleteSLL(){
        this.head = null;
        this.tail = null;
        this.size = 0;
        System.out.println("The SLL deleted sucessfully");
    }
}
