/**
 * Leetcode - intersection_of_two_linked_lists
 */
package com.algorithm.problems.intersection_of_two_linked_lists;

import com.ciaoshen.leetcode.util.ListNode;

class Solution3 implements Solution {

    /**
     * 两个list分别从头遍历，当到达末尾时跳到另一list遍历
     * 如果有交叉将会在交叉处跳出循环，如果没有交叉则会在遍历完两个list之后跳出循环
     */
    @Override
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode nodeA = headA;
        ListNode nodeB = headB;
        while (nodeA != nodeB) {
            nodeA = (nodeA != null) ? nodeA.next : headB;
            nodeB = (nodeB != null) ? nodeB.next : headA;
        }
        return nodeA;
    }
}
