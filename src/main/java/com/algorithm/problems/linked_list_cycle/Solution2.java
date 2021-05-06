/**
 * Leetcode - linked_list_cycle
 */
package com.algorithm.problems.linked_list_cycle;

import com.ciaoshen.leetcode.util.ListNode;

class Solution2 implements Solution {

    /**
     * 快慢指针，如果链表有环则指针会相遇
     */
    @Override
    public boolean hasCycle(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head;
        while (fastNode != null && fastNode.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if (slowNode == fastNode) return true;
        }
        return false;
    }
}
