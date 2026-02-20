import java.util.*;
public class First {

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int val) {
            this.data = val;
        }

        Node(int val, Node next, Node prev) {
            this.data = val;
            this.next = next;
            this.prev = prev;
        }
    }

    Node head;
    int size = 0;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if (head != null)
            head.prev = node;

        head = node;
        size++;
    }
    public void reverse(){
        Node temp = head;
        Stack<Integer> st = new Stack<>();
        while(temp!=null){
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp!=null){
            temp.data = st.pop();
            temp = temp.next;
        }
    }
    public void insertLast(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            node.prev = null;
            node.next = null;
            size++;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
        node.prev = temp;
        node.next = null;
        size++;
    }

    public void insertAtIndex(int val, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next, temp);
        temp.next.prev = node;
        temp.next = node;
        size++;
    }
    public Node find(int after){
        Node node = head;
        while(node!=null){
            if(node.data == after){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void insertAfter(int val, int after){
        Node pre = find(after);
        if(pre==null){
            System.out.println("Dose not exist");
        }
        Node node = new Node(val);
        node.next = pre.next;
        pre.next =  node;
        node.prev = pre;
        if(node.next!=null) node.next.prev = node;
    }
    public void display() {
        Node node = head;
        Node last = null;

        while (node != null) {
            System.out.print(node.data + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        while (last != null) {
            System.out.print(last.data + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public static void main(String[] args) {
        First list = new First();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.display();

        list.insertLast(90);
        list.display();

        list.insertAtIndex(50, 4);
        list.display();
        list.insertAfter(30, 3);
        list.display();
        list.reverse();
        list.display();
    }
}
