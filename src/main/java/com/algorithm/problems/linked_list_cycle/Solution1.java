/**
 * Leetcode - linked_list_cycle
 */
package com.algorithm.problems.linked_list_cycle;

import com.ciaoshen.leetcode.util.ListNode;

import java.util.HashSet;
import java.util.Set;

class Solution1 implements Solution {

    @Override
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        Set<ListNode> set = new HashSet<>();
        ListNode node = head;
        while (node != null) {
            if (set.contains(node)) {
                return true;
            } else {
                set.add(node);
            }
            node = node.next;
        }
        return false;
    }
}
