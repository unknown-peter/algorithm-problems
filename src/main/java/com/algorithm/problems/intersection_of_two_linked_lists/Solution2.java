/**
 * Leetcode - intersection_of_two_linked_lists
 */
package com.algorithm.problems.intersection_of_two_linked_lists;

import com.ciaoshen.leetcode.util.ListNode;

class Solution2 implements Solution {

    /**
     * 两个list向后对齐，依次比较对应位置ListNode是否相等
     */
    @Override
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode nodeA = headA;
        ListNode nodeB = headB;
        int listALength = getLength(headA);
        int listBLength = getLength(headB);
        if (listALength > listBLength) {
            for (int i = 0; i < listALength - listBLength; i++) nodeA = nodeA.next;
        } else if (listBLength > listALength) {
            for (int i = 0; i < listBLength - listALength; i++) nodeB = nodeB.next;
        }
        while (nodeA != null && nodeB != null && nodeA != nodeB) {
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        return nodeA;
    }

    private int getLength(ListNode node) {
        if (node == null) return 0;

        int i = 0;
        ListNode pt = node;
        while (pt != null) {
            pt = pt.next;
            i++;
        }
        return i;
    }
}
