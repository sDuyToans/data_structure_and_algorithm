package all_files.linked_list.code;

public class MainForCircular {
    public static void main(String[] args) {
        CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
        circularSinglyLinkedList.createCCSL(3);
        circularSinglyLinkedList.insertCSLL(0, 6);
        circularSinglyLinkedList.insertCSLL(1, 20);
        circularSinglyLinkedList.insertCSLL(8, 15);

        System.out.println(circularSinglyLinkedList.tail.next.value);

        circularSinglyLinkedList.traverseCCSL();

        circularSinglyLinkedList.searchCCSL(20);

        circularSinglyLinkedList.deleteCCSL(1);

        circularSinglyLinkedList.traverseCCSL();
    }
}
