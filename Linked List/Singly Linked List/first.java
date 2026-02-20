public class first {
    private Node tail;
    private Node head;
    private int size;

    public first(){
        this.size = 0;
    }
    private class Node{
        private int data;
        private Node next;
        
        
        public Node(int val){
            this.data = val;
        }
        public Node(int val, Node next){
            this.data=  val;
            this.next = next;
        }
    }
    // insert at beigning
    public void InsertAtBeigning(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail==null){
            tail = head;
        }
        size++;
    }
    // insert at last
    public void insertAtlast(int val){
        if(tail==null){
            InsertAtBeigning(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // insert at index
    public void atIndex(int val, int index){
        if(index==0){
            InsertAtBeigning(val);
            return;
        }
        if(index==size){
            insertAtlast(val);
            return;
        }
        Node temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    // Deletion in the linked list fron first
    public int deleteFirst(){
        int value = head.data;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return value;
    }
    // deletion in the ll   form the last
    public int deletelast(){
        if(size<=1) return deleteFirst();
        Node secLast = getindex(size-2);
        int val = tail.data;
        tail = secLast;
        tail.next = null;
        return val;
    }
    public Node getindex(int  index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }
    
    // delete at index
    public int deleteIndex(int index){
        if(index==0) return deleteFirst();
        if(index==size-1) return deletelast();
        Node prev = getindex(index-1);
        int val = prev.next.data;
        prev.next = prev.next.next;
        return val;
    }
    // find the node val
    public boolean find(int val){
        Node node = head;
        while(node!=null){
            if(node.data==val){
                return true;
            }
            node = node.next;
        }
        return false;
    }
    public int countSize(){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    // display
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }


    public static void main(String[] args) {
        first list = new first();
        list.InsertAtBeigning(2);
        list.InsertAtBeigning(3);
        list.InsertAtBeigning(5);
        list.display();
        list.InsertAtBeigning(10);
        list.display();
        list.insertAtlast(100);
        list.display();
        list.InsertAtBeigning(12);
        list.display();
        list.atIndex(190, 3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deletelast());
        list.display();
        list.deleteIndex(2);
        list.display();
        System.out.println(list.find(10));
        System.out.println(list.countSize());

    }
}
