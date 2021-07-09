/**
 * Leetcode - palindrome_linked_list
 */
package com.algorithm.problems.palindrome_linked_list;

import com.ciaoshen.leetcode.util.ListNode;

import java.util.Stack;

class Solution3 implements Solution {

    /**
     * 快慢指针遍历链表，遍历时存储慢指针val到栈。
     * 快指针走完时慢指针正好到中间位置，比较慢指针后半部分和出栈的是否相等
     */
    @Override
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        Stack<Integer> stack = new Stack<>();
        ListNode fast = head;
        ListNode slow = head;
        stack.push(head.val);
        while (fast.next != null && fast.next.next != null) {
            stack.push(slow.next.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        // 快指针遍历后下一节点为null，链表节点为奇数个，出栈去掉中间的节点
        if (fast.next == null) stack.pop();
        while (slow.next != null) {
            if (slow.next.val != stack.pop()) return false;
            slow = slow.next;
        }
        return true;
    }
}
