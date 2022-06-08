/**
 * Leetcode - merge_k_sorted_lists
 */
package com.algorithm.problems.merge_k_sorted_lists;

import com.ciaoshen.leetcode.util.ListNode;

class Solution4 implements Solution {

    /**
     * 将k个链表两两比较进行排序合并
     */
    @Override
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        if (lists.length == 1) return lists[0];

        ListNode node = mergeTwoLists(lists[0], lists[1]);
        for (int i = 2; i < lists.length; i++) {
            node = mergeTwoLists(node, lists[i]);
        }
        return node;
    }

    private ListNode mergeTwoLists(ListNode node1, ListNode node2) {
        if (node1 == null) return node2;
        if (node2 == null) return node1;

        ListNode head = new ListNode(-1);
        ListNode p = head;
        while (node1 != null && node2 != null) {
            if (node1.val < node2.val) {
                p.next = new ListNode(node1.val);
                p = p.next;
                node1 = node1.next;
            } else {
                p.next = new ListNode(node2.val);
                p = p.next;
                node2 = node2.next;
            }
        }
        if (node1 == null) p.next = node2;
        if (node2 == null) p.next = node1;
        return head.next;
    }
}
