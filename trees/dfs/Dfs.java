import java.util.*;

class Node {
    int val;
    Node left;
    Node right;
    Node (int val) {
        this.val = val;
    }
}
class Dfs {
    
    public static void main(String[] args) {

        List<Integer> res = new ArrayList<>();

        Node root = new Node(1);
        root.right = new Node(2);
        root.right.left = new Node(3);

        dfs(root,res);
        for (int i:res)
            System.out.print(i+" ");
        
        System.out.println();
        return;
    }

    public static void dfs(Node node, List<Integer> res) {
        if (node == null) return;
        dfs(node.left, res);
        res.add(node.val);
        dfs(node.right, res);
    }
}