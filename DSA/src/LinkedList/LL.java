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
        if(tail == null){
            insertFirst(val);
            return;
        }
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
        if(pos == 0){
            insertFirst(val);
            size++;
            return;
        }
        if(pos == size-1){
            insertLastWithTail(val);
            size++;
            return;
        }

        Node newNode = new Node(val);
        Node temp = head;
        int idx = 1;
        while(idx<pos-1){
            temp= temp.next;
            idx++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void deleteFirst(){
        Node temp = head;
        head = head.next;
        temp .next = null;
        size--;
    }

    public void deleteLast(){
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
    }

    public void deleteAt(int pos){
        if(pos-1 == 0){
            deleteFirst();
            size--;
            return;
        }
        if(pos == size){
            deleteLast();
            size--;
            return;
        }
        Node temp = head;
        int idx = 1;
        while(idx < pos-1){
            temp = temp.next;
            idx++;
        }
        Node nextTemp = temp.next;
        temp.next = nextTemp.next;
        nextTemp.next = null;
        size--;
    }

    public int findPos(int val){
        Node temp = head;
        int idx = 0;
        while(temp != null){
            if(temp.val  == val){
                return idx;
            }
            temp = temp.next;
            idx ++;
        }
        return -1;
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
