import java.util.*;

public class Node {
    int val;
    Node left;
    Node right;
    Node (int val) {
        this.val = val;
    }
}
class Dfs {
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);

        dfs(root);
        return;
    }

    public static void dfs(Node node) {
        if (node == null) return;
        dfs(node.left);
        System.out.print(node.val+" ");
        dfs(node.right);
    }
}