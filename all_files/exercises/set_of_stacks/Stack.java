package all_files.exercises.set_of_stacks;

import java.util.EmptyStackException;

public class Stack {
    private int capacity;
    public StackNode top;
    public StackNode bottom;
    public int size = 0;

    public Stack(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull(){
        return size == capacity;
    }

    public void join(StackNode above, StackNode below){
        if (below != null) {
            below.above = above;
        }
        if (above != null) {
            above.below = below;
        }
    }

    public boolean push(int value){
        if (isFull()){
            return false;
        }
        size++;
        StackNode newNode = new StackNode(value);
        if (size == 1){
            bottom = newNode;
        }
        join(newNode, top);
        top = newNode;
        return true;
    }

    public int pop(){
        if (top == null) throw new EmptyStackException();
        int result = top.value;
        top = top.below;
        size--;
        return result;
    }

    public int removeBottom(){
        StackNode b = bottom;
        bottom = bottom.above;
        if (bottom != null) bottom.below = null;
        size--;
        return b.value;
    }
}
