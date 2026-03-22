import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BoundryOrderTraversal {
    public ArrayList<Integer> boundary(Node root){
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        res.add(root.data);
        leftBoundary(root.left, res);
        leafNodes(root, res);
        rightBoundary(root.right, res);
        return res;
    }
    public void leftBoundary(Node root, ArrayList<Integer> res){
        if(root == null || (root.left == null && root.right == null)) return;
        res.add(root.data);
        if(root.left != null) leftBoundary(root.left, res);
        else leftBoundary(root.right, res);
    }
    public void leafNodes(Node root, ArrayList<Integer> res){
        if(root == null) return;
        if(root.left == null && root.right == null) res.add(root.data);
        leafNodes(root.left, res);
        leafNodes(root.right, res);
    }
    public void rightBoundary(Node root, ArrayList<Integer> res){
        if(root == null || (root.left == null && root.right == null)) return;
        if(root.right != null) rightBoundary(root.right, res);
        else rightBoundary(root.left, res);
        res.add(root.data);
    }
    public static void main(String[] args) {
        
    }
/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
// another approach
class Solution {
    public boolean isLeaf(Node root){
        if(root.left == null && root.right == null) return true;
        else return false;
    }
    public void addRight(Node root, ArrayList<Integer> ans){
        Node curr = root.right;
        ArrayList<Integer> temp = new ArrayList<>();
        while(curr != null){
            if(!isLeaf(curr)){
                temp.add(curr.data);
                // return;
            }
            if(curr.right!=null) curr = curr.right;
            else curr = curr.left;
        }
        for(int i=temp.size()-1;i>=0;i--){
            ans.add(temp.get(i));
        }
    }
    public void addLeft(Node root, ArrayList<Integer> ans){
        Node curr = root.left;
        while(curr!=null){
            if(curr == null) return;
            if(!isLeaf(curr)){
                ans.add(curr.data);
                // return;
            }
            if(curr.left !=null) curr = curr.left;
            else curr = curr.right;
        }
        
    }
    public void addLeaf(Node root, ArrayList<Integer> ans){
        if(root==null) return;
        if(isLeaf(root)){
            ans.add(root.data);
            return;
        }
        addLeaf(root.left, ans);
        addLeaf(root.right, ans);
    }

    
    ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        if(!isLeaf(root)){
            ans.add(root.data);
        }
        addLeft(root, ans);
        addLeaf(root, ans);
        addRight(root,ans);
        return ans;
    }
}
}
