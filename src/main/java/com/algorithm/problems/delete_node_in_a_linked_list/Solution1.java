/**
 * Leetcode - delete_node_in_a_linked_list
 */
package com.algorithm.problems.delete_node_in_a_linked_list;

import com.ciaoshen.leetcode.util.ListNode;

class Solution1 implements Solution {

    @Override
    public void deleteNode(ListNode node) {
        while (node.next != null) {
            node.val = node.next.val;
            if (node.next.next == null) node.next = null;
            else node = node.next;
        }
    }
}
