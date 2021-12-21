/**
 * Leetcode - find_pivot_index
 */
package com.algorithm.problems.find_pivot_index;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int pivotIndex(int[] nums);
}
