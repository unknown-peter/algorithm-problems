/**
 * Leetcode - merge_two_sorted_lists
 */
package com.algorithmproblems.merge_two_sorted_lists;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ciaoshen.leetcode.util.ListNode;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    public ListNode mergeTwoLists(ListNode l1, ListNode l2);
}
