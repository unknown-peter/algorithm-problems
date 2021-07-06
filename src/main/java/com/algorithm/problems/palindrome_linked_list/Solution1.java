/**
 * Leetcode - palindrome_linked_list
 */
package com.algorithm.problems.palindrome_linked_list;

import com.ciaoshen.leetcode.util.ListNode;

class Solution1 implements Solution {

    @Override
    public boolean isPalindrome(ListNode head) {
        ListNode obv = head;
        ListNode rev = null;

        while (obv != null) {
            ListNode p = new ListNode(obv.val);
            p.next = rev;
            rev = p;
            obv = obv.next;
        }

        while (rev != null && head != null) {
            if (rev.val != head.val) return false;
            rev = rev.next;
            head = head.next;
        }
        return true;
    }
}
