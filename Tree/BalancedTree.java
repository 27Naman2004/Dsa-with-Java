
public class BalancedTree {
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        public boolean isBalance(Node root){
            return height(root)!= -1;
        }
        public int height(Node root){
            if(root==null) return 0;
            int left = height(root.left);
            int right = height(root.right);
            if(left==-1 && right==-1) return -1;
            if(Math.abs(left-right)>1) return -1;
            return Math.max(left, right)+1;
        }
    }
    public static void main(String[] args) {

    }
}