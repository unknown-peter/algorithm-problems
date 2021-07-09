/**
 * Leetcode - palindrome_linked_list
 */
package com.algorithm.problems.palindrome_linked_list;

import com.ciaoshen.leetcode.util.ListNode;

class Solution4 implements Solution {

    /**
     * 快慢指针遍历链表，快指针走完时慢指针正好到中间位置。
     * 反转后半部分链表，比较慢指针后半部分和前半部分是否相等
     */
    @Override
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = slow.next;
        while (rev.next != null) {
            ListNode tmp = rev.next;
            rev.next = tmp.next;
            tmp.next = slow.next;
            slow.next = tmp;
        }
        ListNode pre = head;
        while (slow.next != null) {
            if (pre.val != slow.next.val) return false;
            pre = pre.next;
            slow = slow.next;
        }
        return true;
    }
}
