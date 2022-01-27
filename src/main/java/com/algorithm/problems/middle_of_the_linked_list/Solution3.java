/**
 * Leetcode - middle_of_the_linked_list
 */
package com.algorithm.problems.middle_of_the_linked_list;

import com.ciaoshen.leetcode.util.ListNode;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public ListNode middleNode(ListNode head) {
        ListNode[] A = new ListNode[100];
        int t = 0;
        while (head != null) {
            A[t++] = head;
            head = head.next;
        }
        return A[t / 2];
    }
}
