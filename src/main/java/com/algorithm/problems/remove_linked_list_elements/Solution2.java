/**
 * Leetcode - remove_linked_list_elements
 */
package com.algorithm.problems.remove_linked_list_elements;

import com.ciaoshen.leetcode.util.ListNode;

class Solution2 implements Solution {

    @Override
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return (head.val == val) ? head.next : head;
    }
}
