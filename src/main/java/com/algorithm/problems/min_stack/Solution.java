/**
 * Leetcode - min_stack
 */
package com.algorithm.problems.min_stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    Integer[] stackOperate(String[] operate, int[][] data);
}
