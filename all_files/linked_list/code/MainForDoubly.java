package all_files.linked_list.code;

public class MainForDoubly {
    public static void main(String[] args) {
        DoublyLinkedList DLL = new DoublyLinkedList();
        DLL.createDoublyLinkedList(1);
        DLL.insertDLL(2, 0);
        DLL.insertDLL(3, 1);
        DLL.insertDLL(4, 7);
        DLL.printDLL();
        DLL.reversePrintDLL();
//        DLL.search(4);
        DLL.deleteNode(2);
        DLL.printDLL();
        DLL.deleteAll();
        DLL.printDLL();
    }
}
