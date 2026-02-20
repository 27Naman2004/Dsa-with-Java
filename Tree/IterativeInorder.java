import java.util.*;
public class IterativeInorder{
    class Node{
        int val;
        Node right;
        Node left;
        Node(int val){
            this.val =val;
            right = left = null;
        }

        List<Integer> IterativeInOreder(Node root){
            Stack<Node> st = new Stack<>();
            List<Integer> ans = new ArrayList<>();
            Node n = root;
            while(true){
                if(root!=null){
                    st.push(n);
                    n = n.left;
                }
                else{
                    if(st.isEmpty()){
                        break;
                    }
                    n = st.pop();
                    ans.add(n.val);
                    n = n.right;
                }
            }
            return ans;
        }
    }
    public static void main(String[] args) {
        
    }
}