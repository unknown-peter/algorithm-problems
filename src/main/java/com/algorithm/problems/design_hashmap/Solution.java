/**
 * Leetcode - design_hashmap
 */
package com.algorithm.problems.design_hashmap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    Integer[] hashmapOperate(String[] operate, int[][] data);
}
