/**
 * Leetcode - swap_nodes_in_pairs
 */
package com.algorithm.problems.swap_nodes_in_pairs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ciaoshen.leetcode.util.ListNode;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    ListNode swapPairs(ListNode head);
}
