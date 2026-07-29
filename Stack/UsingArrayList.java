
import java.util.ArrayList;

public class UsingArrayList {
    static class Stack{
        static ArrayList<Integer> arr = new ArrayList<>();

        public static boolean  isEmpty(){
            return arr.size() == 0;
        }
        public static void push(int data){
            arr.add(data);
        }
        
        public static int pop(){
            int top = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            return top;
        }
        public static int peek(){
            return arr.get(arr.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
