package LinkedList.StriverSDESheet;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        } else if(head.next.next == null){
            ListNode temp = head.next;
            temp.next = head;
            head.next = null;
            head = temp;
            return head;
        }
        ListNode prevTemp = null;
        ListNode temp = head;
        ListNode nextTemp = head.next;
        while(temp != null){
            temp.next = prevTemp;
            prevTemp = temp;
            temp = nextTemp;
            if(nextTemp != null){
                nextTemp = nextTemp.next;
            }
        }
        return prevTemp;
    }
}
