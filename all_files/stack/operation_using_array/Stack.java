package all_files.stack.operation_using_array;

public class Stack {
    int[] arr;
    int topOfStack;

    // creation
    public Stack(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("Stack is created with the size of " + size);
    }

    // isEmpty
    public boolean isEmpty(){
        return this.topOfStack == -1;
    }

    // isFull
    public boolean isFull(){
        // when add 1 element then +1 in topOfStack that why
        return this.topOfStack == arr.length - 1;
    }

    // push
    public void push(int x){
        if (isFull()){
            System.out.println("Stack is full");
        } else {
            arr[++this.topOfStack] = x;
            System.out.println("The value is successfully inserted into the stack");
        }
    }

    // pop
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[this.topOfStack--];
        }
    }

    // peek - get the last but not remove
    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[this.topOfStack];
        }
    }

    // delete stack - full elements
    public void delete(){
        this.arr = null;
        this.topOfStack = -1;
        System.out.println("Stack is deleted");
    }
}
