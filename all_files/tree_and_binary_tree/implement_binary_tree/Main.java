package all_files.tree_and_binary_tree.implement_binary_tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.traverseInOrder();
        System.out.println();
        tree.inOrderTraversal(tree.root);
        System.out.println();
        tree.preOrderTraversal(tree.root);
        System.out.println();
        tree.postOrderTraversal(tree.root);
    }
}
