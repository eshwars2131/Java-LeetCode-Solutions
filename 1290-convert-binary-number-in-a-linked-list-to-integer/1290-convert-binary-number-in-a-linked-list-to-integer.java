class Solution {
    /**
     * Definition for singly-linked list (already provided by LeetCode).
     * public class ListNode { int val; ListNode next; ... }
     */
    public int getDecimalValue(ListNode head) {
        int result = 0;
        while (head != null) {
            result = result * 2 + head.val;
            head = head.next;
        }
        return result;
    }
}
