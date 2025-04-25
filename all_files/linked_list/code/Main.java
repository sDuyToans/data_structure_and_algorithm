package all_files.linked_list.code;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        // System.out.println(singlyLinkedList.head.value);
//        singlyLinkedList.insertInSingleLinkedList(6, 1);
//        singlyLinkedList.insertInSingleLinkedList(7, 3);
//        singlyLinkedList.insertInSingleLinkedList(8,4);
//        singlyLinkedList.insertInSingleLinkedList(9,0);
//
        // System.out.println(singlyLinkedList.head.next.next.value);
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