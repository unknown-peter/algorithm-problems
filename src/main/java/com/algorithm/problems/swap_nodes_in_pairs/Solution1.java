/**
 * Leetcode - swap_nodes_in_pairs
 */
package com.algorithm.problems.swap_nodes_in_pairs;

import com.ciaoshen.leetcode.util.ListNode;

class Solution1 implements Solution {

    @Override
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy;
        while (p.next != null && p.next.next != null) {
            ListNode tmp = p.next;
            p.next = p.next.next;
            tmp.next = p.next.next;
            p.next.next = tmp;
            p = p.next.next;
        }
        return dummy.next;
    }
}
