package all_files.stack.operation_using_linked_list;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.singlyLinkedList.head.value);
        System.out.println(stack.pop());
        System.out.println(stack.singlyLinkedList.head.value);
        System.out.println(stack.pop());
        System.out.println(stack.singlyLinkedList.head.value);
    }
}
