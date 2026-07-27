
import java.util.*;

public class VerticalOrderTraversal {

    class Node {

        Node left;
        Node right;
        int val;

        Node(int val) {
            this.val = val;
            right = left = null;
        }
    }

    static class Pair {

        Node node;
        int hd;
        int level;
        Pair(Node node, int hd, int level) {
            this.node = node;
            this.hd = hd;
            this.level = level;
        }
    }

    public static List<List<Integer>> VerticalOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0, 0));
        while(!q.isEmpty()) {
            Pair p = q.poll();
            Node node = p.node;
            int hd = p.hd;
            int level = p.level;
            if(!map.containsKey(hd)) {
                map.put(hd, new TreeMap<>());
            }
            if(!map.get(hd).containsKey(level)) {
                map.get(hd).put(level, new PriorityQueue<>());
            }
            map.get(hd).get(level).offer(node.val);
            if(node.left!=null) {
                q.offer(new Pair(node.left, hd-1, level+1));
            }
            if(node.right!=null) {
                q.offer(new Pair(node.right, hd+1, level+1));
            }
        }
        for(TreeMap<Integer, PriorityQueue<Integer>> tm : map.values()) {
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer> pq : tm.values()) {
                while(!pq.isEmpty()) {
                    ans.get(ans.size()-1).add(pq.poll());
                }
            }
        }
        return ans;
    }
        
        //more com-pact version

    public static List<List<Integer>> VerticalOrderTraversal(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0, 0));
        while(!q.isEmpty()) {
            Pair p = q.poll();
            Node node = p.node;
            int hd = p.hd;
            int level = p.level;
            map.putIfAbsent(hd, new TreeMap<>());
            
            map.get(hd).putIfAbsent(level, new PriorityQueue<>());
            map.get(hd).get(level).offer(node.val);

            if(node.left!=null) {
                q.offer(new Pair(node.left, hd-1, level+1));
            }
            if(node.right!=null) {
                q.offer(new Pair(node.right, hd+1, level+1));
            }
        }
        for(var tm: map.values()) {
            ans.add(new ArrayList<>());
            for(var pq : tm.values()) {
                while(!pq.isEmpty()) {
                    ans.get(ans.size()-1).add(pq.poll());
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {

    }
}
