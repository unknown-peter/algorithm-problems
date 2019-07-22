/**
 * Leetcode - remove_duplicates_from_sorted_list
 */
package com.algorithmproblems.remove_duplicates_from_sorted_list;

import com.ciaoshen.leetcode.util.ListNode;

class Solution2 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

}
