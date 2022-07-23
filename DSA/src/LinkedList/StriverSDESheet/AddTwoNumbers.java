package LinkedList.StriverSDESheet;

public class AddTwoNumbers {
    ListNode head = null;
    ListNode tail = null;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        while(l1 != null && l2!=null){
            int sum = l1.val+l2.val+carry;
            carry = 0;
            if(sum%10 == sum){
                addToList(sum);
            } else {
                int digit = sum%10;
                carry = sum/10;
                addToList(digit);
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        if(l1 != null && carry != 0){
            while(l1 != null){
                int sum = l1.val+carry;
                carry = 0;
                if(sum%10 == sum){
                    addToList(sum);
                } else {
                    int digit = sum%10;
                    carry = sum/10;
                    addToList(digit);
                }
                l1 = l1.next;
            }
        } else if(l1 != null && carry == 0){
            tail.next = l1;
        }

        if(l2 != null && carry != 0){
            while(l2 != null){
                int sum = l2.val+carry;
                carry = 0;
                if(sum%10 == sum){
                    addToList(sum);
                } else {
                    int digit = sum%10;
                    carry = sum/10;
                    addToList(digit);
                }
                l2 = l2.next;
            }
        } else if(l2 != null && carry == 0){
            tail.next = l2;
        }

        if(carry == 1){
            addToList(carry);
        }

        return head;
    }

    public void addToList(int val){
        ListNode node = new ListNode(val);
        if(head == null && tail == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        tail = node;
    }
}
