/**
 * Leetcode - reverse_linked_list
 */
package com.algorithm.problems.reverse_linked_list;

import com.ciaoshen.leetcode.util.ListNode;

class Solution2 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
