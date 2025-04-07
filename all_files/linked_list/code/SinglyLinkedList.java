package all_files.linked_list.code;

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
}
