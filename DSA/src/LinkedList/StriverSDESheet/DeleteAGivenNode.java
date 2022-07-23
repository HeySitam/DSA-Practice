package LinkedList.StriverSDESheet;

public class DeleteAGivenNode {
    public void deleteNode(ListNode node) {
        ListNode i = node;
        ListNode j = node.next;
        leftShift(i,j);
        i.next = j.next;
    }

    public void leftShift(ListNode i, ListNode j){
        i.val = j.val;
    }
}
