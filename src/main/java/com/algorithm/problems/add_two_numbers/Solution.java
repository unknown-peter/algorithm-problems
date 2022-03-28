/**
 * Leetcode - add_two_numbers
 */
package com.algorithm.problems.add_two_numbers;

import com.ciaoshen.leetcode.util.ListNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    ListNode addTwoNumbers(ListNode l1, ListNode l2);
}
