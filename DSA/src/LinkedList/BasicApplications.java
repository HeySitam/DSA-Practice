package LinkedList;

public class BasicApplications {
    public static void main(String[] args){
       LL list = new LL();
       list.insertFirst(12);
       list.insertFirst(13);
       list.insertFirst(1);
       list.insertFirst(92);
       list.insertFirst(32);
       list.insertLastWithTail(23);
       list.insertLastWithoutTail(24);
       list.display();
       list.insertAt(5,3);
       list.display();
    }
}
