/**
 * Leetcode - implement_queue_using_stacks
 */
package com.algorithm.problems.implement_queue_using_stacks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    Object[] queueOperate(String[] operate, int[][] data);
}
