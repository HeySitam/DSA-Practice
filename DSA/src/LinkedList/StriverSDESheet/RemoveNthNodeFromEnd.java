package LinkedList.StriverSDESheet;

public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        int size = getSize(head);
        int idxToDelete = size - n;
        int cnt = 0;
        ListNode pre = null;
        ListNode curr = head;
        ListNode next = head.next;
        while(cnt != idxToDelete){
            pre = curr;
            curr = next;
            if(next != null)
                next = next.next;
            cnt++;
        }

        if(pre != null)
            pre.next = next;
        else return next;

        return head;
    }

    public int getSize(ListNode head){
        int cnt = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            cnt++;
        }

        return cnt;
    }
}
