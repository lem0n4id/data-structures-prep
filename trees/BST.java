import java.util.*;

public class BST {
    class Node {
        int val;
        Node left,right;

        Node (int val) {
            this.val=val;
        }
    }

    Node root;

    BST() { root=null; }
    
    BST(int val) {
        root=new Node(val);
    }

    void insert(int val) {
        root=insertRec(root,val);
    }

    Node insertRec(Node root, int val) {
        if (root==null) { 
            root=new Node(val);
            return root; 
        }

        else if (val<root.val) {
            root.left=insertRec(root.left,val);
        }
        else if (val>root.val) {
            root.right=insertRec(root.right,val);
        }

        return root;
    }

    void inorder() {inorderRec(root);}

    void inorderRec(Node root) {
        if (root==null) { return; }

        inorderRec(root.left);
        System.out.print(root.val+" ");
        inorderRec(root.right);
    }

    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.inorder();
    }
}