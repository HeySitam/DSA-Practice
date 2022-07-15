package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = node;
        }
        size ++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("End");
    }

    // TC -> O(1)
    public void insertLastWithTail(int val){
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
        this.size++;
    }

    // TC -> O(n)
    public void insertLastWithoutTail(int val){
        Node newNode = new Node(val);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        size ++;
    }

    public void insertAt(int val, int pos){
        Node newNode = new Node(val);
        Node temp = head;
        int idx = 1;
        while(idx<pos){
            temp= temp.next;
            idx++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
