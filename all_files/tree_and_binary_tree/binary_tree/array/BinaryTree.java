package all_files.tree_and_binary_tree.binary_tree.array;

public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size){
        this.arr = new String[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("Balan tree of size " + size + " has been created!");
    }

    // isFull
    public boolean isFull(){
        return lastUsedIndex == arr.length - 1;
    }

    // insert
    public void insert(String value){
        if (isFull()){
            System.out.println("The tree is full!");
        } else {
            arr[++lastUsedIndex] = value;
            System.out.println("The value has been inserted!");
        }
    }

    // PreOrder Traversal
    public void preOrder(int rootIndex){
        if (rootIndex > lastUsedIndex){
            return;
        }
        System.out.print(this.arr[rootIndex] + " ");
        preOrder(rootIndex * 2);
        preOrder(rootIndex * 2 + 1);
    }

    // InOrder Traversal
    public void inOrder(int rootIndex){
        if (rootIndex > lastUsedIndex){
            return;
        }
        inOrder(rootIndex * 2);
        System.out.print(arr[rootIndex] + " ");
        inOrder(rootIndex * 2 + 1);
    }

    // PostOrder Traversal
    public void postOrder(int rootIndex){
        if (rootIndex > lastUsedIndex){
            return;
        }
        postOrder(rootIndex * 2);
        postOrder(rootIndex * 2 + 1);
        System.out.print(arr[rootIndex] + " ");
    }

    // LevelOrder Traversal
    public void levelOrder(){
        for (int i = 1; i <= lastUsedIndex; i++){
            System.out.print(arr[i] + " ");
        }
    }

    // Search
    public int search(String value){
        for(int i = 1; i <= lastUsedIndex; i++){
            if (arr[i].equals(value)){
                System.out.println("Value found at index " + i);
                return i;
            }
        }
        System.out.println("Value not found!");
        return -1;
    }

    // Delete A Node
    public void delete(String value){
        int index = search(value);
        if (index == -1){
            return;
        } else {
            arr[index] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("Value has been deleted!");
        }
    }

    // Delete entire tree
    public void deleteRoot(){
        try {
            this.arr = null;
            System.out.println("Deleted the tree!");
        } catch (Exception e) {
            System.out.println("There is a error when deleting the tree: " + e.getMessage());
        }
    }
}
