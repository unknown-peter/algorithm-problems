/**
 * Leetcode - kth_largest_element_in_a_stream
 */
package com.algorithm.problems.kth_largest_element_in_a_stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    Integer[] streamOperate(String[] operate, int k, int[][] data);
}
