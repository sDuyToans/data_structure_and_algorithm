package all_files.exercises.three_in_one;

public class Main {
    public static void main(String[] args) {
        ThreeInOne newStack = new ThreeInOne(3);
        newStack.push(0, 1);
        newStack.push(0, 2);
        newStack.push(1, 4);
        newStack.push(1, 5);
        newStack.push(2, 8);
        int result = newStack.pop(2);
        System.out.println(result);
        int result1 = newStack.peek(2);
        System.out.println(result1);
    }
}
