package all_files.exercises.set_of_stacks;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class SetOfStacks {
    public ArrayList<Stack> stacks = new ArrayList<>();
    public int capacity;

    public SetOfStacks(int capacity) {
        this.capacity = capacity;
    }

    public Stack getLastStack() {
        if (stacks.isEmpty()) return null;
        return stacks.getLast();
    }

    public void push(int value) {
        Stack lastStack = getLastStack();
        if (lastStack != null && !lastStack.isFull()) {
            lastStack.push(value);
        } else {
            Stack newStack = new Stack(capacity);
            newStack.push(value);
            stacks.add(newStack);
        }
    }

    public int pop() {
        Stack last = getLastStack();
        if (last == null) throw new EmptyStackException();
        int result = last.pop();
        if (last.size == 0){
            stacks.removeLast();
        }
        return result;
    }

    // helper LeftShift
    public int leftShift(int index, boolean removeTop){
        Stack stack = stacks.get(index);
        int removedItem;
        if (removeTop) removedItem = stack.pop();
        else removedItem = stack.removeBottom();
        if (stack.size == 0) {
            stacks.remove(index);
        } else if (stacks.size() > index + 1){
            int v = leftShift(index + 1, false);
            stack.push(v);
        }
        return removedItem;
    }

    public int popAt(int index){
        return leftShift(index, true);
    }
}
