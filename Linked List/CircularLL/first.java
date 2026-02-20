public class first{
    private Node head;
    private Node tail;
    public first(){
        this.head = null;
        this.tail = null;
    }

    class Node{
        int data;
        Node next;

        Node(int val){
            this.data = val;
        }
        Node(int val, Node next){
            this.data = val;
            this.next = next;
        }
    }   
    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            node.next = head;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void delete(int val){
        Node temp = head;
        if(temp==null){
            return;
        }
        if(temp.data == val){
            head = head.next;
            tail.next = head;
            return;
        }
        do { 
            Node n = temp.next;
            if(n.data==val){
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        } while (temp!=head);
    }
    public void display(){
        Node temp = head;
        if(head!=null){
            do { 
                System.out.print(temp.data + "->");
                temp = temp.next;
            } while (temp!= head);
        }
        System.out.println("Head");
    }
    public static void main(String[] args) {
        first list = new first();
        list.insert(2);
        list.insert(5);
        list.insert(6);
        list.insert(9);
        list.display();
        list.delete(5);
        list.display();
    }

}