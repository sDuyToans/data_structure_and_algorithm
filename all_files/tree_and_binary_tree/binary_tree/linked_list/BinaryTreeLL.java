package all_files.tree_and_binary_tree.binary_tree.linked_list;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    public BinaryNode root;

    public BinaryTreeLL(){
        this.root = null;
    }

    // PreOrder Traversal
    public void preOrder(BinaryNode node){
        if (node == null) return;
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // Inorder Traversal
    public void inOrder(BinaryNode node){
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }

    // Post Traversal
    public void postOrder(BinaryNode node){
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    // LevelOrder Traversal
    public void levelOrder(BinaryNode node){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode current = queue.remove();
            System.out.print(current.value + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }

    // Search Method
    public void search(BinaryNode node, String val){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode current = queue.remove();
            if (current.value.equals(val)){
                System.out.println(val + " is found in the tree");
                return;
            }
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        System.out.println("The value " + val + " is not found in the tree");
    }

    // Insert
    public void insert(String value){
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;
        if (this.root == null){
            this.root = newNode;
            System.out.println("Successfully inserted " + value + " into the tree ");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode current = queue.remove();
            if (current.left == null){
                current.left = newNode;
                break;
            } else if (current.right == null){
                current.right = newNode;
                break;
            } else {
                queue.add(current.left);
                queue.add(current.right);
            }
        }
        System.out.println("Successfully inserted " + value + " into the tree ");
    }

    // Get Deepest Node - used for delete
    public BinaryNode getDeepest(){
        if (this.root == null) return null;
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode current = null;
        while (!queue.isEmpty()){
            current = queue.remove();
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        return current;
    }

    // Delete deepest
    public void deleteDeepest(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode previous, current = null;
        while (!queue.isEmpty()){
            previous = current;
            current = queue.remove();
            if (current.left == null) {
                previous.right = null;
                return;
            }
            if (current.right == null){
                current.left = null;
                return;
            }
            queue.add(current.left);
            queue.add(current.right);
        }
    }

    // Delete a Node
    public void delete(String value){
        if (this.root == null){
            System.out.println("There is nothing in the tree");
            return;
        }

        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode current = queue.remove();
            if (current.value.equals(value)){
                current.value = getDeepest().value;
                deleteDeepest();
                System.out.println("Delete value from the tree");
                return;
            }
            queue.add(current.left);
            queue.add(current.right);
        }
        System.out.println("The Node is not exist in the Tree!");
    }

    // Delete the entire Tree
    public void deleteEntireTree(){
        this.root = null;
        System.out.println("Binary Tree has been successfully deleted!");
    }
}
