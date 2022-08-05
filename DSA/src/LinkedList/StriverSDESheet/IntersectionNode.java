package LinkedList.StriverSDESheet;

import java.util.HashMap;

public class IntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Integer> map = new HashMap<>();
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA != null){
            map.put(tempA, 1);
            tempA = tempA.next;
        }
        while(tempB != null){
            if(map.containsKey(tempB)){
                return tempB;
            }
        }

        return new ListNode(0);
    }
}
