/**
 * Leetcode - merge_k_sorted_lists
 */
package com.algorithm.problems.merge_k_sorted_lists;

import com.ciaoshen.leetcode.util.ListNode;

class Solution5 implements Solution {

    /**
     * 使用分治方法两两合并链表
     */
    @Override
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        int interval = 1;
        while (interval < lists.length) {
            for (int i = 0; i + interval < lists.length; i = i + interval * 2) {
                lists[i] = mergeTwoLists(lists[i], lists[i + interval]);
            }
            interval *= 2;
        }
        return lists[0];
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
