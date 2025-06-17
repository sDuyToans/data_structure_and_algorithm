package all_files.tree_and_binary_tree.implement_binary_tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

    public Node root;

    public void add(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            addRecursive(root, value);
        }
    }

    private void addRecursive(Node current, int value) {
        Queue<Node> queue = new LinkedList<Node>();
        Node newNode = new Node(value);
        queue.add(current);
        while (!queue.isEmpty()){
            Node temp = queue.remove();
            if (temp.left == null) {
                temp.left = newNode;
                return;
            } else if (temp.right == null) {
                temp.right = newNode;
                return;
            } else {
                queue.add(temp.left);
                queue.add(temp.right);
            }
        }
    }

    public void traverseInOrder() {
        traverseInOrderRecursive(root);
    }

    private void traverseInOrderRecursive(Node node) {
        if (node == null) {
            return;
        } else {
            traverseInOrderRecursive(node.left);
            System.out.print(node.value + " ");
            traverseInOrderRecursive(node.right);
        }
    }

    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    // inorder traversal using stack
    public void inOrderTraversal(Node root) {
        Stack<Node> stack = new Stack<Node>();
        Node current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.value + " ");
            current = current.right;
        }
    }

    // PreOrder Traversal using stack
    public void preOrderTraversal(Node root) {
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node current = stack.pop();
            System.out.print(current.value + " ");
            if (current.right != null) stack.push(current.right);
            if (current.left != null) stack.push(current.left);
        }
    }

    // PostOrder Traversal using Stack
    public void postOrderTraversal(Node root) {
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            Node current = stack1.pop();
            stack2.push(current);
            if (current.left != null) stack1.push(current.left);
            if (current.right != null) stack1.push(current.right);
        }

        while (!stack2.isEmpty()) {
            Node current = stack2.pop();
            System.out.print(current.value + " ");
        }
    }
}
