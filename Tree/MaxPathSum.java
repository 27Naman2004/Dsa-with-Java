class MaxPathSum{
    class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    int max = Integer.MIN_VALUE;
    public int maxpathSum(Node root){
        return helper(root);
    }
    public int helper(Node root){
        if(root==null) return 0;
        int left = Math.max(0, helper(root.left));
        int right = Math.max(0, helper(root.right));
        int pathsum = left+right+root.data;
        max = Math.max(max, pathsum);

        //  ye path ko linear rakhne ke liye hai, kyuki hume path ko linear rakhna hai, aur max path sum ko update karna hai agar ye nh hota toh ->  ((left) -> root ->(right)) isme ye ati ki parent ek bar mai dono side krege conti that is imposiible at a time.
        return Math.max(left, right) + root.data;
    }
}