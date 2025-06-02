package all_files.queue.queue_via_stack;

import java.util.Stack;

public class QueueViaStack {
    Stack<Integer> stackNewest, stackOldest;

    public QueueViaStack() {
        stackNewest = new Stack<>();
        stackOldest = new Stack<>();
    }

    public int size(){
        return stackNewest.size() + stackOldest.size();
    }

    public void enqueue(int value){
        stackNewest.push(value);
    }

    private void shiftStacks(){
        if (stackOldest.isEmpty()) {
            while (!stackNewest.isEmpty()) {
                stackOldest.push(stackNewest.pop());
            }
        }
    }

    public int dequeue(){
        shiftStacks();
        return stackOldest.pop();
    }

    public int peek(){
        shiftStacks();
        return stackOldest.peek();
    }
}
