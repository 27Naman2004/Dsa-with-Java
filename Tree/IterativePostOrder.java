import java.util.*;

public class IterativePostOrder {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
            left = right = null;
        }
    }

    static Stack<Node> iterativePost(Node root) {
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        if (root == null)
            return s2;

        s1.push(root);

        while (!s1.isEmpty()) {
            Node curr = s1.pop();
            s2.push(curr);

            if (curr.left != null)
                s1.push(curr.left);

            if (curr.right != null)
                s1.push(curr.right);
        }

        return s2; // contains postorder in reverse pop order
    }
    static List<Integer> Using1Stack(Node root){
        Stack<Node> st = new Stack<>();
        Node curr = root;
        List<Integer> ans = new ArrayList<>();
        while(curr!= null || !st.isEmpty()){
            if(curr != null){
                st.add(curr);
                curr = curr.left;
            }
            else{
                Node temp = st.peek().right;
                if(temp==null){
                    temp = st.peek();
                    st.pop();
                    ans.add(temp.val);
                    while(!st.isEmpty() && temp == st.peek().right){
                        temp = st.peek();
                        st.pop();
                        ans.add(temp.val);
                    }
                }
                else curr = temp;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        /*
                1
               / \
              2   3
             / \
            4   5
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Stack<Node> result = iterativePost(root);
        List<Integer> ans = Using1Stack(root);

        System.out.println("\nTwo Stack Output:");
        while (!result.isEmpty()) {
            System.out.print(result.pop().val + " ");
        }
        System.out.println("\nOne Stack Output:");
        for (int val : ans) {
            System.out.print(val + " ");
        }
    }
}
