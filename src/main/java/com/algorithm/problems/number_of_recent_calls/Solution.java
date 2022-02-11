/**
 * Leetcode - number_of_recent_calls
 */
package com.algorithm.problems.number_of_recent_calls;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    Integer[] recentCounterOperate(String[] operate, int[][] data);
}
