/**
 * Leetcode - linked_list_cycle
 */
package com.algorithm.problems.linked_list_cycle;

import com.ciaoshen.leetcode.util.ListNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    boolean hasCycle(ListNode head);
}
