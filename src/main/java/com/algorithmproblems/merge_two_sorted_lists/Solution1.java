/**
 * Leetcode - merge_two_sorted_lists
 */
package com.algorithmproblems.merge_two_sorted_lists;

import com.ciaoshen.leetcode.util.ListNode;


class Solution1 implements Solution {

    @Override
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode me = new ListNode(0);
        ListNode p = me;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                p.next = l2;
                l2 = l2.next;
            } else if (l2 == null) {
                p.next = l1;
                l1 = l1.next;
            } else {
                if (l1.val < l2.val) {
                    p.next = l1;
                    l1 = l1.next;
                } else {
                    p.next = l2;
                    l2 = l2.next;
                }
            }
            p = p.next;
        }
        return me.next;
    }

}
