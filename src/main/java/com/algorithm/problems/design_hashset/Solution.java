/**
 * Leetcode - design_hashset
 */
package com.algorithm.problems.design_hashset;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    Boolean[] hashsetOperate(String[] operate, int[][] data);
}
