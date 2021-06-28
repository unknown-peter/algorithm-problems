/**
 * Leetcode - implement_stack_using_queues
 */
package com.algorithm.problems.implement_stack_using_queues;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    Object[] stackOperate(String[] operate, int[][] data);
}
