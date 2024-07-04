package DailyQuestionsCrackCode.July3rd2024;

import DailyQuestionsCrackCode.GenericClasses.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 */

public class ReverseLinkedList {
    static ListNode reverseList(ListNode head) {
        ListNode temp = null;
        ListNode temp2 = null;
        while(head != null){
            temp2 = head.next;
            head.next = temp;
            temp = head;
            head = temp2;
        }
        head = temp;
        return head;
    }
}
