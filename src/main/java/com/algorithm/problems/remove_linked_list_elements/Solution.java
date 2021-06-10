/**
 * Leetcode - remove_linked_list_elements
 */
package com.algorithm.problems.remove_linked_list_elements;

import com.ciaoshen.leetcode.util.ListNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    ListNode removeElements(ListNode head, int val);
}
