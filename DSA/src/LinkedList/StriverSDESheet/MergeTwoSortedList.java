package LinkedList.StriverSDESheet;

public class MergeTwoSortedList {

    // TC -> O(N+M) and SC -> TC -> O(N+M)
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i = list1;
        ListNode j = list2;

        if(i == null && j == null){
            return i;
        } else if(i == null && j != null){
            return j;
        } else if(i != null && j == null){
            return i;
        }
        ListNode head = null;
        ListNode tail = null;

        if(i.val == j.val){
            head = i;
            tail = i;
            i= i.next;
        } else if(i.val < j.val){
            head = i;
            tail = i;
            i= i.next;
        } else if(i.val > j.val){
            head = j;
            tail = j;
            j= j.next;

        }

        while(i != null && j != null){
            if(i.val == j.val){
                tail.next = i;
                i= i.next;

                tail = tail.next;
            } else if(i.val < j.val){
                tail.next = i;
                i= i.next;

                tail = tail.next;
            } else if(i.val > j.val){
                tail.next = j;
                j= j.next;

                tail = tail.next;
            }
        }
        if(i!= null){
            tail.next = i;
        }
        if(j != null){
            tail.next = j;
        }
        return head;

    }

}
