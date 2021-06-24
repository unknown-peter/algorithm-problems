/**
 * Leetcode - reverse_linked_list
 */
package com.algorithm.problems.reverse_linked_list;

import com.ciaoshen.leetcode.util.ListNode;

class Solution1 implements Solution {

    @Override
    public ListNode reverseList(ListNode head) {
        ListNode p = head;
        ListNode postNode = null;
        while (p != null) {
            ListNode tmp = new ListNode(p.val);
            tmp.next = postNode;
            postNode = tmp;
            p = p.next;
        }
        return postNode;
    }
}
