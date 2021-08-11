/**
 * Leetcode - moving_average_from_data_stream
 */
package com.algorithm.problems.moving_average_from_data_stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    Double[] dataStreamOperate(String[] operate, int[][] data);
}
