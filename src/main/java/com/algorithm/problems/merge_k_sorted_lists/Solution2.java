/**
 * Leetcode - merge_k_sorted_lists
 */
package com.algorithm.problems.merge_k_sorted_lists;

import com.ciaoshen.leetcode.util.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution2 implements Solution {

    /**
     * 所有链表节点的值取出放到list中，对list排序再放入链表
     */
    @Override
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        List<Integer> valList = new ArrayList<>();
        for (ListNode node : lists) {
            while (node != null) {
                valList.add(node.val);
                node = node.next;
            }
        }
        Collections.sort(valList);

        ListNode head = new ListNode(-1);
        ListNode p = head;
        for (Integer val : valList) {
            p.next = new ListNode(val);
            p = p.next;
        }
        return head.next;
    }
}
