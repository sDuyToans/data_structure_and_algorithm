package all_files.linked_list.code;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.createSingleLinkedList(5);
        // System.out.println(singlyLinkedList.head.value);
        singlyLinkedList.insertInSingleLinkedList(6, 1);
        singlyLinkedList.insertInSingleLinkedList(7, 3);
        singlyLinkedList.insertInSingleLinkedList(8,4);
        singlyLinkedList.insertInSingleLinkedList(9,0);
        
        // System.out.println(singlyLinkedList.head.next.next.value);
        // singlyLinkedList.traverseSinglyLinkedList();

        // singlyLinkedList.searchNode(10);
        singlyLinkedList.traverseSinglyLinkedList();
        // singlyLinkedList.deletionOfNode(0);
        // singlyLinkedList.traverseSinglyLinkedList();

        singlyLinkedList.push(30);
        singlyLinkedList.traverseSinglyLinkedList();

        singlyLinkedList.pop();
        singlyLinkedList.traverseSinglyLinkedList();
        // singlyLinkedList.pop();
        // singlyLinkedList.traverseSinglyLinkedList();
        
        singlyLinkedList.insert(11, 5);
        singlyLinkedList.traverseSinglyLinkedList();

        
    }
}