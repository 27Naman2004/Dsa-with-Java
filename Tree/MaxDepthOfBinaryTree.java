
public class MaxDepthOfBinaryTree {
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        public int maxDepth(Node root){
            if(root==null) return 0;
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return 1+ Math.max(left, right);
        }
    }
    public static void main(String[] args) {

    }
}