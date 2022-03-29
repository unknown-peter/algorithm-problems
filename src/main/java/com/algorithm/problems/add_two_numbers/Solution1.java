/**
 * Leetcode - add_two_numbers
 */
package com.algorithm.problems.add_two_numbers;

import com.ciaoshen.leetcode.util.ListNode;

class Solution1 implements Solution {

    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode(-1);
        ListNode node = head;
        while (l1 != null || l2 != null) {
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;
            int sum = carry + v1 + v2;
            carry = sum / 10;

            node.next = new ListNode(sum % 10);
            node = node.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) node.next = new ListNode(carry);
        return head.next;
    }
}
