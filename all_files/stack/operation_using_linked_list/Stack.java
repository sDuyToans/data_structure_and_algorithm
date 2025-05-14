package all_files.stack.operation_using_linked_list;

public class Stack {
    SinglyLinkedList singlyLinkedList;

    public Stack() {
        singlyLinkedList = new SinglyLinkedList();
    }

    // push method
    public void push(int value) {
        singlyLinkedList.insert(value);
        System.out.println("Value successfully pushed to the stack");
    }

    // isEmpty
    public boolean isEmpty(){
        return this.singlyLinkedList.head == null;
    }

    // pop
    public int pop() {
        return this.singlyLinkedList.pop();
    }

    // peek
    public int peek() {
        return this.singlyLinkedList.head == null ? -1 : this.singlyLinkedList.head.value;
    }

    // delete
    public void delete(){
        this.singlyLinkedList.head = null;
        System.out.println("Stack is deleted");
    }

    // isBalanced parenthesis exercises
    public boolean isBalancedParenthesis(String expression){
        Stack stack = new Stack();
        for (int i = 0; i < expression.length(); i++){
            if (expression.charAt(i) == '(' || expression.charAt(i) == '{' || expression.charAt(i) == '['){
                stack.push(expression.charAt(i));
            } else if (expression.charAt(i) == ')' ||  expression.charAt(i) == '}' ||  expression.charAt(i) == ']'){
                if (stack.isEmpty()){
                    return false;
                } else {
                    if ((expression.charAt(i) == '(' && stack.peek() != '(') || (expression.charAt(i) == '{' && stack.peek() != '{')|| (expression.charAt(i) == '[' && stack.peek() != '[')){
                        return false;
                    } else {
                        stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
