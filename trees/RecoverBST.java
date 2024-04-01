import java.util.*;

class Node {
    int val;
    Node left,right;

    Node (int val) {
        this.val=val;
    }
}
class BST {
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

    void storeInVector(Node root, List<Integer> v) {
        if (root==null) { return; }

        storeInVector(root.left, v);
        v.add(root.val);
        storeInVector(root.right, v);
    }
}

public class RecoverBST {
    public static void main(String[] args) {
        BST tree = new BST();

        // Input: root = [1,3,null,null,2]
        tree.root = new Node(1);
        tree.root.left = new Node(3); 
        tree.root.left.right = new Node(2); 

        tree.inorder(); // Output: 3 1 2
        System.out.println();

        List<Integer> vec = new ArrayList<Integer>();
        tree.storeInVector(tree.root, vec);
        // List<Integer> srt = new ArrayList<>(vec);


        Collections.sort(vec);
        // int l=vec.size();
        // for (int i=0; i<l; i++) 
        //     vec.get(i).val=srt.get(i);

        for (int i:vec) 
            System.out.print(i+" ");
        
        System.out.println();
    }
}

// TODO- handle input output

// Input: 1,3,null,null,2
// Output: 3,1,null,null,2