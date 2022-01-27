/**
 * Leetcode - middle_of_the_linked_list
 */
package com.algorithm.problems.middle_of_the_linked_list;

import com.ciaoshen.leetcode.util.ListNode;

class Solution1 implements Solution {

    @Override
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode node = head;
        while (node != null) {
            count++;
            node = node.next;
        }

        int i = 0;
        node = head;
        while (node != null) {
            if (i == count / 2) return node;
            i++;
            node = node.next;
        }
        return null;
    }
}
