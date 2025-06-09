package all_files.tree_and_binary_tree.simple_tree;

public class Main {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");
        TreeNode tea = new TreeNode("Tee");
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode wine = new TreeNode("wine");
        TreeNode bear = new TreeNode("Bear");
        drinks.addTree(hot);
        drinks.addTree(cold);
        hot.addTree(tea);
        hot.addTree(coffee);
        cold.addTree(wine);
        cold.addTree(bear);
        System.out.println(drinks.print(0));
    }
}
