package all_files.binary_search_tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    public BinaryNode root;

    public BinarySearchTree() {
        root = null;
    }

    // Insert
    private BinaryNode insert(BinaryNode currentNode, int val) {
        if (currentNode == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = val;
            return newNode;
        } else if (val <= currentNode.value){
            currentNode.left = insert(currentNode.left, val);
            return currentNode;
        } else {
            currentNode.right = insert(currentNode.right, val);
            return currentNode;
        }
    }

    void insert(int value){
        root = insert(root, value);
    }

    // PreOrder Traversal
    void preOrder(BinaryNode currentNode){
        if (currentNode == null) return;
        System.out.print(currentNode.value + " ");
        preOrder(currentNode.left);
        preOrder(currentNode.right);
    }

    // InOrder Traversal
    void inOrder(BinaryNode currentNode){
        if (currentNode == null) return;
        inOrder(currentNode.left);
        System.out.print(currentNode.value + " ");
        inOrder(currentNode.right);
    }

    // PostOrder Traversal
    void postOrder(BinaryNode currentNode){
        if (currentNode == null) return;
        postOrder(currentNode.left);
        postOrder(currentNode.right);
        System.out.print(currentNode.value + " ");
    }

    // LevelOrder Traversal
    void levelOrder(BinaryNode currentNode){
        if (currentNode == null) return;
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(currentNode);
        while (!queue.isEmpty()){
            currentNode = queue.poll();
            System.out.print(currentNode.value + " ");
            if (currentNode.left != null) queue.add(currentNode.left);
            if (currentNode.right != null) queue.add(currentNode.right);
        }
    }

    // Search
    BinaryNode search(BinaryNode currentNode, int val){
        if (currentNode == null) return null;
        if (currentNode.value == val) {
            System.out.println("Value " + val + " found in BST");
            return currentNode;
        }  else if (currentNode.value > val) {
            return search(currentNode.left, val);
        } else return search(currentNode.right, val);
    }

    // Minimum Node
    public static BinaryNode minimumNode(BinaryNode root) {
        if (root == null) return null;
        if (root.left == null) return root;
        return minimumNode(root.left);
    }

    // Delete a node
    public BinaryNode delete(BinaryNode root, int val) {
        if (root == null) return null;
        if (val < root.value) {
            root.left = delete(root.left, val);
        } else if (val > root.value) {
            root.right = delete(root.right, val);
        } else {
            if (root.left != null && root.right != null) {
                BinaryNode temp = root;
                BinaryNode minNodeForRight = minimumNode(root.right);
                root.value = minNodeForRight.value;
                root.right = delete(root.right, minNodeForRight.value);
            } else if (root.left != null) {
                root = root.left;
            } else if (root.right != null) {
                root = root.right;
            } else {
                root = null;
            }
        }
        return root;
    }

    // Delete all nodes
    void deleteAll() {
        root = null;
        System.out.println("Deleting all nodes");
    }
}
