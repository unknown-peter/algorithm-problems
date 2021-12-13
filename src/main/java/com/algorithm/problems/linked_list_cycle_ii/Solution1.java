/**
 * Leetcode - linked_list_cycle_ii
 */
package com.algorithm.problems.linked_list_cycle_ii;

import com.ciaoshen.leetcode.util.ListNode;

class Solution1 implements Solution {

    @Override
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow.equals(fast)) break;
        }
        if (fast == null || fast.next == null) return null;
        slow = head;
        while (!slow.equals(fast)) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
