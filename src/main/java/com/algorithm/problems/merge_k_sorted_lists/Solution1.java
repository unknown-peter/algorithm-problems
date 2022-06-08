/**
 * Leetcode - merge_k_sorted_lists
 */
package com.algorithm.problems.merge_k_sorted_lists;

import com.ciaoshen.leetcode.util.ListNode;

class Solution1 implements Solution {

    @Override
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        int n = lists.length;
        int c = 0;
        boolean[] isDone = new boolean[n];
        ListNode head = new ListNode(-1);
        ListNode p = head;
        // 已经完成的链表数量小于总数，继续遍历
        while (c < n) {
            int index = 0;
            int min = 10001;
            for (int i = 0; i < n; i++) {
                if (!isDone[i]) {
                    // 链表初始即为null，置isDone标记，已完成计数c加1
                    if (lists[i] == null) {
                        isDone[i] = true;
                        c++;
                        continue;
                    }
                    // 记录最小值及最小值所在的链表index
                    if (lists[i].val < min) {
                        index = i;
                        min = lists[i].val;
                    }
                }
            }
            // 已有遍历最小值
            if (min != 10001) {
                p.next = new ListNode(min);
                p = p.next;
                // 最小值所在的链表向后移动一位
                lists[index] = lists[index].next;
                // 如果移动之后节点为null，则该链表遍历完成，置isDone标记，已完成计数c加1
                if (lists[index] == null) {
                    isDone[index] = true;
                    c++;
                }
            }
        }
        return head.next;
    }
}
