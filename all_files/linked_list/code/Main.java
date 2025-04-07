package all_files.linked_list.code;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.createSingleLinkedList(5);
        System.out.println(singlyLinkedList.head.value);
    }
}