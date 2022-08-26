/**
 * Leetcode - swap_nodes_in_pairs
 */
package com.algorithm.problems.swap_nodes_in_pairs;

import com.ciaoshen.leetcode.util.ListNode;

class Solution2 implements Solution {

    @Override
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode node = head.next;
        head.next = swapPairs(head.next.next);
        node.next = head;
        return node;
    }
}
