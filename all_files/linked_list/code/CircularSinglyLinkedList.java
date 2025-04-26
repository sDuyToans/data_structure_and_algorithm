package all_files.linked_list.code;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCCSL(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = newNode;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }

    // insert
    public void insertCSLL(int location, int value) {
        if (head == null) {
            createCCSL(value);
        } else {
            Node newNode = new Node();
            newNode.value = value;
            if ( location == 0 ) {
                newNode.next = head;
                head = newNode;
                tail.next = newNode;
            } else if ( location >= size ) {
                tail.next = newNode;
                newNode.next = head;
                tail = newNode;
            } else {
                Node current = head;
                for (int i = 0; i < location - 1; i++) {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
            }
            size++;
        }
    }

    // traverse
    public void traverseCCSL() {
        if (head == null) {
            System.out.println("Circular Singly Linked List is Empty");
        } else {
            Node current = head;
            for (int i = 0; i < size; i++) {
                System.out.print(current.value);
                if (i < size - 1) {
                    System.out.print(" -> ");
                }
                current = current.next;
            }
            System.out.println();
        }
    }

    // searching
    public boolean searchCCSL(int nodeValue) {
        if (head == null) {
            return false;
        } else {
            Node current = head;
            for (int i = 0; i < size; i++) {
                if (current.value == nodeValue) {
                    System.out.println("Found Node at location: " + i);
                    return true;
                }
                current = current.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    // deletion
    public void deleteCCSL(int location) {
        if (head == null) {
            return;
        } else {
           if (location == 0) {
               head = head.next;
               tail.next = head;
               size--;
               return;
           } else if (location >= size ) {
               Node current = head;
               for (int i = 0; i < size - 1; i++) {
                   current = current.next;
               }
               if (current == head) {
                   head.next = null;
                   tail = head = null;
                   size --;
                   return;
               }
               current.next = head;
               tail = current;
               size --;
           } else {
               Node current = head;
               for (int i = 0; i < location - 1; i++) {
                   current = current.next;
               }
               current.next = current.next.next;
               size--;
           }
        }
    }

    // delete entire circular linked list
    public void deleteAllCCSL() {
        if (head == null) {
            System.out.println("The CSLL is not exist!");
        } else {
            head = null;
            tail.next = null;
            tail = null;
            size = 0;
            System.out.println("The CSLL has been deleted");
        }
    }
}
