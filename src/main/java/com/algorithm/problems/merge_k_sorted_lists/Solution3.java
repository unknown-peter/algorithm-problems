/**
 * Leetcode - merge_k_sorted_lists
 */
package com.algorithm.problems.merge_k_sorted_lists;

import com.ciaoshen.leetcode.util.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution3 implements Solution {

    /**
     * 使用优先队列存储每个链表首节点，每次取出优先队列顶端链表节点即为当前各链表首节点最小值，然后再将该节点下一节点存入优先队列
     */
    @Override
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(n -> n.val));
        for (ListNode node : lists) {
            if (node != null) queue.add(node);
        }

        ListNode head = new ListNode(-1);
        ListNode p = head;
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            p.next = new ListNode(node.val);
            p = p.next;
            node = node.next;
            if (node != null) queue.add(node);
        }
        return head.next;
    }
}
