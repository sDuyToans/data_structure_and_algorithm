package all_files.linked_list.code;

public class MainForCircularDoublyLinkedList {
    public static void main(String[] args) {
        var DCLL = new DoubleCircularLinkedList();
        DCLL.createDCLL(1);
        System.out.println(DCLL.head.value);
        DCLL.insertDCLL(2, 0);
        DCLL.insertDCLL(3, 2);
        DCLL.insertDCLL(10, 9);
        DCLL.traversal();
        DCLL.reverseTraversal();
//        DCLL.searchDCLL(20);
//        DCLL.deleteNode(1);
        DCLL.traversal();
        DCLL.deleteAll();
        DCLL.traversal();
    }
}
