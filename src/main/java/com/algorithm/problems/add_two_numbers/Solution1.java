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
        int tmp;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                tmp = l2.val + carry;
                l2 = l2.next;
            } else if (l2 == null) {
                tmp = l1.val + carry;
                l1 = l1.next;
            } else {
                tmp = l1.val + l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            }

            node.next = new ListNode(tmp % 10);
            node = node.next;
            carry = tmp / 10;
        }
        if (carry > 0) node.next = new ListNode(carry);
        return head.next;
    }
}
