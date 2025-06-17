package all_files.binary_search_tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(70);
        bst.insert(50);
        bst.insert(90);
        bst.insert(30);
        bst.insert(60);
        bst.insert(80);
        bst.insert(100);
        bst.insert(20);
        bst.insert(40);
        bst.preOrder(bst.root);
        System.out.println();
        bst.inOrder(bst.root);
        System.out.println();
        bst.postOrder(bst.root);
        System.out.println();
        bst.levelOrder(bst.root);
        System.out.println();
        bst.search(bst.root, 40);
        bst.delete(bst.root, 90);
        bst.levelOrder(bst.root);
        System.out.println();

    }
}
