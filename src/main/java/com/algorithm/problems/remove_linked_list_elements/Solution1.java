/**
 * Leetcode - remove_linked_list_elements
 */
package com.algorithm.problems.remove_linked_list_elements;

import com.ciaoshen.leetcode.util.ListNode;

class Solution1 implements Solution {

    @Override
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode p = newHead;

        while (p.next != null) {
            if (p.next.val == val) p.next = p.next.next;
            else p = p.next;
        }
        return newHead.next;
    }

}
