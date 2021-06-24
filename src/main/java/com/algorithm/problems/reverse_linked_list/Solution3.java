/**
 * Leetcode - reverse_linked_list
 */
package com.algorithm.problems.reverse_linked_list;

import com.ciaoshen.leetcode.util.ListNode;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}
