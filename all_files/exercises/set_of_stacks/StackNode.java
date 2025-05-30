package all_files.exercises.set_of_stacks;

public class StackNode {
    public StackNode above;
    public StackNode below;
    public int value;

    public StackNode(int value) {
        this.value = value;
    }
}
