/**
 * Leetcode - remove_duplicates_from_sorted_list
 */
package com.algorithmproblems.remove_duplicates_from_sorted_list;

import com.ciaoshen.leetcode.util.ListNode;

class Solution1 implements Solution {

    @Override
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;

        ListNode p = head, node = p;
        while (p != null) {
            if (node.val != p.val) {
                node.next = p;
                node = p;
            }
            p = p.next;
        }
        node.next = null;
        return head;
    }

}
