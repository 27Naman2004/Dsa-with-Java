public class DiameterOfTree {
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        int max = 0;
        public int Diameter(Node root){
            maxDepth(root);
            return max;
        }
        public int maxDepth(Node root){
            if(root==null) return 0;
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            max = Math.max(left+right, max);
            return 1+ Math.max(left, right);
        }
    }
    public static void main(String[] args) {
        
    }
}
