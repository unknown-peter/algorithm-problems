/**
 * Leetcode - merge_k_sorted_lists
 */
package com.algorithm.problems.merge_k_sorted_lists;

import com.ciaoshen.leetcode.util.ListNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    ListNode mergeKLists(ListNode[] lists);
}
