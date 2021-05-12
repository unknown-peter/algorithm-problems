/**
 * Leetcode - intersection_of_two_linked_lists
 */
package com.algorithm.problems.intersection_of_two_linked_lists;

import com.ciaoshen.leetcode.util.ListNode;

class Solution1 implements Solution {

    @Override
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode nodeA = headA;
        while (nodeA != null) {
            ListNode nodeB = headB;
            while (nodeB != null) {
                if (nodeA == nodeB) return nodeA;
                else nodeB = nodeB.next;
            }
            nodeA = nodeA.next;
        }
        return null;
    }
}
