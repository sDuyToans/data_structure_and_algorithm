package all_files.linked_list.code;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.push(5) ; // Success
        singlyLinkedList.push(10);  // Success
        singlyLinkedList.push(15);  // Success
        singlyLinkedList.push(20);  // Success
        singlyLinkedList.push(25);  // Success
        singlyLinkedList.traverseSinglyLinkedList();
        singlyLinkedList.rotate(3);
        singlyLinkedList.traverseSinglyLinkedList();
    }
}