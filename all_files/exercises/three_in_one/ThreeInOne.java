package all_files.exercises.three_in_one;

public class ThreeInOne {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ThreeInOne(int stackSize) {
        // TODO
        stackCapacity = stackSize * numberOfStacks;
        values = new int[stackCapacity];
        for (int i = 0; i < stackCapacity; i++) {
            values[i] = Integer.MIN_VALUE;
        }
        sizes = new int[numberOfStacks];
        sizes[0] = 0;
        sizes[1] = stackCapacity / numberOfStacks;
        sizes[2] = 2 * stackCapacity / numberOfStacks;
    }

    // isFull
    public boolean isFull(int stackNum) {
        return switch (stackNum) {
            case 0 -> values[stackCapacity / numberOfStacks] != Integer.MIN_VALUE;
            case 1 -> values[2 * stackCapacity / numberOfStacks] != Integer.MIN_VALUE;
            case 2 -> values[values.length - 1] != Integer.MIN_VALUE;
            default -> false;
        };
    }

    // isEmpty
    public boolean isEmpty(int stackNum) {
        return switch (stackNum){
            case 0 -> values[0] == Integer.MIN_VALUE && indexOfTop(stackNum) - 1 != 0;
            case 1 -> values[stackCapacity / numberOfStacks] == Integer.MIN_VALUE
                    && indexOfTop(stackNum) -1 != stackCapacity / numberOfStacks;
            case 2 -> values[2 * stackCapacity / numberOfStacks] == Integer.MIN_VALUE
                    && indexOfTop(stackNum) -1 != 2 * stackCapacity / numberOfStacks;
            default -> false;
        };
    }

    // indexOfTop - this is helper method for push, pop and peek methods

    private int indexOfTop(int stackNum) {
        return switch (stackNum) {
            case 0 ->  sizes[0];
            case 1 ->  sizes[1];
            case 2 ->  sizes[2];
            default -> -1;
        };
    }

    // push
    public void push(int stackNum, int value) {
        if (isFull(stackNum)) {
            System.out.println("Stack is full");
        } else {
            values[indexOfTop(stackNum)] = value;
            sizes[stackNum]++;
        }
    }

    // pop
    public int pop(int stackNum) {
        if (isEmpty(stackNum)) {
            System.out.println("Stack is empty");
        } else {
            int temp = values[indexOfTop(stackNum) - 1];
            values[indexOfTop(stackNum) - 1] = Integer.MIN_VALUE;
            sizes[stackNum]--;
            return temp;
        }
        return -1;
    }

    // peek

    public int peek(int stackNum) {
        if (isEmpty(stackNum)) {
            System.out.println("Stack is empty");
        } else {
            return values[indexOfTop(stackNum) - 1];
        }
        return -1;
    }
}
