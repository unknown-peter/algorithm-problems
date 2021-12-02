/**
 * Leetcode - lru_cache
 */
package com.algorithm.problems.lru_cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    Integer[] lruOperate(String[] operate, int[][] data);
}
