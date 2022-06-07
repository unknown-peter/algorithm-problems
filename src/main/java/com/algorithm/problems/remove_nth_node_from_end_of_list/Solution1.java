/**
 * Leetcode - remove_nth_node_from_end_of_list
 */
package com.algorithm.problems.remove_nth_node_from_end_of_list;

import com.ciaoshen.leetcode.util.ListNode;

class Solution1 implements Solution {

    /**
     * 链表前增加dummy节点并使用双指针，快指针先向后移动n，然后快慢指针同时向后移动，当快指针到达末尾时，此时慢指针指向的节点即为倒数第n个的前一个节点
     * 将倒数第n个节点的前一个节点指向倒数第n个节点后即可删除倒数第n个节点
     */
    @Override
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i < n; i++) fast = fast.next;
        // 指针向后移动n到达末尾，则n为链表长度，倒数第n为第一个节点，返回从第二个节点起始的链表
        if (fast.next == null) return head.next;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

}
