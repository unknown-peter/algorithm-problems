/**
 * Leetcode - palindrome_linked_list
 */
package com.algorithm.problems.palindrome_linked_list;

import com.ciaoshen.leetcode.util.ListNode;

import java.util.Stack;

class Solution2 implements Solution {

    @Override
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode node = head;

        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }

        while (head != null) {
            if (head.val != stack.pop()) return false;
            head = head.next;
        }
        return true;
    }
}
