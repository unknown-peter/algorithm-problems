/**
 * Leetcode - middle_of_the_linked_list
 */
package com.algorithm.problems.middle_of_the_linked_list;

import com.ciaoshen.leetcode.util.ListNode;

class Solution2 implements Solution {

    @Override
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
