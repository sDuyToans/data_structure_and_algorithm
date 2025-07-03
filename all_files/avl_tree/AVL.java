package all_files.avl_tree;

import java.util.LinkedList;
import java.util.Queue;

public class AVL {
    BinaryNode root;

    public AVL() {
        root = null;
    }

    // PreOrder Traversal
    public void preOrder(BinaryNode node) {
        if (node == null){
            return;
        } else {
            System.out.print(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // InOrder Traversal
    public void inOrder(BinaryNode node) {
        if (node == null){
            return;
        } else {
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }
    }

    // PostOrder Traversal
    public void postOrder(BinaryNode node) {
        if (node == null){
            return;
        } else {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.value + " ");
        }
    }

    // LevelOrder Traversal
    public void levelOrder(BinaryNode node) {
        if (node == null) return;
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(node);
        while (!queue.isEmpty()) {
            BinaryNode cur = queue.poll();
            System.out.print(cur.value + " ");
            if (cur.left != null) queue.add(cur.left);
            if (cur.right != null) queue.add(cur.right);
        }
    }

    // Search
    public BinaryNode search(BinaryNode node, int val) {
        if (node == null) return null;
        if (node.value == val) return node;
        if (node.value > val) return search(node.left, val);
        else return search(node.right, val);
    }

    // get height
    public int getHeight(BinaryNode node) {
        if (node == null) return 0;
        return node.height;
    }

    // rotate right
    private BinaryNode rotateRight(BinaryNode disbalancedNode) {
        BinaryNode newRoot = disbalancedNode.left;
        disbalancedNode.left = disbalancedNode.left.right;
        newRoot.right = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    // rotate left
    private BinaryNode rotateLeft(BinaryNode disbalancedNode) {
        BinaryNode newRoot = disbalancedNode.right;
        disbalancedNode.right = disbalancedNode.right.left;
        newRoot.left = disbalancedNode;
        disbalancedNode.height = 1 + Math.max(getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    // get balance
    public int getBalance(BinaryNode node) {
        if (node == null) return 0;
        return getHeight(node.left) - getHeight(node.right);
    }

    // Insert
    private BinaryNode insert(BinaryNode node, int val) {
        if (node == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = val;
            newNode.height = 1;
            return newNode;
        } else if (val <= node.value) {
            node.left = insert(node.left, val);
        } else {
            node.right = insert(node.right, val);
        }

        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));

        int balance = getBalance(node);

        if (balance > 1 && val < node.left.value) {
            return rotateRight(node);
        }

        if (balance > 1 && val > node.left.value) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        if (balance < -1 && val > node.right.value) {
            return rotateLeft(node);
        }

        if (balance < -1 && val < node.right.value) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }

        return node;
    }

    public void insert(int val){
        root = insert(root, val);
    }

    // minimum node
    public static BinaryNode findMin(BinaryNode root) {
        if (root.left == null) return root;
        return findMin(root.left);
    }

    // Delete Node
    private BinaryNode deleteNode(BinaryNode node, int val) {
        if (node == null) {
            System.out.println("The value not found in the AVL tree");
            return node;
        }
        if (val < node.value) {
            node.left = deleteNode(node.left, val);
        } else if (val > node.value) {
            node.right = deleteNode(node.right, val);
        } else {
            if (node.left != null && node.right != null){
                BinaryNode tempNode = node;
                BinaryNode minNodeForRight = findMin(tempNode.right);
                node.value = minNodeForRight.value;
                node.right = deleteNode(node.right, minNodeForRight.value);
            } else if (node.left != null){
                node = node.left;
            } else if (node.right != null){
                node = node.right;
            } else {
                node = null;
            }
        }
        int balance = getBalance(node);

        if (balance > 1 && getBalance(node.left) >= 0) {
            // Left Left condition
            return rotateRight(node);
        }
        if (balance > 1 && getBalance(node.left) < 0) {
            // Left Right condition
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }

        if (balance < -1 && getBalance(node.right) <= 0) {
            // Right Right condition
            return rotateLeft(node);
        }
        if (balance < -1 && getBalance(node.right) > 0) {
            // Left Right condition
            node.right = rotateRight(node.right);
            return rotateRight(node);
        }
        return node;
    }

    public void delete(int val) {
        root = deleteNode(this.root, val);
    }

    public void deleteAVL(){
        this.root = null;
        System.out.println("Successfully delete AVL tree");
    }
}
