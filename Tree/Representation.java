
import java.util.*;
public class Representation{
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }
    class Binary{
        Node root;
        Binary(){
            root = null;
        }
        Node insert(Node root, int val){
            if(root == null) return new Node(val);
            if(val <  root.data){
                root.left = insert(root.left, val);
            }else{
                root.right =  insert(root.right, val);
            }
            return root;
        }
        void inorder(Node root){
            if(root == null) return;
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
        void post(Node root){
            if(root!=null){
                post(root.left);
                post(root.right);
                System.out.print(root.data + " ");
            }
        }
        
        void pre(Node root){
            if(root!=null){
                System.out.print(root.data + " ");
                pre(root.left);
                pre(root.right);
            }
        }
        void level(Node root){
            List<List<Integer>> ans = new ArrayList<>();
            Queue<Node> q = new LinkedList<>();
            q.offer(root);
            while(!q.isEmpty()){
                int size = q.size();
                // List<Integer> nums = new ArrayList<>();
                for(int i=0;i<size;i++){
                    Node temp = q.poll();
                    System.out.print(temp.data + " ");
                    if(temp.left!=null) q.add(temp.left);
                    if(temp.right!=null) q.add(temp.right);
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Representation obj = new Representation();   // outer class object
        Binary bst = obj.new Binary();

        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int val : values) {
            bst.root = bst.insert(bst.root, val);
        }

        System.out.print("Inorder Traversal: ");
        bst.inorder(bst.root);
        System.out.print("Pre Traversal: ");
        bst.pre(bst.root);
        System.out.print("Post Traversal: ");
        bst.post(bst.root);
        System.out.println("Level order Traversal \n");
        bst.level(bst.root);
    }
}