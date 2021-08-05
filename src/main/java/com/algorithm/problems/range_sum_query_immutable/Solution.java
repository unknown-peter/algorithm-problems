/**
 * Leetcode - range_sum_query_immutable
 */
package com.algorithm.problems.range_sum_query_immutable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    Integer[] numArrayOperate(String[] operate, int[][] data);
}
