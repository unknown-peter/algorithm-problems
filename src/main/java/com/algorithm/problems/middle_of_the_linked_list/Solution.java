/**
 * Leetcode - middle_of_the_linked_list
 */
package com.algorithm.problems.middle_of_the_linked_list;

import com.ciaoshen.leetcode.util.ListNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    ListNode middleNode(ListNode head);
}
