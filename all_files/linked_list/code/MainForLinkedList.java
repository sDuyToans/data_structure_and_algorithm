package all_files.linked_list.code;

public class MainForLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(1);
        linkedList.insertNode(9);
        linkedList.insertNode(5);
        linkedList.insertNode(10);
        linkedList.insertNode(2);
//        linkedList.traversal();
//        linkedList.removeDuplicate();
//        linkedList.traversal();
//        System.out.println(linkedList.returnNthToLast(2).val);
//        linkedList.partition(4);
//        linkedList.traversal();
//        LinkedList list1 = new LinkedList();
//        LinkedList list2 = new LinkedList();
//        list1.insertNode(7);
//        list1.insertNode(1);
//        list1.insertNode(6);
//        list1.traversal();
//        list2.insertNode(5);
//        list2.insertNode(9);
//        list2.insertNode(2);
//        list2.traversal();
//        LinkedList list3 = LinkedList.sumOfTwoLinkedLists(list1, list2);
//        list3.traversal();
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.insertNode(3);
        list1.insertNode(1);
        list1.insertNode(5);
        list1.insertNode(9);
        list2.insertNode(2);
        list2.insertNode(4);
        list2.insertNode(6);
        list1.addSameNode(list1, list2, 7);
        list2.addSameNode(list1, list2, 7);
        list1.addSameNode(list1, list2, 2);
        list2.addSameNode(list1, list2, 2);
        list1.addSameNode(list1, list2, 1);
        list2.addSameNode(list1, list2, 1);
        list1.insertNode(3);
        if (LinkedList.intersection(list1, list2) != null){
            System.out.println(LinkedList.intersection(list1, list2).val);
        } else {
            System.out.println("There is no intersection of list1 and list2");
        }
    }
}
