import java.util.*;
public class VerticalOrderTraversal {
    class Node{
        Node left;
        Node right;
        int val;
        Node(int val){
            this.val = val;
            right = left = null;
        }
    }
    static class Pair{
        Node node;
        int hd;
        Pair(Node node,int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public static List<List<Integer>> VerticalOrder(Node root){
        List<List<Integer>> ans = new ArrayList<>();
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0));
        if(root==null) return ans;
        while(!q.isEmpty()){
            Pair curr = q.poll();
            Node node = curr.node;
            int hd = curr.hd;

            if(!map.containsKey(hd)){
                map.put(hd, new ArrayList<>());
            }
            map.get(hd).add(node.val);

            if(node.left!=null){
                q.offer(new Pair(node, hd-1));
            }
            if(node.right!=null){
                q.offer(new Pair(node, hd+1));
            }
        }
        for(ArrayList<Integer> list : map.values()){
            ans.add(list);
        }
        return ans;
    }
    public static void main(String[] args){

    }
}