/**
 * Leetcode - remove_nth_node_from_end_of_list
 */
package com.algorithm.problems.remove_nth_node_from_end_of_list;

import com.ciaoshen.leetcode.util.ListNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    ListNode removeNthFromEnd(ListNode head, int n);
}
