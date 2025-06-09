package all_files.tree_and_binary_tree.simple_tree;

import java.util.ArrayList;

public class TreeNode {
    String data;
    ArrayList<TreeNode> children;

    public TreeNode(String data){
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addTree(TreeNode child){
        children.add(child);
    }

    public String print(int level){
        String ret;
        ret = "  ".repeat(level) + data + "\n";
        for (TreeNode child : children){
            ret += child.print(level + 1);
        }
        return ret;
    }
}
